package com.derio.first.learnjava.Aula03;

import java.util.ArrayList;

/**
 *
 * @author Derio Matheus
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*int valor = 5;
        int valores[] = new int[10];
        valores[0] = 5;
        valores[1] = 30;
        
        double valor_d = 10.9;
        
        boolean maior_de_idade = true;
        
        String nome = "Derio Matheus";
        //char nomec[] = new char[20];
        
        String nome2 = "Dério Matheus";
        
        if(nome.equals(nome2)){
            System.out.println("Nomes iguais");
        }else{
            System.out.println("Nomes diferentes");
        }
        
        ArrayList<String> lista = new ArrayList();
        lista.add("Derio");
        lista.add("lucas");
        lista.add("Paulo");
        
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }*/
        ArrayList<Aluno> ListaAlunos = new ArrayList();

        Aluno a1 = new Aluno();
        a1.setNome("Derio");
        a1.setMatricula("001");
        a1.setTelefone("99999999");
        ListaAlunos.add(a1);

        Aluno a2 = new Aluno();
        a2.setNome("Lucas");
        a2.setMatricula("002");
        a2.setTelefone("888888888");
        ListaAlunos.add(a2);

        Aluno a3 = new Aluno("Paulo", "003", "777777777");
        ListaAlunos.add(a3);

        ListaAlunos.add(new Aluno("Bruno", "004", "66666666"));

        for (int i = 0; i < ListaAlunos.size(); i++) {
            //System.out.println(ListaAlunos.get(i).getDados());

            Aluno temp = ListaAlunos.get(i);
            System.out.println(temp.getDados());
        }
    }

}
