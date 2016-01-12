
package java_revisao;

import javax.swing.JOptionPane;


public class Estrutura_de_repeticao {
    public static void main(String args[]){
    
       
        for (int cont=0; cont<100; cont+=10){
            JOptionPane.showMessageDialog(null,"conto "+cont);
 //   No for utiliza-se uma contagem definida com a variavél contadora inicializada , a condição 
            // que o laço se repete e a instruçao para chegar nesse limite 
        }
       int cont=0;
        while (cont<7){
        JOptionPane.showMessageDialog(null,"Rodo" +cont);
        if (cont == -5)
        {
            JOptionPane.showMessageDialog(null,"Tchau");
            break;
        }
       cont-=1;
             
    }
        
       //inicio do..while
        do{
            JOptionPane.showMessageDialog(null, ""
                    + "Passa pelo menos uma vez"+ cont);
            cont++;
        }while (cont<4);
  }
}
