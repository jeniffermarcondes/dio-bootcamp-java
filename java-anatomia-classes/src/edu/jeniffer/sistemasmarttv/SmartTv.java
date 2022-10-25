package edu.jeniffer.sistemasmarttv;

/*Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
Ela tenha as características: ligada (boolean), canal (int) e volume (int);
Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.*/

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        // volume = volume + 1
        volume++;

    }

    public void diminuirCanal() {
        // volume = volume - 1
        volume--;

    }

    public void aumentarVolume() {
        // volume = volume + 1
        volume++;
    }

    public void diminuirVolume() {
        // volume = volume - 1
        volume--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}
