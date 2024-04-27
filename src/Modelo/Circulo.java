package Modelo;

import Interfaz.ICalcularFigura;

public class Circulo implements ICalcularFigura {

    private float radio;

    public Circulo() {
    }

    public Circulo(Float radio) {
        this.radio = radio;
    }

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularSuperficie(Object e) {
        Circulo circulo = (Circulo) e;
        return (float) (Math.PI * circulo.getRadio() * circulo.getRadio());
    }

    @Override
    public float calcularPerimetro(Object e) {
        Circulo circulo = (Circulo) e;
        return (float) (2 * Math.PI * circulo.getRadio());
    }

}
