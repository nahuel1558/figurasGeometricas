package Modelo;

import Interfaz.ICalcularFigura;

public class Circulo implements ICalcularFigura {

    private Float radio;

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
    public float calcularSuperficie() {
        return (float) (Math.PI * radio * radio);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * radio);
    }

}
