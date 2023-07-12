package com.derio.first.learnjava.Aula07;

import javax.swing.JOptionPane;

abstract class Forma {

    protected float x, y;

    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    abstract public void mostra();
}

class Ponto extends Forma {

    public Ponto(float ax, float ay) {
        this.x = ax;
        this.y = ay;
    }

    public void mostra() { //implements para mostra.
        JOptionPane.showMessageDialog(null, ("(" + this.x + "," + this.y + ")"));
    }
}

class Retangulo extends Forma {

    protected float dx, dy; //delta x e delta y

    public Retangulo(float ax, float ay, float dx, float dy) {
        x = ax;
        y = ay;
        this.dx = dx;
        this.dy = dy;
    }

    public void move(float dx, float dy) {  //Sobreescrever o m�todo.
        this.x += dx;
        this.y += dy;
        this.dx += dx;
        this.dy += dy;
    }

    public void mostra() { //implementa o metodo mostra.
        System.out.println("(" + this.x + ")(" + this.y + ")(" + dx + "," + dy + ")");
    }
}

public class principal {

    public static void main(String[] args) {
        Retangulo ar = new Retangulo(0, 0, 13, 14);
        ar.mostra();
        ar.move(1, 1);
        ar.mostra();
    }
}
