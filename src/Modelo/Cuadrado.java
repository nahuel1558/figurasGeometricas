
package Modelo;

import Interfaz.ICalcularFigura;


public class Cuadrado implements ICalcularFigura {
    private Float lado;

    public Cuadrado() {
    }

    public Cuadrado(Float lado) {
        this.lado = lado;
    }

    public Float getLado() {
        return lado;
    }

    public void setLado(Float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularSuperficie() {
       return lado * lado;
    }

    @Override
    public float calcularPerimetro() {
       return 4 * lado;
    }
    
   
}
