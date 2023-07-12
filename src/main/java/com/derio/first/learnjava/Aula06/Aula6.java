package com.derio.first.learnjava.Aula06;

/**
 * @author Gilberto Toledo
 */
public class Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno6 A1 = new Aluno6("Gilberto Toledo", "111");

        Aluno6 A2 = new Aluno6();
        A2.setNome("Lucas");
        A2.setMatricula("222");

        System.out.println(A1.getNome() + "\n " + A1.getMatricula());
        System.out.println(A2.getNome() + "\n " + A2.getMatricula());
    }
}
