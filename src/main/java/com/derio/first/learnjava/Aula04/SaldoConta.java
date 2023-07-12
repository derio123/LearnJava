package com.derio.first.learnjava.Aula04;

class SaldoConta {

    int numero;
    Conta c1;
    Conta c2;
    double deposita;
    double saldo;

    static class MovContaCorrente {

        public static void main(String[] args) {
            Conta c1 = new Conta(); //O operador carrega para mem�ria o endere�o de refer�ncia do valor carregado.
            c1.setDeposita = 300;  // muda o valor da  conta
            Conta c2 = c1;
            c2.setDeposita = 100;
            System.out.println(c1.setDeposita);
            System.out.println(c2.setDeposita);

        }
    }
}
