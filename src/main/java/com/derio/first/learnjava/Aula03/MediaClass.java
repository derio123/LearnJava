package com.derio.first.learnjava.Aula03;

import java.text.DecimalFormat; // classe DecimalFormat est� no pacote JAVAX.SWING
import javax.swing.JOptionPane; // classe JOptionPane

/**
 * @author derio Assunto While
 */

public class MediaClass { //defini��o de classe

    public static void main(String[] args) {
        int escolha;
        double notasLidas;
        double media;
        double total;
        double alunos;
        double valorNota;
        String quantidade;
        String nota;
        String continua;
        String exibir;
        escolha = 1;
        while (escolha != 0) { //condic�o se for verdadeira
            total = 0;
            notasLidas = 2;

            quantidade = JOptionPane.showInputDialog("Qual o N�mero de Alunos?<entre com a n�mero inteira>:");
            alunos = Double.parseDouble(quantidade); //A classe double com metodo parseDouble converte seu argumento string em um n�mero Real,
            //ou seja, um n�mero com casas decimais.
            while (notasLidas <= alunos) {
                nota = JOptionPane.showInputDialog("entre com a Nota:");
                valorNota = Double.parseDouble(nota);
                total = +valorNota;
                notasLidas++;
            }
            media = total / alunos;
            DecimalFormat mostraDecimal = new DecimalFormat("0");
            exibir = ("A M � d i a d a C l a s s e �:") + mostraDecimal.format(media);
            JOptionPane.showMessageDialog(null, exibir, "Media da Classe", JOptionPane.INFORMATION_MESSAGE);
            continua = JOptionPane.showInputDialog("Efetuar outro C�lculo?<0=Sair/1=Continuar>");
            escolha = Integer.parseInt(continua);
        }
        System.exit(0);
    }
}
