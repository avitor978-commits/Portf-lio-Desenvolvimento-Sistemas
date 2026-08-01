
package exercicio3_uc6;

import java.util.Scanner;


public class Exercicio3_UC6 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("--- SISTEMA DE PAGAMENTOS DE IMPOSTOS ---");
        System.out.println("Informe o nome da empresa: ");
        String nomeEmpresa = teclado.nextLine();
        
        Pagamentos pagamentos = new Pagamentos(nomeEmpresa);
       
        String opcao = "";
        
        while(true){
            System.out.println("\nQual imposto deseja cadastrar? (Digite 'Pis', 'Ipi' ou 'Pare' para encerrear): ");
            opcao = teclado.nextLine().trim();
        
        if(opcao.equalsIgnoreCase("pare")){
            break;
        }
        if(opcao.equalsIgnoreCase("Pis")){
            System.out.println("Digite o valor total de Debito da empresa: ");
            double debito = teclado.nextDouble();
            System.out.println("Digite o valor total de credito da empresa: ");
            double credito = teclado.nextDouble();
            teclado.nextLine();
        
            
            Pis pis = new Pis(debito, credito);
            pagamentos.adicionarImposto(pis);
            System.out.println("Imposto PIS cadastrado com sucesso! ");
        
       
    }else if(opcao.equalsIgnoreCase("IPI")){
            System.out.println("Digite o valor da aliquota (ex: 5 para 5%: ");
            double aliquota = teclado.nextDouble();
            System.out.println("Digite o valor do produto: ");
            double valorProduto = teclado.nextDouble();
            System.out.println("Digite o valor do frete: ");
            double frete = teclado.nextDouble();
            System.out.println("Digite o valor do seguro: ");
            double seguro = teclado.nextDouble();
            System.out.println("Digite o valor de outras despesas: ");
            double outrasDespesas = teclado.nextDouble();
            teclado.nextLine();
            
            Ipi ipi = new Ipi(aliquota, valorProduto, frete, seguro, outrasDespesas);
            pagamentos.adicionarImposto(ipi);
            System.out.println("Imposto cadastrado com sucesso! ");
    }else{
            System.out.println("Opcao invalida! Digite apenas 'PIS', 'IPI' ou 'pare'. ");
            
       }
    
    }
            System.out.println("\n===================================");
            System.out.println("RELATORIO DE IMPOSTOS - EMPRESA Olinda" + pagamentos.getNomeEmpresa().toUpperCase());
            System.out.println("=====================================");
            
     for(Imposto imp : pagamentos.getListaImpostos()){
         System.out.println("Imposto: " + imp.getDescricao());
         System.out.printf("Valor Calculado: R$ %.2f\n", imp.calcularImposto());
         System.out.println("-----------------------------------------");
    
     
    }
     
     teclado.close();
     
  }

}

    
