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
public abstract class Regressor {
    
    private String nomePreditor;
    
    private double alpha;
    private double beta;
    
    public Regressor(String nomePreditor){
        this.nomePreditor = nomePreditor;
    }
    
    public abstract void regredir(ArrayList<Exemplo> exemplos);
    
    public abstract double prever(double x);
    
    public void setNomePreditor(String nomePreditor){
        this.nomePreditor = nomePreditor;
    }
    
    public String getNomePreditor(){
        return nomePreditor;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }
    
    public String toString(){
        return this.nomePreditor + " -> y = " + this.alpha + "x" + " + " + this.beta; 
    }
    
}
