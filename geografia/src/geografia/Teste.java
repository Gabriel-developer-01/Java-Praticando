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
	        capitais.add("Maceió");
	        estados.add("Amapá");
	        capitais.add("Macapá");
	        estados.add("Amazonas");
	        capitais.add("Manaus");
	        estados.add("Bahia");
	        capitais.add("Salvador");
	        estados.add("Ceará");
	        capitais.add("Fortaleza");
	        estados.add("Distrito Federal");
	        capitais.add("Brasília");
	        estados.add("Espirito Santo");
	        capitais.add("Vitória");
	        estados.add("Goias");
	        capitais.add("Goiânia");
	        estados.add("Maranhão");
	        capitais.add("São Luíz");
	        estados.add("Mato Grosso");
	        capitais.add("Cuiabá");
	        estados.add("Mato Grosso do sul");
	        capitais.add("Campo Grande");
	        estados.add("Minas Gerais");
	        capitais.add("Belo Horizonte");
	        estados.add("Pará");
	        capitais.add("Belém");
	        estados.add("Paraiba");
	        capitais.add("João Pessoa");
	        estados.add("Paraná");
	        capitais.add("Curitiba");
	        estados.add("Pernambuco");
	        capitais.add("Recife");
	        estados.add("Piauí");
	        capitais.add("Teresina");
	        estados.add("Rio de Janeiro");
	        capitais.add("Rio de Janeiro");
	        estados.add("Rio Grande do Norte");
	        capitais.add("Natal");
	        estados.add("Rio Grande do Sul");
	        capitais.add("Porto Alegre");
	        estados.add("Rondônia");
	        capitais.add("Porto Velho");
	        estados.add("Roraima");
	        capitais.add("Boa Vista");
	        estados.add("Santa Catarina");
	        capitais.add("Florianópolis");
	        estados.add("São Paulo");
	        capitais.add("São Paulo");
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
	                
	            System.out.print("\nQual é a capital de " + estado + "?");     
	            String resposta = entrada.nextLine();   
	                
	            if (resposta.equalsIgnoreCase(capital)) {     
	                System.out.println("Correto!");     
	            } else {     
	                System.err.println("Errado! A capital de " + estado + " é " + capital);     
	                erros += 1;   
	            }    
	        }   
	        System.out.println("\nFIM\nerros: " + erros + "/27");  
	        
	        entrada.close();
	    }  
	}