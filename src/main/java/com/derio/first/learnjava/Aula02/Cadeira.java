package com.derio.first.learnjava.Aula02;

/**
 *
 * @author Derio Matheus
 */
public class Cadeira {
    private double altura;
    private double altura_assento;
    private String cor;
    
    public Cadeira(){
        cor = "Marrom";
        altura = 0.50;
        altura_assento = 1.20;
    }
    
    public void serrar(){
        System.out.println("Serrando a madeira...");
    }
    
    public void lixar(){
        System.out.println("Lixando a madeira...");
    }
    
    public void pintar(){
        System.out.println("Pintando a madeira...");
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String c){
        if(c.equals("Verde") || c.equals("Vermelho"))
            cor = c;
        else
            System.out.println("Não há tinta na cor desejada!");
    }
}
