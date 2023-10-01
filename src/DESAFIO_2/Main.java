package DESAFIO_2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double[] notas = {100, 50, 20, 10, 5, 2};
		double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
		int [] numerosN = {0, 0, 0 , 0 ,0 ,0};
		int [] numerosM = {0, 0, 0 , 0 ,0 ,0};
		Double num = 0.0;
		Scanner si = new Scanner(System.in);

		System.out.println("Insira o valor");
		num = si.nextDouble();
		
		for(int i = 0; i <notas.length; i++) {
	        BigDecimal decimal = new BigDecimal(num);
	        BigDecimal divisor = new BigDecimal(notas[i]);
	        BigDecimal resto = decimal.remainder(divisor);
	        BigDecimal restoArredondado = resto.setScale(2, RoundingMode.HALF_UP);
			numerosN[i] = (int) (num / notas[i]);
			num = num % notas[i];
		}
		
		for(int i = 0; i <moedas.length; i++) {
	        BigDecimal decimal = new BigDecimal(num);
	        BigDecimal divisor = new BigDecimal(moedas[i]);
	        BigDecimal resto = decimal.remainder(divisor);
	        BigDecimal restoArredondado = resto.setScale(2, RoundingMode.HALF_UP);
			numerosM[i] = (int) (num / moedas[i]);
			num = num % moedas[i];
		}
		
	        

		System.out.println("NOTAS \n");
		for(int i = 0; i <notas.length; i++) {
			System.out.println(numerosN[i] + " notas (s) de R$ " + notas[i] + "\n");
		}
		System.out.println("MOEDAS \n");
		for(int i = 0; i <moedas.length; i++) {
			System.out.println(numerosM[i] + " moeda (s) de R$ " + moedas[i] + "\n");
		}
	}

}
