
package exercicio1_uc6;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Exercicio1_UC6 {

 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, operacao = "I";
        int indice;

        List<String> clientes = new ArrayList<String>();
        
        while(!operacao.equals("S"))
        {
            System.out.println("Digite a operação [I]ncluir, [E]xcluir, [S]air");
            operacao = entrada.nextLine();
            switch(operacao)
            {
                case "I":
                    System.out.print("Digite o nome: ");
                    nome = entrada.nextLine();
                    clientes.add(nome); //incluindo um novo nome na lista
                    break;
                    
                case "E":
                    System.out.print("Digite o indice: ");
                    indice = entrada.nextInt();
                    if(indice >= 0 && indice < clientes.size())//valida se o índice informado é válido
                        clientes.remove(indice); //excluindo o valor que está no índice informado
                    break;
                
                case "S":
                    System.out.println("Encerrando o programa");
                    break;
            }
            
            System.out.println("A lista neste momento está assim: ");
            for(int i = 0; i<clientes.size(); i++)
            {
                //em ArrayList, não se usa [] para acessar um item, mas sim método get()
                System.out.println(clientes.get(i));
            }
        }
    }
    
}
                    