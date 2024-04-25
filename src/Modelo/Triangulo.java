/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Interfaz.ICalcularFigura;
import java.util.Objects;

/**
 *
 * @author nahue
 */
public class Triangulo implements ICalcularFigura {

    public enum TipoTriangulo {
        Equilatero,
        Isosceles,
        Escaleno
    }
    private Float lado1;
    private Float lado2;
    private Float base;
    private Float altura;
    private TipoTriangulo tipoTriangulo;

    public Triangulo(Float lado1, Float lado2, Float base, Float altura, TipoTriangulo tipoTriangulo) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
        this.tipoTriangulo = tipoTriangulo;
    }

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

    public TipoTriangulo getTipoTriangulo() {
        return tipoTriangulo;
    }

    public void setTipoTriangulo(TipoTriangulo tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }

    @Override
    public float calcularSuperficie() {
        float s = (lado1 + lado1 + base) / 2;
        return (float) Math.sqrt(s * (s - lado1) * (s - lado2) * (s - base));
    }

    @Override
    public float calcularPerimetro(Object e) {
        return lado1 + lado2 + base;
    }

    public float calcularAltura(Object e) {
        float area = calcularSuperficie();
        return (2 * area) / base;

    }

    public static Triangulo determinarTipoTriangulo(Triangulo triangulo) {
        if (equilatero(triangulo)) {
            triangulo.setTipoTriangulo(TipoTriangulo.Equilatero);
        } else if (isosceles(triangulo)) {
            triangulo.setTipoTriangulo(TipoTriangulo.Isosceles);
        } else {
            triangulo.setTipoTriangulo(TipoTriangulo.Escaleno);
        }
        return triangulo;
    }

    public static boolean equilatero(Triangulo triangulo) {
        return (Objects.equals(triangulo.getBase(), triangulo.getLado1()) && Objects.equals(triangulo.getBase(), triangulo.getLado2()));
    }

    public static boolean isosceles(Triangulo triangulo) {
        return (Objects.equals(triangulo.getLado1(), triangulo.getLado2()) || Objects.equals(triangulo.getBase(), triangulo.getLado1()) || Objects.equals(triangulo.getBase(), triangulo.getLado2()));
    }
    public float calcularAreaEquilatero() {
        return (float) (Math.sqrt(3) / 4 * Math.pow(lado, 2));
    }

    public float calcularAlturaEquilatero() {
        return (float) (Math.sqrt(3) / 2 * lado);
    }
    
     public float calcularAreaIsosceles() {
        float altura = calcularAltura();
        return (base * altura) / 2;
    }

    public float calcularAlturaIsosceles() {
        return (float) Math.sqrt(Math.pow(lado, 2) - (Math.pow(base, 2) / 4));
    }
    
    public float calcularAreaEscaleno() {
        float s = calcularSemiperimetro();
        return (float) Math.sqrt(s * (s - lado1) * (s - lado2) * (s - base));
    }

    public float calcularAlturaEscaleno() {
        float area = calcularArea();
        return (2 * area) / base;
    }

    public float calcularSemiperimetroEscaleno() {
        return (lado1 + lado2 + base) / 2;
    }
}
