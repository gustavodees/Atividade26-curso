package principal;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para calcular o seu fatorial"));
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
         fatorial *= i;

        }
        JOptionPane.showMessageDialog(null, "Fatorial de " + fatorial);

    }
}