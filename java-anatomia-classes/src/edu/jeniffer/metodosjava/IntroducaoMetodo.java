package edu.jeniffer.metodosjava;

/*
 CONCEITO
 É uma porção de código (sub-rotina) que é disponibilizada por uma classe.
 Este é executado quando é feita uma requisição a ele.
 São responsáveis por definir e realizar um determinado comportamento.


 DEFINIÇÃO
 Padrão: (entre ?? são opcionais/fora obrigatórios)
 <?visibilidade?><?tipo?><?modificador?>retorno 
 nome (<?parâmetros?>) <?exceções?> corpo

 onde:
 V: "public", "protect" ou "private"*
 T: concreto ou abstrato
 M: "static" ou "final"
 R: tipo de dado ou "void"*
 N: nome que é fornecido ao método*
 P: parâmetros que pode receber*
 E: exceções que pode lançar
 C: código que possui ou vazio*
 * mais utilizados
 
 exemplos:
 public String getNome(){...}
 public double calcularTotalNota(){...}
 public int verificarDistancia(int coordenada1, int coordenada2){...}
 public abstract void executar();
 public void alterarFabricante(Fabricante fabricante){...}
 public Relatorio gerarDadosAnaliticos(Cliente cliente, List<Compra>compras) {...}

 public static Retorno Nome(Parâmetros){corpo}

 UTILIZAÇÃO
 Passa-se uma mensagem através de uma classe ou objeto

 Nome_da_classe.nome_do_metodo(); ou Nome_da_classe.nome_do_metodo(...);
 nome_do_objeto.nome_do_metodo(); ou nome_do_objeto.nome_do_metodo(...);

 Math.random(); ou Math.sqrt(4);
 usuario.getEmail(); ou usuario.alterarEndereco(endereco);

 PARTICULARIDADES
 Assinatura: é a forma de identificar unicamente o método 
 Ass = nome + parâmetros
 Método:
 public double calcularTotalVenda (double precoItem1, double precoItem2, double precoItem3){...}
 Assinatura:
 calcularTotalVenda (double precoItem1, double precoItem2, double precoItem3)

 Construtor (cria objetos) e Destrutor(auxilia na destruição de objetos): são os métodos especiais usados na 
 Orientação a Objetos

 Mensagem: é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a 
 uma classe

 Passagem de parâmetros:
 Por valor (cópia)
 ex:
 int i = 10;
 public void fazerAlgo (int i){
    i = i + 10;
    System.out.println("Valor de i dentro: " + i);
 } 
 System.out.println("Valor de i fora: " + i);}

 Por referência (endereço)

 BOAS PRÁTICAS
 Nomes devem ser descritivos, mas curtos
 Notação camelo: verificarSaldo(); executarTransferencia(...); existeDebito();
 Usar verbos e substantivos - Evitar artigos e preposições
 Deve possuir entre 80 e 120 linhas
 Evite lista de parêmetros longas
 Visibilidade adequadas

 
 */

public class IntroducaoMetodo {
    public static void main(String[] args) {
        System.out.println();
    }

}
