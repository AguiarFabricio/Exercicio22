/*Escreva um algoritmo para calcular e mostrar a média aritmética dos números
inteiros entre 1 e 1000 usando while.*/
package exercicio22;

import javax.swing.JOptionPane;

public class Exercicio22 {

    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        int contador = 0;

        while (i <= 1000) {
            soma += i;
            contador++;
            i++;
        }

        double media = (double) soma / contador;
        JOptionPane.showMessageDialog(null,"A média dos números é: " + media);
    }
}
