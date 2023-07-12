package com.derio.first.learnjava.Aula10;

/**
 *
 * @author Derio Matheus
 */
public class Funcionario10 {

    private String Matricula;
    private String Nome;
    private String CPF;

    public Funcionario10() {
    }

    public Funcionario10(String Matricula, String Nome, String CPF) {
        this.Matricula = Matricula;
        this.Nome = Nome;
        this.CPF = CPF;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
