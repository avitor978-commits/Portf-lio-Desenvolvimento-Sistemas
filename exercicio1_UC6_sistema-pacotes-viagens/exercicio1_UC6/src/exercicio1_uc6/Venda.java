
package exercicio1_uc6;

public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;

   
    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }

    
    public double converterDolarParaReal(double valorDolar, double cotacao) {
        return valorDolar * cotacao;
    }

    
    public void mostrarTotais(double margemLucro, double taxasAdicionais, double cotacao) {
        double totalDolar = this.pacoteViagem.calcularTotalPacote(margemLucro, taxasAdicionais);
        double totalReal = this.converterDolarParaReal(totalDolar, cotacao);

        System.out.println("\n========= RESUMO DA VENDA =========");
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("Forma de Pagamento: " + this.formaPagamento);
        System.out.println("Total do Pacote em Dólar: US$ " + totalDolar);
        System.out.println("Total do Pacote em Reais: R$ " + totalReal);
        System.out.println("====================================");
    }

    
    public String getNomeCliente() { 
        return nomeCliente; 
    }
    
    public void setNomeCliente(String nomeCliente) { 
        this.nomeCliente = nomeCliente; 
    }

    public String getFormaPagamento() { 
        return formaPagamento; 
    }
    
    public void setFormaPagamento(String formaPagamento) { 
        this.formaPagamento = formaPagamento; 
    }

    public PacoteViagem getPacoteViagem() { 
        return pacoteViagem; 
    }
    
    public void setPacoteViagem(PacoteViagem pacoteViagem) { 
        this.pacoteViagem = pacoteViagem; 
    }
}