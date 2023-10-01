package DESAFIO_1;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
        Integer[] numeros = { 10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98 };

        Integer[] pares = separarPares(numeros);
        Integer[] impares = separarImpares(numeros);

        Arrays.sort(pares);
        exibirNumeros(pares);
        Arrays.sort(impares, Collections.reverseOrder());
        exibirNumeros(impares);
    }

    public static Integer[] separarPares(Integer[] numeros) {
        int count = 0;
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                count++;
            }
        }

        Integer[] pares = new Integer[count];
        int index = 0;
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                pares[index] = numero;
                index++;
            }
        }

        return pares;
    }

    public static Integer[] separarImpares(Integer[] numeros) {
        int count = 0;
        for (Integer numero : numeros) {
            if (numero % 2 != 0) {
                count++;
            }
        }

        Integer[] impares = new Integer[count];
        int index = 0;
        for (Integer numero : numeros) {
            if (numero % 2 != 0) {
                impares[index] = numero;
                index++;
            }
        }

        return impares;
    }

    public static void exibirNumeros(Integer[] numeros) {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

	}


//		PRIMEIRO DESAFIO
//
//	Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
//		o seguinte critério:
//		• Primeiro os Pares
//		• Depois os Ímpares
//	Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
//	em ordem decrescente.
//	Entrada
//
//	A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105) Este é o
//	número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada
//	uma delas, um valor inteiro não negativo.
//	Saída
//
//	Apresente todos os valores lidos na entrada segundo a ordem apresentada acima. Cada
//	número deve ser impresso em uma linha, conforme exemplo abaixo.
//
//	Exemplo de Entrada 
//
//10
//4
//32
//34
//543
//3456
//654
//567
//87
//6789
//98
//
// Exemplo de Saída
//
//4
//32
//34
//98
//654
//3456
//6789
//567
//543
//87

