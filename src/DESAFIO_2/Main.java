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


//		SEGUNDO DESAFIO
//
//	Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor
//	monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor
//	pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas
//	possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
//	necessárias.
//
//	Entrada
//	O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
//	Saída
//	Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
//	conforme exemplo fornecido.
//
//	Exemplo de Entrada 
//
//		576.73 NOTAS:
//
//	Exemplo de Saída
//
//5 nota(s) de R$ 100.00
//1 nota(s) de R$ 50.00
//1 nota(s) de R$ 20.00
//0 nota(s) de R$ 10.00
//1 nota(s) de R$ 5.00
//0 nota(s) de R$ 2.00
//MOEDAS:
//1 moeda(s) de R$ 1.00
//1 moeda(s) de R$ 0.50
//0 moeda(s) de R$ 0.25
//2 moeda(s) de R$ 0.10
//0 moeda(s) de R$ 0.05
//3 moeda(s) de R$ 0.01