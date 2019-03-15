import java.util.Scanner;

public class ListaDuplamenteEncadeada {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 ListaDupla l = new ListaDupla();
		 int resposta;
		 
		 do{
			 
			 System.out.println("Digite o número para a opção desejada:");
			 System.out.println("1 - Inserir  2 - Remover  3 - Alterar  4 - Imprimir  5 - Sair");
			 resposta = teclado.nextInt();
			 
			 if(resposta == 1){
				 
				 System.out.println("Digite onde deseja inserir: ");
				 System.out.println("Você deseja inserir o nome no (INICIO),(MEIO) ou (FIM) digite a palavra");
				 String inserir = teclado.next();
				 String inserirM = inserir.toUpperCase();
				 
				 if(inserirM.equals("INICIO")){
					System.out.println("Digite o número de inscrição"); 
					int num = teclado.nextInt(); 
							
					System.out.println("Digite o nome do aluno");
					String nome = teclado.next();
					
					l.inserirNoInicio(new No(num,nome));
					
				 }else{
					 if(inserirM.equals("FIM")){
					 
						System.out.println("Digite o número de inscrição"); 
						int num = teclado.nextInt(); 
								
						System.out.println("Digite o nome do aluno");
						String nome = teclado.next();
						
						l.inserirNoFim(new No(num,nome));
					
					 }else{
						 if(inserirM.equals("MEIO")){
							 if(l.getTotalNos() > 0){
								 
								System.out.println("numero da incrição voce quer botar depois da sua incrição: ");
					 			int num = teclado.nextInt();
					 			System.out.println("nome voce quer botar depois da seu nome: ");
					 			String nome = teclado.next();
					 			
					 			l.inserirNoMeio(new No(num,nome));
							 
							 }else{
								 	System.out.println("Digite o número de inscrição"); 
									int num = teclado.nextInt(); 
											
									System.out.println("Digite o nome do aluno");
									String nome = teclado.next();
									
									l.inserirNoInicio(new No(num,nome));
							 }
						 }else{
							 
						 }
					 }
				 }
			 }else{
			 
			 		if(resposta == 2){
				 
			 			System.out.println("Digite o número de inscrição"); 
			 			int num = teclado.nextInt(); 
							
			 			System.out.println("Digite o nome do aluno");
			 			String nome = teclado.next();
					
			 			l.excluirNo(new No(num,nome));
			 			
			 	}else{
			 		if(resposta == 3){
			 			
			 			l.alterarNo();
			 		
			 		}else{
			 		
			 			if(resposta == 4){
			 				System.out.println("Digite:");
			 				System.out.println("1- para mostrar de frente para trás e 2- pra mostra de trás pra frente");
				 			int menuExibir = teclado.nextInt();
				 			
				 			if(menuExibir == 1){
				 				l.exibirLista();
				 			}else{
				 				if(menuExibir == 2){
				 					l.exibirListaContraria();
				 				}else{
				 					
				 				}
				 			}
			 			}else{
			 			
			 				if(resposta == 5){
			 					
			 					System.out.println("Programa encerrado");
			 					
			 				}else{
			 					
			 				}
			 			}
			 		}
			 	}
			 }
		 }while(resposta != 5);
		 teclado.close();
	}		
}
