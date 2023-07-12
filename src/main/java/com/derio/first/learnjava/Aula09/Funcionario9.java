package com.derio.first.learnjava.Aula09;

/**
 * @author Derio Matheus
 */
public class Funcionario9 {

    private int Matricula;
    private String Nome;
    private Departamento9 Dep;

    public Funcionario9() {
    }

    public Funcionario9(int Matricula, String Nome) {
        this.Matricula = Matricula;
        this.Nome = Nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Departamento9 getDep() {
        return Dep;
    }

    public void setDep(Departamento9 Dep) {
        this.Dep = Dep;
    }

}
