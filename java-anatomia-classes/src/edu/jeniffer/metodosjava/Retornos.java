package edu.jeniffer.metodosjava;

/*
 RELEMBRANDO
 -É uma instrução de interrupção
 -Simbologia: return

 FUNCIONAMENTO
 O método executa seu retorno quando:
 -Completa todas sua instruções internas
 -Chega a uma declaração explicita de retorno
 -Lança uma exceção (erro)

 CONSIDERAÇÕES
 -O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto;
 -O tipo de dado do return deve ser compatível com o do método;
 -Se o método for sem retorno(void), pode ou não ter um "return" para encerrar sua execução

 EXEMPLOS
 public String getMensagem(){ return "Olá"; }
 public double getJuros(){return 2.36;}
 public int getParcelas(){return 1.36f;} - ERRO: método pede inteiro mas o retorno é float
 public void setIdade(){return 10;} - ERRO: se o método é void não pode retornar nenhum valor (poderia ser return;/return 10 não pode)
 public void executar(){... return;...}
 */

public class Retornos {
    public static void main(String[] args) {
        System.out.println();
    }

}
