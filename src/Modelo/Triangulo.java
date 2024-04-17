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
public class Triangulo implements ICalcularFigura {
    
    private Float lado1;
    private Float lado2;
    private Float base;
    private Float altura;

    public Triangulo() {
    }

    public Triangulo(Float lado1, Float lado2, Float base) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
    }

    public Triangulo(Float lado1, Float lado2, Float base, Float altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    public Float getLado1() {
        return lado1;
    }

    public void setLado1(Float lado1) {
        this.lado1 = lado1;
    }

    public Float getLado2() {
        return lado2;
    }

    public void setLado2(Float lado2) {
        this.lado2 = lado2;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularSuperficie() {
        float s = (lado1 + lado1 + base) / 2;
        return (float) Math.sqrt(s * (s - lado1) * (s - lado2) * (s - base));
    }

    @Override
    public float calcularPerimetro() {
        return lado1 + lado2 + base;
    }
    
     public float calcularAltura(){
        float area = calcularSuperficie();
        return (2 * area) / base;
        
    }
}
