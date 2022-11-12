package edu.jeniffer.metodosjava;

/*
 EXERCÍCIO
 Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis.
 Agora faça os métodos retornarem valores.
 */

public class Ex3_Main {
    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Ex3_Quadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Ex3_Quadrilatero.area(5, 5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Ex3_Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }

}
