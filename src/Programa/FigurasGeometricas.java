package Programa;

import Controlador.ControladorFiguras;
import java.sql.SQLException;
import java.util.Scanner;

public class FigurasGeometricas {

    static ControladorFiguras controladoraFiguras;

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws SQLException {

        controladoraFiguras = ControladorFiguras.GetInstance();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura geometrica:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        int figura = scanner.nextInt();;

        switch (figura) {
            case 1:
                System.out.println("Medida de un lado del cuadrado:");
                float lado = scanner.nextFloat();

                System.out.println("Superficie del cuadrado: " + controladoraFiguras.calcularSuperficieCuadrado(lado));

                System.out.println("Perimetro del cuadrado: " + controladoraFiguras.calcularPerimetroCuadrado(lado));
                break;
            case 2:
                System.out.println("Triangulo - Medidas de los lados");
                System.out.println("Lado 1:");
                float lado1 = scanner.nextFloat();
                System.out.println("Lado 2:");
                float lado2 = scanner.nextFloat();
                System.out.println("Base:");
                float base = scanner.nextFloat();

                System.out.println("Superficie del triangulo: " + controladoraFiguras.calcularSuperficieTriangulo(lado1, lado2, base));
                System.out.println("Perimetro del triangulo: " + controladoraFiguras.calcularPerimetroTriangulo(lado1, lado2, base));
                System.out.println("Altura del triangulo: " + controladoraFiguras.calcularAlturaTriangulo(lado1, lado2, base));
                break;
             case 3:
                System.out.println("Círculo - Radio:");
                float radio = scanner.nextFloat();
                
                System.out.println("Superficie del círculo: " + controladoraFiguras.calcularSuperficieCirculo());
                System.out.println("Perímetro del círculo: " + controladoraFiguras.calcularPerimetroCirculo());
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }

}
