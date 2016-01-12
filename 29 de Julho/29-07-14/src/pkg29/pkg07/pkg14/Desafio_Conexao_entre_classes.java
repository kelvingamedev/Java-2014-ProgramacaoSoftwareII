

package pkg29.pkg07.pkg14;

import javax.swing.JOptionPane;


public class Desafio_Conexao_entre_classes {
    public void metodo_impressao(String s)
    {
        JOptionPane.showMessageDialog(null, s);
    }
    
    public String metodo_leitura()
    {
        String s = JOptionPane.showInputDialog("Digite o nome");
        return s;
    }
    
    public String soma(int n1, int n2)
    {   
        
        int n3 = n1 + n2;
        String s = String.valueOf(n3);
        return s;
    }
    
}
