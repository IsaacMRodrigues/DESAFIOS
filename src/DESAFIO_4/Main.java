package DESAFIO_4;

import java.util.Scanner;

public class Main {
	
	  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  String frase, frase1, frase2;
		  System.out.println("Digite a frase infectada: ");
		  frase = scanner.nextLine();
		  
		  
		  frase1 = frase.substring(0, frase.length()/2);
		  frase2 = frase.substring(frase.length()/2, frase.length());
		 
		  frase = inverterFrase(frase1);
		  frase += inverterFrase(frase2);
		  System.out.println(frase);
	  }
	  
	    public static String inverterFrase(String frase) {
	        StringBuilder fraseInvertida = new StringBuilder();

	        for (int i = frase.length() - 1; i >= 0; i--) {
	            fraseInvertida.append(frase.charAt(i));
	        }

	        return fraseInvertida.toString();
	    }
}