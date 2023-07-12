package com.derio.first.learnjava.Aula05;

import javax.swing.JOptionPane;

/**
 * @author derio
 * Assunto de Vari�veis
 */
public class DeriioConta {

    public float x, y;

    public DeriioConta(float bx, float by) { // sempre omita o valor de retorno.
        this.x = bx;
        this.y = by;
    }

    void move(float fx, float fy) {
        this.x += fx;
        this.y += fy;
    }

    void mostra() {
        JOptionPane.showMessageDialog(null, "(" + this.x + "," + this.y + ")");
    }

    static class principal {

        public static void main(String args[]) {
            DeriioConta ap;
            ap = new DeriioConta((float) 2.0, (float) 1.0);
            ap.mostra();
            ap.move(1, 2);
        }
    }
}
