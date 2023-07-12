import java.io.PrintStream;

public class ProgramaSecreto{

  static void main(String[] paramArrayOfString) {

    System.out.println("*** Programa super secreto *** \n");

    if ((paramArrayOfString.length > 0) && (paramArrayOfString[0].equals("POO"))){
      System.out.println("POO eh uma disciplica mutcho legalz :) \n");
    }

    if((paramArrayOfString.length > 1) && (paramArrayOfString[1].equals("contar"))){
      System.out.println("Contando!!! \n");
      for (int i = 0; i < 10; i++) {
        System.out.println(String.valueOf(i) + "\n");
      }}}}
