package Controlador;

import Modelo.Circulo;
import Modelo.Cuadrado;
import Modelo.Triangulo;
import java.sql.SQLException;

public class ControladorFiguras {

    private ControladorFiguras() {
    }
    private static ControladorFiguras Instance;

    public static ControladorFiguras GetInstance() throws SQLException {
        if (Instance == null) {
            Instance = new ControladorFiguras();
        }
        return Instance;
    }

    public float calcularSuperficieCuadrado(float lado) {
        Cuadrado cuadrado = new Cuadrado(lado);
        float superficie = cuadrado.calcularSuperficie(cuadrado);

        return superficie;
    }

    public float calcularPerimetroCuadrado(float lado) {
        Cuadrado cuadrado = new Cuadrado(lado);
        float perimetro = cuadrado.calcularPerimetro(cuadrado);
        return perimetro;
    }

    public float calcularSuperficieTriangulo(float lado1, float lado2, float base) {
        Triangulo triangulo = new Triangulo(lado1, lado2, base);
        
        return triangulo.calcularSuperficie(triangulo);
    }

    public float calcularPerimetroTriangulo(float lado1, float lado2, float base) {
       Triangulo triangulo = new Triangulo(lado1, lado2, base);
        float  perimetro = triangulo.calcularPerimetro(triangulo);
        return perimetro;
    }
    
    public float calcularAlturaTriangulo(float lado1, float lado2, float base){
        Triangulo triangulo = new Triangulo(lado1, lado2, base);
        float  altura = triangulo.calcularAltura(triangulo);
        return altura;
    }

    public float calcularSuperficieCirculo(float radio) {
        Circulo circulo = new Circulo(radio);
        float superficie = circulo.calcularSuperficie(circulo);
        return superficie;
        
    }

    public float calcularPerimetroCirculo(float radio) {
        Circulo circulo = new Circulo(radio);
        float perimetro = circulo.calcularPerimetro(circulo);
        return perimetro;
    }
    
}
