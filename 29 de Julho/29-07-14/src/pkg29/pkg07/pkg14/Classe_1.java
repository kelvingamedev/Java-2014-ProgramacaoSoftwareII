package pkg29.pkg07.pkg14;

import javax.swing.JOptionPane;

public class Classe_1 {
    public void MetodoSemPassagem(){
        String a = "Etec";
        String b = "JK";
        String c = a+b;
        print(c);
        
    }
    
    public void print(String impressao){
        JOptionPane.showMessageDialog(null,""
                + ""+ impressao);
    }
}
