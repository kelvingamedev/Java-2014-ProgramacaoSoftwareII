package POO_Heranca;

/**
 *
 * @author Anderson Araujo
 */
public class Heranca_principal extends a{

   protected int a, b, c;
//classe mãe
    public Heranca_principal(int l1, int l2, int l3, int l5,int l6) {
        super(l5, l6);//observe a assinatura deste construtor em relação a classe "a"
        this.a = l1;
        this.b = l2;
        this.c = l3;
    }
}
