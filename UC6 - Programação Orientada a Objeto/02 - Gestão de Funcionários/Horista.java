
package exercicio2_uc6;


public class Horista extends Funcionario {
    
    private double valorHora;
    private double horaTrabalhada;
    
    public Horista(String nome, String cpf, String endereco, String telefone, String setor, double valorHora, double horaTrabalhada){
        super(nome, cpf, endereco,telefone,  setor);
        
        this.valorHora = valorHora;
        this.horaTrabalhada = horaTrabalhada;
        
  
    }
      public double getValorHora(){
          return valorHora;
      }
      
      public void setValorHora(double valorHora){
          this.valorHora = valorHora;
      }
      
      public double getHoraTrabalhada(){
          return horaTrabalhada;
      }
      
      public void setHoraTrabalhada(double horaTrabalhada){
          this.horaTrabalhada = horaTrabalhada;
      }
      
      @Override
      public double calcularPagamento(){
          return horaTrabalhada * valorHora;
      }
      
      @Override
      public void aplicarAumento(double porcentagem){
          this.valorHora = this.valorHora + (this.valorHora * (porcentagem / 100));
      }
}