

package java_revisao;

import javax.swing.JOptionPane;


public class Comando_entrada_saida { 
 public static void main (String args[]){
 //-----------------------------------------------------------------------------------------        
        //comando de impressão( modo console )
        String a= "Alunos";
        System.out.println("Bem Vindos" + a);
        //comando de impressão ( caixa de mensagem) 
        // É necessario fazer a importação do método 
        JOptionPane.showMessageDialog(null,"Bem Vindos " + a);
 //-----------------------------------------------------------------------------------------

        //Comando para leitura de dados(Input)
        //armazena o resultado em variável do 
        //Tipo texto (String)
        a = JOptionPane.showInputDialog("Texto im"
                + "presso na caixa de texto");
        
        JOptionPane.showMessageDialog(null,"Bem vindos " + a);
        
        //fazer a conversão dos dados para armazenar 
        //em variáveis de tipos diferentes
 //-----------------------------------------------------------------------------------------
        
        float b = Float.parseFloat( JOptionPane.showInputDialog("texto"));
        
        JOptionPane.showMessageDialog(null, "Imprimindo o ponto flutuante "+ b);
        
 //-----------------------------------------------------------------------------------------
                
        
}   
}
