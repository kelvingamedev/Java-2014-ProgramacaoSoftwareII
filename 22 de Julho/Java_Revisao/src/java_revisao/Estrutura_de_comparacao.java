package java_revisao;


import javax.swing.JOptionPane;


 
public class Estrutura_de_comparacao {
    public static void main (String args[]){
    //Estrutura de comparação if
     String a= JOptionPane.showInputDialog(""
             + "Valor de entrada");
     String c;
     if(a.equals("José")){
     c = "Alexandre "+ a;
      } else if (a.equals("Pedro")){
      c= "Manoel "+ a;
       } else {
      c= "Beatriz "+a;
      }
     
     JOptionPane.showMessageDialog(null, c);
     
     //----------------------------------------------------------------------
     //Estrutura de comparação switch
     
     int b= Integer.parseInt(
     JOptionPane.showInputDialog("Dado inteiro "));
     String d;
     switch (b) {
         case 1:
             d ="valor 1 ";
         break;
         case 2:
             d ="valor 2 ";
             break;
         default:
             d="qualquer valor ";
             
     }
     JOptionPane.showMessageDialog(null, d);
        
    }
}
