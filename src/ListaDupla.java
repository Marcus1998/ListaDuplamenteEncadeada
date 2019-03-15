import java.util.Scanner;

public class ListaDupla {

		Scanner teclado = new Scanner(System.in);
		
		    No primeiro,ultimo;
		    int totalNos;

		    public ListaDupla(){
		    	
		        primeiro = ultimo = null;
		        totalNos = 0;
		        
		    }

		    public int getTotalNos(){
		    	
		        return totalNos;
		        
		    }

		    public boolean checkIfListaVazia(){
		    	
		        if (getTotalNos() == 0){
		            return true;
		        }
		        
		       return false;
		       
		    }

		    public void inserirNoInicio(No n) {
		        
		    	if ( checkIfListaVazia() ){
		            primeiro = ultimo = n;
		        }
		        else{
		            n.prox = primeiro;
		            primeiro.ant = n;
		            primeiro = n;
		        }
		    	
		        totalNos++;
		        
		    }
		    
		    public void inserirNoFim(No n){
		        // caso não existam nós inseridos,
		        // insere o primeiro nó (n) na lista
		    	
		        if ( checkIfListaVazia() ){
		            primeiro = ultimo = n;
		        }
		        else{
		            ultimo.prox = n;
		            ultimo.prox.ant = ultimo;
		            ultimo = n;
		       }
		       totalNos++;
		    }
		    
		    public void inserirNoMeio(No n){
		    	int iden = 1;
		    	int contador = 1;
		    	int marca = 0;
		    	int m = 1;
		    	int gni = 0;
		    	String gn = null;
		    	int gpni = 0;
		    	String gpn = null;
		    	int pni = 0;
		    	String pn = null;
		    	No noAtual;
		        No noAnterior;
		        totalNos++;
		        
		        noAtual = primeiro;
		        noAnterior = primeiro; 
		        
		        if (checkIfListaVazia() == false){
		        	ultimo.prox = n;
		            ultimo.prox.ant = ultimo;
		            ultimo = n;
		            while (contador <= getTotalNos()){
		            	
		            	if(noAtual.valor == n.valor && noAtual.nome.equals(n.nome) && contador != getTotalNos()){
		    	        	System.out.println("numero da incrição da pessoa: ");
		    	 			int nu = teclado.nextInt();
		    	 			System.out.println("nome da pessoa: ");
		    	 			String no = teclado.next();
		    	 			
		    	 			marca = contador;
		    	 			iden = 2;
		    	 			gn = noAtual.nome;
		    	 			gni = noAtual.valor;
		    	 			noAtual.valor = nu;
		    	 			noAtual.nome = no;
		    	        }
		            	
		            	if(iden == 2 && contador != marca){
		            			if(m == 2){
		            				pni = gpni;
		            				pn = gpn;
		            			}
		            			
			                	gpni = noAtual.valor;
			                	gpn = noAtual.nome;
		            		
		                	if(marca == 0){
		                		
		                		noAtual.valor = pni;
		                		noAtual.nome = pn;
		                		
		                	}
		                	
		                	
		                	if(marca != 0){
		                		
		                		noAtual.valor = gni;
			                	noAtual.nome = gn;
			                	marca = 0;
			                	m++;
			                	
		                	}else{
		                		
		                	}
		                }
		            
		            	 contador++;
		            	 noAtual = noAtual.prox;
		            	 
		            	 if(contador > 1){
		            		 
		            		 noAnterior = noAnterior.prox;
		            		 
		            	 }
		            }
		        }
	 		}
		    
		    public void alterarNo(){
		    	System.out.println("Inserir numero de escrição que voce deseja alterar: ");
	 			int num = teclado.nextInt();
	 			System.out.println("Digite o nome do aluno que deseja altera: ");
	 			String nome = teclado.next();
	 			
	 			int contador = 1;
	 			No temp = primeiro;
	 			
	 			if (checkIfListaVazia() == false){
	 				
	 				while (contador <= getTotalNos()){
	 					
	 					if(num == temp.valor && nome.equals(temp.nome)){
	 							
	 							System.out.println("Inserir numero de escrição que deseja: ");
	 				 			int numero = teclado.nextInt();
	 				 			System.out.println("Digite o nome do aluno que deseja: ");
	 				 			String nome2 = teclado.next();
	 				 			
	 				 			temp.valor = numero;
	 				 			temp.nome = nome2;
	 						}
	 						temp = temp.prox;
	 						contador++;
	 				}
	 			}
		    }

		    public void excluirNo(No n){
		        No noAtual;
		        No noAnterior;
		        No noProximo;
		        noAtual = noAnterior = noProximo= primeiro;
		        int contador = 1;
		        
		        if (checkIfListaVazia() == false){
		            while (contador <= getTotalNos() && noAtual.valor != n.valor){
		            	
		                noAnterior = noAtual;
		                noAtual = noAtual.prox;
		                noProximo = noAtual.prox;
		                contador++;
		            } 

		            if(noAtual.valor == n.valor){
		            	if ( getTotalNos() == 1){
		            	
		                primeiro = ultimo = null;
		                
		            }else{
		               if (noAtual == primeiro){
		            	   
		                   primeiro = noAtual.prox;
		                   
		               }else{
		            	   if(noAtual == ultimo){
		            		   
			            	   noAtual = null;
			            	   ultimo = noAnterior;
			            	   
			               }else{
			            	   
			            	   noProximo.ant = noAtual.ant;
			            	   noAnterior.prox = noAtual.prox;
			            	   
				               }
			               }
			           }
			           totalNos--;
			        }
			    }
			}

		public void exibirLista(){
		    No temp = primeiro;
		    String valores = "";
		    int cont = 1;
		    if ( checkIfListaVazia() == false ){
		        while (cont <= getTotalNos()){
		        	if(getTotalNos() > cont){
		        		valores += Integer.toString(temp.valor) + " - " + (temp.nome) + " | ";
		        	}else{
		        		valores += Integer.toString(temp.valor) + " - " + (temp.nome);
		        	}
		            temp = temp.prox;
		            cont++;
		        }
		    }
		    System.out.println(valores);
		}
		
		public void exibirListaContraria(){
		    No temp = ultimo;
		    String valores = "";
		    
		    int cont = getTotalNos();
		    if ( checkIfListaVazia() == false ){
		        while (cont >= 1){
		        	if(1 < cont){
		        		valores += Integer.toString(temp.valor) + " - " + (temp.nome) + " | ";
		        		}else{
		        			valores += Integer.toString(temp.valor) + " - " + (temp.nome);
		        		}
		        	temp = temp.ant;
		            cont--;
		        }
		    }
		    System.out.println(valores);
		}
		
		
	}