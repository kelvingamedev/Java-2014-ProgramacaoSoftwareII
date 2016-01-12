/*Adicionar ao projeto a classe "a", esta deverá ter um construtor, com 2 parâmetros
'e' e 'f', e deve retornar o resultado da soma de 'e' e 'f' em 'g'. A classe
Herança principal deverá imprimir o resultado de g.*/
package pkg29.pkg07.pkg14;

public class a {
    protected int e,f, g;
    
    a(int e, int f)
    {
        this.e = e;
        this.f = f;
        this.g = this.e + this.f;
    }
    
}
