package com.derio.first.learnjava.Aula09;

import java.util.ArrayList;

/**
 * @author Gilberto Toledo
 */
public class Departamento9 {

    private int Codigo;
    private String Nome;
    ArrayList<Funcionario9> ListaFunc;

    public Departamento9() {
        ListaFunc = new ArrayList();
    }

    public Departamento9(int Codigo, String Nome) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        ListaFunc = new ArrayList();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Funcionario9> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Funcionario9> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }

    public void addFunc(Funcionario9 F) {
        F.setDep(this);
        ListaFunc.add(F);
    }
}
