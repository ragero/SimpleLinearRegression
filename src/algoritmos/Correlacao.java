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
public class Correlacao extends Regressor{

    public Correlacao() {
        super("Correlacao");
    }

    @Override
    public void regredir(ArrayList<Exemplo> exemplos) {
        double mediaX = 0;
        double mediaY = 0;
        
        for(Exemplo ex : exemplos){
            mediaX += ex.getValorAtributo();
            mediaY += ex.getValorSaida();
        }
        
        mediaX = mediaX / exemplos.size();
        mediaY = mediaY / exemplos.size();
        
        double numerador = 0;
        double denominador = 0;
        for(Exemplo ex : exemplos){
            numerador += (ex.getValorAtributo() - mediaX) * (ex.getValorSaida() - mediaY);
            denominador += Math.pow((ex.getValorAtributo() - mediaX), 2);
        }
        this.setAlpha(numerador/denominador);
        this.setBeta(mediaY - this.getAlpha() * mediaX);
        
    }

    public double prever(double x){
        double y = this.getAlpha() * x + this.getBeta();
        return y;
    }
    
}
