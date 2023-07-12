package com.derio.first.learnjava.Aula02;

/**
 * @author Derio Matheus
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Cadeira c1 = new Cadeira();
        c1.serrar();
        c1.lixar();
        c1.setCor("Azul");
        c1.pintar();
        System.out.println("Cor atual: "+c1.getCor());
         */

        Aluno a1 = new Aluno("Derio");
        a1.setTelefone("0303950");
        a1.setMatricula("0034506");

        Aluno a2 = new Aluno("Pedro");
        a2.setTelefone("2222222222");
        a2.setMatricula("00000002");

        a1.ImprimeDados();
        System.out.println("\n");
        a2.ImprimeDados();

        double media = Aluno.Media(5, 15);
        System.out.println("Média: " + media);
    }
}
