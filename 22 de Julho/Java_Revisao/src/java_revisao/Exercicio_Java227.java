

package java_revisao;
//Faça um sistema java que:
//Leia 10 nomes e que toda vez que encontrar 1 
// Nome Josè , este deverá ser impresso 3 vezes 
// na tela do computador.
import javax.swing.JOptionPane;


public class Exercicio_Java227 {
   
    public static void main(String[] args) {
       String nome;
       int i;
       for ( int cont=1;cont<=10;cont++){
       nome =JOptionPane.showInputDialog("Digite o nome " +cont);
       i=0;
       if(nome.equals("João") ){ 
           while( i<3 ){
           JOptionPane.showMessageDialog(null,nome);
           i++;
         }
       }    
    }
     
    }
  }
