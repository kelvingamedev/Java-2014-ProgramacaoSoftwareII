package pkg29.pkg07.pkg14;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Revisao_Java {
   
    public static void comparametro(String a){
        System.out.println(a);
    }
    public static void main(String[] args){
     /*   semparametro();
        comparametro("valor");*/
        
        Desafio_Conexao_entre_classes classe = new Desafio_Conexao_entre_classes();
        String s = classe.metodo_leitura();
        classe.metodo_impressao(s);
        
        int n1,n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Qual é o valor do primeiro número?"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Qual é o valor do segundo número?"));

        
       
        
        s= classe.soma(n1, n2);
        classe.metodo_impressao(s);
    }
    public static void semparametro(){
        System.out.println("Sem passagem de parâmetro");
        Classe_1 c = new Classe_1();
        c.MetodoSemPassagem();
    }
}
