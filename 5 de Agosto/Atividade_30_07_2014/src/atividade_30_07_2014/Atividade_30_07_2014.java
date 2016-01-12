package atividade_30_07_2014;

import javax.swing.JOptionPane;

/**
 *
 * @author Anderson Araujo
 */
public class Atividade_30_07_2014 {

    public static void main(String[] args) {
        Imprimi_soma obj = new Imprimi_soma();
        String texto;
        double num1 = 20, num2 = 30;
       texto =  JOptionPane.showInputDialog(null, "Entre com o texto desejado: ","?", JOptionPane.QUESTION_MESSAGE);
        obj.imprimi(texto);
       
        obj.imprimi(num1, num2);
    }
/*
    uma forma de converter string em inteiros ou doubles 
    é usar o método 
    
    String.valueof(variavel aqui)
    
    um exemplo de uso abaixo
    
    int a = 123;
    String texto;
    
    texto = String.valueof(a); //agora esta convertido e sera usado como string
    
    
    */
}
