package com.derio.first.learnjava.Aula03;

public class ExSwitch {

    public static void main(String args[]) {
        int diaDaSemana = 1;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Ter�a");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("S�bado");
                break;
            default:
                System.out.println("Este n�o � um dia v�lido");
        }
    }
}
