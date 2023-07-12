package com.derio.first.learnjava.Aula04;

public class Conta {

    int numero;
    private String nome;
    private int saldo;
    double limite;
    public double setSaldo;
    private double setsaca;
    private double deposita;

    public int setDeposita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double getsaca() {
        return getSetsaca();
    }

    public void setsaca(double saca) {
        this.setSetsaca(saca);
    }

    public double getDeposita() {
        return deposita;
    }

    public void setDeposita(double deposita) {
        this.deposita = deposita;
    }

    public double getSetsaca() {
        return setsaca;
    }

    public void setSetsaca(double setsaca) {
        this.setsaca = setsaca;
    }
}
