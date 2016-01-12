package Revisao.Array;

import javax.swing.JOptionPane;

/**
 *
 * @author Anderson Araujo
 */
public class Array {

    public static void main(String[] args) {

        String a[] = new String[10];
        //Declaração de um Array Uni-Dimensional(vetor)

        String b[][] = new String[2][3];
        //Array Multi-Dimensional(Matriz)
        //Quanto maior, mais complexo e difícil a busca por dados

        a[0] = "Maria";
        a[1] = "José";

        //Posição do Array é sempre o tamanho menos 1, pois o contador inicia-se do 0
        //A maneira usual de trabalhar com o Array é com o uso do For
        //O contador (inicia no 0), e roda até preencher todos os espaços do array
        //A variável contadora, quando declarada dentro do for, só pode ser utilizada no mesmo
        //Ou seja, não há problema em criar outra variável cont em outro for
        for (int cont = 0; cont < 10; cont++) {
            a[cont] = JOptionPane.showInputDialog("Nomes");
        }

        for (int cont = 0; cont < 10; cont++) {
            JOptionPane.showMessageDialog(null, a[cont]);
        }

    }
}
