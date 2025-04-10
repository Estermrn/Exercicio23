package com.mycompany.exercicio23;

import javax.swing.JOptionPane;

public class Exercicio23 {

    public static void main(String[] args) {

        int soma = 0;
        int numIn = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número inicial: "));
        int numFi = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número final: "));

        int i = numIn;
        while (i <= numFi) {

            soma = soma + i;
            i++;
        }

        JOptionPane.showMessageDialog(null, "A soma do número inicial " + numIn + " com o número final " + numFi + " é " + soma);

    }
}
