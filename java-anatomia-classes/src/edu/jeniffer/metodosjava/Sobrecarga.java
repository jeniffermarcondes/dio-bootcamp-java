package edu.jeniffer.metodosjava;

/*
 CONCEITO
 É a capacidade de definir métodos para diferentes contextos,
 mas preservando seu nome.

 CRIAÇÃO
 Alterar a assinatura do método:
 Ass = nome + parâmetros

 converterParaInteiro (float f);
 converterParaInteiro (double d);
 converterParaInteiro (String s);
 converterParaInteiro (float f, RoundType rd);
 converterParaInteiro (double d, RoundType rd);
 converterParaInteiro (String s, RoundType rd);

 converterParaInteiro (RoundType rd, String s); - se muda a sequencia é outra sobrecarga
 converterParaInteiro ();

 Obs: mudou a lista de parâmetros e manteve o nome do método foi criado outra sobrecarga

 Sobrecarga x Sobrescrita
 Sobrecarga: Manter o nome do método e mudar a lista de parâmetros
 Sobrescrita: Herança
 
 */

public class Sobrecarga {
    public static void main(String[] args) {
        System.out.println();
    }

}
