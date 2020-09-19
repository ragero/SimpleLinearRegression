/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas;

/**
 *
 * @author rafael
 */
public class Exemplo {
    
    private double valorAtributo;
    private double valorSaida;

    public Exemplo(double valorAtributo, double valorSaida) {
        this.valorAtributo = valorAtributo;
        this.valorSaida = valorSaida;
    }

    public Exemplo() {
        this.valorAtributo = 0;
        this.valorSaida = 0;
    }

    public double getValorAtributo() {
        return valorAtributo;
    }

    public void setValorAtributo(double valorAtributo) {
        this.valorAtributo = valorAtributo;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(double valorSaida) {
        this.valorSaida = valorSaida;
    }
    
    
    
    
}