package com.derio.first.learnjava.Aula04;

public class MovContaCorrente extends Conta {

    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.setNome("Duke");
        minhaConta.setSaldo = 1000;
        minhaConta.setsaca(200);
        minhaConta.setDeposita = 2500;
        System.out.println(minhaConta.setSaldo - minhaConta.getSetsaca() + minhaConta.setDeposita);
    }
}
