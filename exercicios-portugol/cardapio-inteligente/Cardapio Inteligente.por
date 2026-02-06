programa
{
	
	funcao inicio()
	{
		cadeia nome, vegetariano, dieta, prato, pagamento


          escreva("Cardapio Inteligente ")

		escreva("Nome do cliente: ")
		leia(nome)
		
          escreva("O Cliente é Vegetariano? (Sim/Não): ")
		leia(vegetariano)
		
		escreva("O Cliente está de dieta? (Sim/Não): ")
		leia(dieta)
		
		escreva("--------------------------------\n")

		
				
          se( vegetariano == "sim" e dieta == "sim")
          {
                 prato = "salada"
                 escreva("Cliente :", nome, "\n")
                 escreva("Sugestão de prato: Salada")
              }
          

             senao
               se(vegetariano == "não" e dieta == "sim"){
                  prato = "Frango grelhado"
                  escreva("Cliente :", nome, "\n")
                  escreva("Sugetão de prato: Frango Grelhado")
               }
               

             senao
               se(vegetariano == "sim" e dieta == "não"){
                  prato = "Macarrão"
                  escreva("Cliente :", nome, "\n")
                  escreva("Sugestão de prato: Macarrão")
               }
               
             senao
                  se(vegetariano == "não" e dieta == "não"){
                  prato = "Feijoada"
                  escreva("Cliente :", nome, "\n")
                  escreva("Sugestão de prato: Feijoada ")
                  }

                  escreva("\n------------------------------------------------")
                  

                  escreva("\nComo será a forma de pagamento? dinheiro/Cartao: ")
                  leia(pagamento)

                  se(pagamento == "dinheiro"){
                     pagamento = "15% de desconto"
                     escreva("O cliente tem 15% de desconto")
                  }
         
            

                  

		
		

		
			   
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 123; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */