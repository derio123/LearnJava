package com.derio.first.learnjava.Aula04;

import javax.swing.JOptionPane;

public class Carro {

    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    double quantidade;
    double velocidadeNova;
    Motor motor;

    void liga() {
        System.out.println("O carro est� ligado");
    }

    void acelera(double quantidade) {
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = velocidadeNova;
    }

    int pegaMarcha() {
        if (this.velocidadeAtual < 0);
        return -1;
    }
}

class Fabrica {

    public static void main(String[] args) {
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "HB20";
        meuCarro.velocidadeAtual = 120;
        meuCarro.velocidadeMaxima = 300;
        meuCarro.liga();
        meuCarro.acelera(20);
        JOptionPane.showMessageDialog(null, "A velocidade Atual do carro �: " + meuCarro.velocidadeAtual);
        JOptionPane.showMessageDialog(null, "A Cor do carro �: " + meuCarro.cor);
        JOptionPane.showMessageDialog(null, "O tipo do carro �: " + meuCarro.modelo);
    }
}

class Motor {

    int potencia;
    String tipo;
}
