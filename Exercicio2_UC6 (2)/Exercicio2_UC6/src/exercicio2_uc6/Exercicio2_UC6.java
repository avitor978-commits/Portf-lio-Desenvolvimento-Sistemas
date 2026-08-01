
package exercicio2_uc6;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio2_UC6 {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        ArrayList<Funcionario>listaFuncionario = new ArrayList<>();
        
        System.out.println("--- CADASTRO DE FUNCIONARIOSN(ATÉ 10) ---");
        
        for(int i = 0; i < 10; i++){
            
            System.out.println("\nCadastro do Funcionario #" + (i+1));
            System.out.println("Deseja cadastrar (1) Assalariado ou (2) Horista? (Digite 0 para parar): ");
            int opcao = teclado.nextInt();
            teclado.nextLine();
            
            if(opcao == 0){
                break;
            
            }
            
                                  
            System.out.println("Nome: ");
            String nome = teclado.nextLine();
            
            System.out.println("CPF: ");
            String cpf = teclado.nextLine();
            
            System.out.println("Endereço: ");
            String endereco = teclado.nextLine();
            
            System.out.println("Telefone: ");
            String telefone = teclado.nextLine();
            
            System.out.println("Setor: ");
            String setor = teclado.nextLine();
            
            if(opcao ==1){
                System.out.println("Salario Mensal: ");
                double salario = teclado.nextDouble();
                teclado.nextLine();
                
                Assalariado func = new Assalariado(nome, cpf, endereco,telefone, setor, salario);
                listaFuncionario.add(func);
                
            }else if (opcao ==2){
                
                System.out.println("Valor da Hora: ");
                double valorHora = teclado.nextDouble();
                System.out.println("Horas trabalhadas: ");
                double horas = teclado.nextDouble();
                teclado.nextLine();
                
                Horista func = new Horista(nome, cpf, endereco, telefone, setor, valorHora, horas);
                listaFuncionario.add(func);
            
            }else{
                
                System.out.println("Opção invalida! Tente Novamente");
                i--;
                                
        }
         
    }
        
        System.out.println("\n--- RELATORIO DE PAGAMENTOS ---");
        
        for(Funcionario f : listaFuncionario){
            System.out.println("Nome: " + f.getNome());
            System.out.println("CPF: " + f.getCpf());
            System.out.println("Setor: " + f.getSetor());
            System.out.printf("Pagamento: R$ %.2f\n", f.calcularPagamento());
            System.out.println("-------------------------------------");
        }
        System.out.println("\nDigite a porcentagem de aumento geral (ex: 10 para 10%): ");
        double aumento = teclado.nextDouble();
        
        for(Funcionario f : listaFuncionario){
            f.aplicarAumento(aumento);
            
            
        }
        
        System.out.println("\n --- PAGAMENTOS APOS O AUMENTO DE " + aumento + "% ---");
        for(Funcionario f : listaFuncionario){
            System.out.println("Nome: " + f.getNome());
            System.out.printf("Novo Pagamento: R$ %.2f\n", f.calcularPagamento());
            System.out.println("------------------------------------");
        }
        
        teclado.close();
       
    }
    
}



