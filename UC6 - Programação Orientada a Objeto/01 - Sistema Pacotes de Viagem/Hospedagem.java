

package exercicio1_uc6;


public class Hospedagem {
    
    private String descricao;
    private double valorDiaria;
    
    public Hospedagem(String descricao, double valorDiaria){
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }
    
    public double getValorDiaria(){
        return this.valorDiaria;
        
    }
    
    public String getDescricao(){
        return this.descricao;
        
    }
}
