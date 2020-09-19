/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regressao;

import algoritmos.Correlacao;
import algoritmos.Perceptron;
import algoritmos.Regressor;
import configuracao.ConfiguracaoGeral;
import estruturas.Exemplo;
import formularios.Formulario_Dataset;
import formularios.Formulario_Resultados;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jfree.data.xy.XYSeries;

/**
 *
 * @author rafael
 */
public class Regressao {
    
    public void aprender(ConfiguracaoGeral configuracao){
        
        if(configuracao.isCorrelacao()){
            Correlacao regressor = new Correlacao();
            regressao(regressor,configuracao);
        }
        if(configuracao.isPerceptron()){
            Perceptron regressor = new Perceptron();
            regressao(regressor,configuracao);
        }
     
    }
    
    public void regressao(Regressor regressor, ConfiguracaoGeral configuracao){
        
        regressor.regredir(Formulario_Dataset.getBase());
        
        
        
        try{
            XYSeries series2 = new XYSeries(regressor.toString());
            
            for(double x = Formulario_Dataset.getMinValor();x<=Formulario_Dataset.getMaxValor();x=x+0.01){
                series2.add(x, regressor.prever(x));
            }

            Formulario_Dataset.getDataset().addSeries(series2);
            Formulario_Resultados.getTResultados().append(regressor.toString() + "\n");
            avaliar(regressor);    
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "O resultado para este modelo já está plotado no gráfico.", "Regressão Linear Univariada", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Houve um erro ao gerar/avaliar o modelo preditor.", "Regressão Linear Univariada", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    public void avaliar(Regressor regressor){
        
        ArrayList<Exemplo> exemplos = Formulario_Dataset.getBase();
        
        double rssReg = 0;
        double rssTot = 0;
        double sse = 0;
        
        double mediaY = 0;
        
        for(Exemplo ex : exemplos){
            mediaY += ex.getValorSaida();
        }
        mediaY = mediaY / exemplos.size();
        
        for(Exemplo ex : exemplos){
            rssReg += Math.pow(regressor.prever(ex.getValorAtributo()) - mediaY, 2);
            rssTot += Math.pow(ex.getValorSaida() - mediaY, 2);
            sse += Math.pow(regressor.prever(ex.getValorAtributo())- ex.getValorSaida(), 2);
        }
        
        double r2 = rssReg/rssTot;
        Formulario_Resultados.getTResultados().append("R2 = " + r2 + "\n");
        Formulario_Resultados.getTResultados().append("SSE = " + sse + "\n");
    }
    
}
