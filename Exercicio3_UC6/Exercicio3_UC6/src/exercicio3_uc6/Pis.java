
package exercicio3_uc6;


public class Pis implements Imposto {
   private double debito;
   private double credito;

    public Pis(double debito, double credito) {
        this.debito = debito;
        this.credito = credito;
    }
    @Override
    public double calcularImposto(){
        return(this.debito - this.credito) * 0.0165;
    }
    @Override
    public String getDescricao(){
        return "Pis";
    }
    
}
