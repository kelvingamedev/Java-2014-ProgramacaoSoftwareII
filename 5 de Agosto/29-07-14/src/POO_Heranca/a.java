package POO_Heranca;

/**
 * Adicionar ao projeto a classe "a" esta classe devera ter um parametro
 * e e f, e deve retornar o resultado da soma de e e f em g. A classe
 * herança principal devera imprimir o resultado de g
 *
 * @author Anderson Araujo
 */
public class a {
//classe avó
    protected int e, f, g;

    public  a(int e, int f) {
        
        this.e = e;
        this.f = f;
        g = e + f;
    }
}
