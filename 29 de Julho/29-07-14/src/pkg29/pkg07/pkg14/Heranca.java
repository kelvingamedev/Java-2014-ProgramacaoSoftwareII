

package pkg29.pkg07.pkg14;

import javax.swing.JOptionPane;

 class Heranca extends Heranca_principal{
    
     protected int d;
     
     public Heranca(int e, int f, int l1, int l2, int l3, int l4)
     {
        super(e,f, l1, l2, l3 );
        this.d = l4;
        //O método construtor pode ter mias parâmetros do que o criado na classe pai/mãe
        //Esta é uma característica peculiar da herança
     }
     public void print(){
       JOptionPane.showMessageDialog(null,"E = "+ e +"F = "+ f 
               + "l1: "+a + "\nL2: "+ b + "\nL3: "+c + "\n L4"+ d);     
}
 }

 



        

