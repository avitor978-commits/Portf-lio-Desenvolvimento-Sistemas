
package exercicio1_uc6;


public class Transporte {
    
    private String tipo;
    private double valor;
    
    public Transporte(String tipo, double valor){
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public double getValor(){
        return this.valor;
    }
    
}
