/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Interfaz.ICalcularFigura;

/**
 *
 * @author nahue
 */
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
