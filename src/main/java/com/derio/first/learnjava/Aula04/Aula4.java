package com.derio.first.learnjava.Aula04;

/**
 * @author Derio Matheus
 */
public class Aula4 {

    public static void main(String[] args) {
        /*
        if(args.length>0)
            System.out.println(args[0]);
        else
            System.out.println("Nenhum argumento informado!");
         */

        try {
            System.out.println(args[0] + "\n\n");

            double valor = Double.parseDouble(args[0]);
            System.out.println(valor);
        } catch (ArrayIndexOutOfBoundsException eArray) {
            System.out.println("Nenhum argumento informado! ");
        } catch (NumberFormatException eFormato) {
            System.out.println("Valor inválido!");
        } finally {
            try {
                System.out.println(args[0] + "\n\n");

                double valor = Double.parseDouble(args[0]);
            } catch (ArrayIndexOutOfBoundsException e) { //Exception e - Contém uma exceção para o erro
                System.out.println("Ocorreu um problema! ");

            } catch (NumberFormatException e) {
                System.out.println("");
            } finally { //para finaliza o codigo. 
                System.out.println("Obrigado Senhor Jesus!");
            }
        }
    }
}         //ArrayIndexOutOfBoundsException é especifico para erros.  
//+e.getMessage()é array posição 0
                //+e.getCause() vetor é nulo nos argumentos. 
