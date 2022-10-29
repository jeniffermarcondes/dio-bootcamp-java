package edu.jeniffer.logicacondicionalecontroledefluxo;

public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        System.out.println("\n-------------");

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        System.out.println("\n-------------");

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);

        /*
         * Conjunção: operação lógica que só é verdadeira quando ambos os operandos ou
         * expressões envolvidas são verdade
         * Simbologia: &&
         * Terminologia: and(e)
         * 
         * V - V = V
         * V - F = F
         * F - V = F
         * F - F = F
         * 
         * Disjunção: operação que só é falsa quando ambos os operandos ou expressões
         * envolvidas são falsos
         * Simbologia: ||
         * Terminologia: or(ou)
         * 
         * V - V = V
         * V - F = V
         * F - V = V
         * F - F = F
         * 
         * Disjunção excusiva: operação que só é verdade quando ambos os operandos ou
         * expressões são opostos
         * Simbologia: ^
         * Terminologia: xor
         * 
         * V - V = F
         * V - F = V
         * F - V = V
         * F - F = F
         * 
         * Negação: oepração que inverte o valor lógico de um operando ou expressão
         * Simbologia: !
         * Terminologia: inverção
         * 
         * V = F
         * F = V
         * 
         * 
         */

    }

}
