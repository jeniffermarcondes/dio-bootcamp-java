package edu.jeniffer.metodosjava;

/*
  EXERCÍCIO
  Crie uma aplicação que resolva as seguintes situações:
  -Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
  -A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde, Boa noite
  -Calcule o valor final de um empréstimo, a partir do valor solicitado.
  Taxas e parcelar influenciam. 
  Defina arbitrariamente as faixas que influenciam nos valores

  Obs:
  -Tente ai máximo criar métodos que trabalhem sozinhos ou em conjunto
  -Pode chamar um método dentro de outro
  -Pode passar como parâmetro, a chamada de um outro método
  */

public class Ex1_Main {
  public static void main(String[] args) {

    // Calculadora
    System.out.println("Exercício calculadora");
    Ex1_Calculadora.soma(3, 6);
    Ex1_Calculadora.subtracao(9, 1.8);
    Ex1_Calculadora.multiplicacao(7, 8);
    Ex1_Calculadora.divisao(5, 2.5);

    // Mensagem
    System.out.println("Exercício mensagem");
    Ex1_Mensagem.obterMensagem(9);
    Ex1_Mensagem.obterMensagem(14);
    Ex1_Mensagem.obterMensagem(1);

    // Empréstimo
    System.out.println("Exercício empréstimo");
    Ex1_Emprestimo.calcular(1000, Ex1_Emprestimo.getDuasParcelas());
    Ex1_Emprestimo.calcular(1000, Ex1_Emprestimo.getTresParcelas());
    Ex1_Emprestimo.calcular(1000, 5);

  }

}
