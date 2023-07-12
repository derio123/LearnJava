package com.derio.first.learnjava.Aula02;

/**
 *
 * @author Derio Matheus
 */
public class Aluno {

    private String nome;
    private String telefone;
    private String matricula;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void ImprimeDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Matricula: " + this.getMatricula());
    }

    public static double Media(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

}
