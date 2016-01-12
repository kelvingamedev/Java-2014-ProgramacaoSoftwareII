package atividade_30_07_2014;

import javax.swing.JOptionPane;

/**
 *
 * @author Anderson Araujo
 */
public class Imprimi_soma {

    public void imprimi(String var) {
        JOptionPane.showMessageDialog(null, "O Texto é " + var, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private double resultado;

    /**
     *
     * @param num1 substitua o num1 por um uma variavel ou numero double.
     * @param num2 substitua o num2 por um uma variavel ou numero double.
     */
    public void imprimi(double num1, double num2) {
        resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, "A soma é " + resultado, "Resultado", JOptionPane.PLAIN_MESSAGE);

    }
}

