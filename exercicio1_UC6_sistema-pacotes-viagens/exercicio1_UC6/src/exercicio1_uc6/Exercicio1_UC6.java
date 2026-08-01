
package exercicio1_uc6;

import java.util.Scanner;

public class Exercicio1_UC6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("=== DADOS DO CLIENTE ===");
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = input.nextLine();
        System.out.print("Digite a forma de pagamento: ");
        String formaPagamento = input.nextLine();

        
        System.out.println("\n=== CADASTRO DO TRANSPORTE (VALORES EM DÓLAR) ===");
        System.out.print("Digite o tipo de transporte (ex: Aéreo): ");
        String tipoTrans = input.nextLine();
        System.out.print("Digite o valor do transporte (US$): ");
        double valorTrans = input.nextDouble();
        input.nextLine(); // Limpa buffer

       
        System.out.println("\n=== CADASTRO DA HOSPEDAGEM (VALORES EM DÓLAR) ===");
        System.out.print("Digite a descrição da hospedagem: ");
        String descHosp = input.nextLine();
        System.out.print("Digite o valor da diária (US$): ");
        double valorDiaria = input.nextDouble();
        input.nextLine(); // Limpa buffer

       
        System.out.println("\n=== CADASTRO DO PACOTE ===");
        System.out.print("Digite o destino da viagem: ");
        String destino = input.nextLine();
        System.out.print("Digite a quantidade de dias: ");
        int qtdDias = input.nextInt();
        System.out.print("Digite a margem de lucro da agência (%): ");
        double margemLucro = input.nextDouble();
        System.out.print("Digite o valor das taxas adicionais (US$): ");
        double taxas = input.nextDouble();
        System.out.print("Digite a cotação atual do dólar (ex: 5.50): ");
        double cotacao = input.nextDouble();

        
        Transporte trans = new Transporte(tipoTrans, valorTrans);
        Hospedagem hosp = new Hospedagem(descHosp, valorDiaria);
        PacoteViagem pacote = new PacoteViagem(trans, hosp, destino, qtdDias);
        
      
        Venda venda = new Venda(nomeCliente, formaPagamento, pacote);

     
        venda.mostrarTotais(margemLucro, taxas, cotacao);

        input.close();
    }
}
