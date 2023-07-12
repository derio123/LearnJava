package com.derio.first.learnjava.Aula06;

import javax.swing.JOptionPane;

class AceleraCarro {

    void acelerar() {
        JOptionPane.showMessageDialog(null, "...Teste de Acelera��o...");
    }

    class Mclaren extends AceleraCarro {

        void acelerar() {
            JOptionPane.showMessageDialog(null, "...Mclaren em Acelera��o...");
        }
    }

    class Fusion extends AceleraCarro {

        void acelerar() {
            JOptionPane.showMessageDialog(null, "...Fusion Acelerendo...");
        }
    }
}
