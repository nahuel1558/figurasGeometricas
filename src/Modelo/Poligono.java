package Modelo;

import Interfaz.ICalcularFigura;

/**
 *
 * @author nahue
 */
public class Poligono implements ICalcularFigura {
    private float cantidadLados;
    private float medidaLado;

    public Poligono(float cantidadLados, float medidaLado) {
        this.cantidadLados = cantidadLados;
        this.medidaLado = medidaLado;
    }

    public float getCantidadLados() {
        return cantidadLados;
    }

    public void setCantidadLados(float cantidadLados) {
        this.cantidadLados = cantidadLados;
    }

    public float getMedidaLado() {
        return medidaLado;
    }

    public void setMedidaLado(float medidaLado) {
        this.medidaLado = medidaLado;
    }

    @Override
    public float calcularSuperficie(Object e) {
        Poligono poligono = (Poligono) e;
        
        return (calcularPerimetro(poligono) * calcularApotema(poligono))/2;
    }

    @Override
    public float calcularPerimetro(Object e) {
        Poligono poligono = (Poligono) e;
        return poligono.getCantidadLados() * poligono.getMedidaLado();
    }
    
    private float calcularApotema(Poligono poligono){
        float anguloCentral = (float) Math.toRadians(360.0 / (2 * poligono.getCantidadLados()));
        
        return (float) (poligono.getMedidaLado() / (2 * Math.tan(anguloCentral)));
    }
    
}
