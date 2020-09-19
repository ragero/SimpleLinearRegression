/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import estruturas.Exemplo;
import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class Perceptron extends Regressor{

    private double taxaAprendizado;
    private int numMaxIteracoes;
    private double difMinima;
    private double maxX;
    private double maxY;
    
    public Perceptron(){
        super("Perceptron");
        this.taxaAprendizado = 0.01;
        this.numMaxIteracoes = 10000;
        this.difMinima = 0.0001;
        maxX = Double.MIN_VALUE * -1;
        maxY = Double.MIN_VALUE * -1;
    }
    
    @Override
    public void regredir(ArrayList<Exemplo> exemplos) {
        double alpha = 0;
        double beta = 0;
        
        //Pegando o menor valor para padronizar os dados
        for(Exemplo ex : exemplos){
            if(ex.getValorAtributo() > maxX){
                maxX = ex.getValorAtributo();
            }
            if(ex.getValorSaida() > maxY){
                maxY = ex.getValorSaida();
            }
        }
        
        boolean sair = false;
        int numIteracoes = 1;
        while(sair == false){
            double acmErro = 0;
            double erro;
            for(Exemplo ex : exemplos){
                double acmValor = 0;
                acmValor = ex.getValorAtributo()/maxX * alpha;
                acmValor += beta;
                
                erro = ex.getValorSaida()/maxY - acmValor;
                
                alpha = alpha + taxaAprendizado * erro * ex.getValorAtributo()/maxX;
                beta = beta + taxaAprendizado * erro;
                
                acmErro += Math.abs(erro);
                
            }
            
            acmErro = acmErro / exemplos.size();
            
            System.out.println("ACMERRO: " + acmErro);
            
            if(acmErro < difMinima){
                sair = true;
            }
                
            numIteracoes++;
            if(numIteracoes == numMaxIteracoes){
                sair = true;
            }
        }
        
        
        this.setAlpha(alpha);
        this.setBeta(beta);
    }

    @Override
    public double prever(double x) {
        double y = this.getAlpha() * x/maxX + this.getBeta();
        return y * maxY;
    }
    
}
