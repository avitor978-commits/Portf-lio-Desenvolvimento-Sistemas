programa
{     
    
	funcao inicio()
	{
		cadeia nomeCliente  [6] 
		real valorGasto [6] 
		inteiro valorDesconto =  0.0
		real soma = 0.0
		inteiro i, qtdContador = 0
		

		escreva("-------------------------------- Power Gamer- --------------------------------\n")
		escreva("Seja bem-vindo à Power Gamer! onde o verdadeiro gamer encontra tudo para jogar")
		escreva("\n")

		escreva("------------------------------------------------------------------------------\n")

          escreva("\nQual o valor do desconto do dia? R$: ")
          leia(valorDesconto)
          escreva("\n--------------------------------------------------------------------------\n")
		
		para(i = 0; i < 6; i++){
		escreva("\nInforme o nome do(a) Cliente: ")
		leia(nomeCliente[i])
		escreva("\nInforme quanto o(a) Cliente ", nomeCliente[i], " gastou: ")
		leia(valorGasto[i])
		escreva("------------------------------------------------------------------------\n")
		}
             para(i = 0; i < 6; i++)
             {
               escreva("\nO(a) cliente ", nomeCliente[i], " Gastou na loja R$: ", valorGasto[i], " reais" )
               escreva("\n")  
               
    
               se(valorGasto[i] > 100){
               	qtdContador = qtdContador +1
                   	valorGasto[i] = valorGasto[i] - valorDesconto
               	soma = soma+valorGasto[i]
               	escreva("O(a) Cliente " , nomeCliente[i] , " ganhou desconto de ", valorDesconto, "%  nas compras \n")
               	escreva("O valor total que o(a) cliente " ,nomeCliente[i], " irá pagar é R$: " , valorGasto[i], " reais \n")
               	escreva("-----------------------------------------------------------------------")
               }

               	senao se(valorGasto[i] < 100)
               	{
               		soma = soma + valorGasto[i]
               		escreva("O(a) cliente pagará o valor total sem desconto.")
               		escreva("\n----------------------------------------------------------------------\n")
               	}
               	
                             
               	
               }   
                         escreva("\n\nRelatório de vendas do dia: \n")
                         escreva("\nO valor total vendido foi R$: ", soma, "\n")
                         escreva("A quantidade de clientes com desconto foram: ", qtdContador)
                         
       }
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3568; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valorDesconto, 22, 10, 13}-{soma, 23, 7, 4}-{i, 24, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
