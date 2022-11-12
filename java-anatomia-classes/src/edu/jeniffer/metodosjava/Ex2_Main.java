package edu.jeniffer.metodosjava;

/*
 EXERCÍCIO
 Crie uma aplicação que calcula a área dos 3 quadriláteros notáveis:
 quadrado, retângulo e trapézio

 Obs: Use sobrecarga
 */

public class Ex2_Main {
    public static void main(String[] args) {

        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        Ex2_Quadrilatero.area(3);
        Ex2_Quadrilatero.area(5d, 5d);
        Ex2_Quadrilatero.area(7, 8, 9);
        Ex2_Quadrilatero.area(5f, 5f);

    }

}
