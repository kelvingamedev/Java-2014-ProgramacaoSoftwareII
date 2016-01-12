package POO_Heranca;

import javax.swing.JOptionPane;

/**
 *
 * @author Anderson Araujo
 */
public class Heranca extends Heranca_principal {
//classe filha 
    int d;

    public Heranca(int l4, int l1, int l2, int l3, int l5, int l6) {
        super(l1, l2, l3, l5, l6);
        this.d = l4;
        //O método construtor pode ter mais parametros do que o criado na classe pai/mãe
        //esta é um caracteristica peculiar da herança
    }
//    public void quadrado(int l4){
//        this.d = l4;

//    }
    public void Print() {
        JOptionPane.showMessageDialog(null, "\nL1:" + a + "\nL2: " + b + "\nL3: " + c + "\nL4: " + d + "\nResultado: " + g, ""
                + "Testando Herança", JOptionPane.INFORMATION_MESSAGE);
    }
}
