

package exercicio1_uc6;


public class PacoteViagem {
    
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;
    
    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias){
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }
    
    public double calcularTotalHospedagem(){
        return this.quantidadeDias * this.hospedagem.getValorDiaria();
    }
    
    public double calcularLucro(double valorOriginal, double margemPorcentagem){
        double valorDoLucro = valorOriginal * (margemPorcentagem / 100);
        return valorOriginal + valorDoLucro;
    }
    public double calcularTotalPacote(double margemLucro, double taxasAdicionais){
     double valorBase = this.transporte.getValor() + this.calcularTotalHospedagem()+taxasAdicionais;
     return this.calcularLucro(valorBase, margemLucro);
 
    }
    
}
