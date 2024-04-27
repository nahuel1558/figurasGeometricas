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
    public float calcularSuperficie(Object e) {
        Triangulo triangulo = (Triangulo) e;
        triangulo = determinarTipoTriangulo(triangulo);
        float area;
        if (Objects.equals(triangulo.getTipoTriangulo(), TipoTriangulo.Equilatero)) {
            area = calcularAreaEquilatero(triangulo);
        } else if (Objects.equals(triangulo.getTipoTriangulo(), TipoTriangulo.Isosceles)) {
            area = calcularAreaIsosceles(triangulo);
        } else {
            area = calcularAreaEscaleno(triangulo);
        }
        return area;
    }

    @Override
    public float calcularPerimetro(Object e) {
        Triangulo triangulo = (Triangulo) e;
        return (float) triangulo.getLado2() + triangulo.getBase() + triangulo.getLado1();
    }

    public float calcularAltura(Triangulo triangulo) {
        float altura;
        if (Objects.equals(triangulo.getTipoTriangulo(), TipoTriangulo.Equilatero)) {
            altura = calcularAlturaEquilatero(triangulo);
        } else if (Objects.equals(triangulo.getTipoTriangulo(), TipoTriangulo.Isosceles)) {
            altura = calcularAlturaIsosceles(triangulo);
        } else {
            altura = calcularAlturaEscaleno(triangulo);
        }
        return altura;
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

    public float calcularAreaEquilatero(Triangulo triangulo) {
        return (float) (Math.sqrt(3) / 4 * Math.pow(lado1, 2));
    }

    public float calcularAlturaEquilatero(Triangulo triangulo) {
        return (float) (Math.sqrt(3) / 2 * lado1);
    }

    public float calcularAreaEscaleno(Triangulo triangulo) {
        float semiPerimetro = calcularPerimetro(triangulo) / 2;
        return (float) Math.sqrt(semiPerimetro * (semiPerimetro - triangulo.getLado1()) * (semiPerimetro - triangulo.getLado2()) * (semiPerimetro - triangulo.getBase()));
    }

    public float calcularAlturaEscaleno(Triangulo triangulo) {
        return (2 * calcularAreaEscaleno(triangulo)) / triangulo.getBase();
    }

//<editor-fold defaultstate="collapsed" desc=" Metodos Triangulo ISOSCELES ">
    public float calcularAreaIsosceles(Triangulo triangulo) {
        float areaIsosceles;
        if (ladoDiferenteLado2(triangulo)) {
            areaIsosceles = (float) ((float) (triangulo.getLado2() / 4) * Math.sqrt(4 * Math.pow(triangulo.getBase(), 2) - Math.pow(triangulo.getLado2(), 2)));
        } else if (ladoDiferenteLado1(triangulo)) {
            areaIsosceles = (float) ((float) (triangulo.getLado1() / 4) * Math.sqrt(4 * Math.pow(triangulo.getBase(), 2) - Math.pow(triangulo.getLado1(), 2)));
        } else {
            areaIsosceles = (float) ((float) (triangulo.getBase() / 4) * Math.sqrt(4 * Math.pow(triangulo.getLado1(), 2) - Math.pow(triangulo.getBase(), 2)));
        }
        return areaIsosceles;
    }

    public float calcularAlturaIsosceles(Triangulo triangulo) {

        float alturaIsos;
        if (ladoDiferenteLado2(triangulo)) {
            alturaIsos = (float) Math.sqrt(Math.pow(triangulo.getBase(), 2) - (Math.pow(triangulo.getLado2(), 2) / 4));
        } else if (ladoDiferenteLado1(triangulo)) {
            alturaIsos = (float) Math.sqrt(Math.pow(triangulo.getBase(), 2) - (Math.pow(triangulo.getLado1(), 2) / 4));
        } else {
            alturaIsos = (float) Math.sqrt(Math.pow(triangulo.getLado1(), 2) - (Math.pow(triangulo.getBase(), 2) / 4));
        }
        return alturaIsos;
    }

    public static boolean ladoDiferenteLado2(Triangulo triangulo) {
        return Objects.equals(triangulo.getBase(), triangulo.getLado1());
    }

    public static boolean ladoDiferenteLado1(Triangulo triangulo) {
        return Objects.equals(triangulo.getBase(), triangulo.getLado2());
    }
//</editor-fold>

}
