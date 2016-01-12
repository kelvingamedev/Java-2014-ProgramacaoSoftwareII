package pkg29.pkg07.pkg14;

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
        semparametro();
        comparametro("valor");
    }
    public static void semparametro(){
        System.out.println("Sem passagem de parâmetro");
        Classe_1 c = new Classe_1();
        c.MetodoSemPassagem();
    }
}
