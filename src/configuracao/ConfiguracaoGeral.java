/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracao;

/**
 *
 * @author rafael
 */
public class ConfiguracaoGeral {
    
    private boolean Correlacao;
    private boolean Perceptron;

    public ConfiguracaoGeral(){
        setCorrelacao(false);
        setPerceptron(false);
    }
    
    public boolean isCorrelacao() {
        return Correlacao;
    }

    public void setCorrelacao(boolean Correlacao) {
        this.Correlacao = Correlacao;
    }

    public boolean isPerceptron() {
        return Perceptron;
    }

    public void setPerceptron(boolean Perceptron) {
        this.Perceptron = Perceptron;
    }
    
    
    
}
