package metodos;

import javax.swing.JOptionPane;


public class Metodos {

    public static void main(String[] args) {
        sempassagem();
        sempassagem();
        compassagem("Maria");
        compassagem("Ricardo");
   }
    public static void sempassagem() {
        JOptionPane.showMessageDialog(null, "Este método não tem passagem de parâmetros");
    }
    public static void compassagem (String a){
        JOptionPane.showMessageDialog(null, a);
   }
}
