package com.derio.first.learnjava.Aula06;

/**
 * @author Gilberto Toledo
 */
public class Aluno6 {

    private String Nome;
    private String Matricula;

    public Aluno6() {
    }

    public Aluno6(String Nome, String Matricula) {
        this.Nome = Nome;
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public String getNome(boolean pNome) {
        if (pNome) {
            String p[] = this.Nome.split(" ");
            return p[0];
        } else {
            return this.Nome;
        }
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

}
