package geografia;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		  ArrayList<String> estados = new ArrayList<String>();     
	      ArrayList<String> capitais = new ArrayList<String>(); 
	         
	        estados.add("Acre");
	        capitais.add("Rio Branco");
	        estados.add("Alagoas");
	        capitais.add("Macei�");
	        estados.add("Amap�");
	        capitais.add("Macap�");
	        estados.add("Amazonas");
	        capitais.add("Manaus");
	        estados.add("Bahia");
	        capitais.add("Salvador");
	        estados.add("Cear�");
	        capitais.add("Fortaleza");
	        estados.add("Distrito Federal");
	        capitais.add("Bras�lia");
	        estados.add("Espirito Santo");
	        capitais.add("Vit�ria");
	        estados.add("Goias");
	        capitais.add("Goi�nia");
	        estados.add("Maranh�o");
	        capitais.add("S�o Lu�z");
	        estados.add("Mato Grosso");
	        capitais.add("Cuiab�");
	        estados.add("Mato Grosso do sul");
	        capitais.add("Campo Grande");
	        estados.add("Minas Gerais");
	        capitais.add("Belo Horizonte");
	        estados.add("Par�");
	        capitais.add("Bel�m");
	        estados.add("Paraiba");
	        capitais.add("Jo�o Pessoa");
	        estados.add("Paran�");
	        capitais.add("Curitiba");
	        estados.add("Pernambuco");
	        capitais.add("Recife");
	        estados.add("Piau�");
	        capitais.add("Teresina");
	        estados.add("Rio de Janeiro");
	        capitais.add("Rio de Janeiro");
	        estados.add("Rio Grande do Norte");
	        capitais.add("Natal");
	        estados.add("Rio Grande do Sul");
	        capitais.add("Porto Alegre");
	        estados.add("Rond�nia");
	        capitais.add("Porto Velho");
	        estados.add("Roraima");
	        capitais.add("Boa Vista");
	        estados.add("Santa Catarina");
	        capitais.add("Florian�polis");
	        estados.add("S�o Paulo");
	        capitais.add("S�o Paulo");
	        estados.add("Sergipe");
	        capitais.add("Aracaju");
	        estados.add("Tocantins");
	        capitais.add("Palmas");
	         
	    
	        if (estados.size() != capitais.size()) {   
	            System.err.println("tamanhos diferentes");   
	            return;   
	        }   
	            
	        Scanner entrada = new Scanner(System.in);     
	   
	        int erros = 0;   
	        for (int i = 0; i < estados.size(); i++) {   
	            String estado = estados.get(i);   
	            String capital = capitais.get(i);   
	                
	            System.out.print("\nQual � a capital de " + estado + "?");     
	            String resposta = entrada.nextLine();   
	                
	            if (resposta.equalsIgnoreCase(capital)) {     
	                System.out.println("Correto!");     
	            } else {     
	                System.err.println("Errado! A capital de " + estado + " � " + capital);     
	                erros += 1;   
	            }    
	        }   
	        System.out.println("\nFIM\nerros: " + erros + "/27");  
	        
	        entrada.close();
	    }  
	}