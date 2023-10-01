package DESAFIO_3;

import java.util.Scanner;

public class Main {
	
    public static int countPairs(int n, int k, int[] arr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[j] - arr[i]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura da entrada
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Chamada do método para contar os pares
        int result = countPairs(n, k, arr);

        // Exibição do resultado
        System.out.println(result);
    }



	}

//TERCEIRO DESAFIO
//
//Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
//do array em que a sua diferença seja igual ao valor alvo.
//
//Exemplo
//K = 1
//arr = [1,2,3,4]
//Existem 3 valores cuja diferença é igual ao valor alvo K: 2-1 = 1, 3-2 = 1, 4-3 = 1.
//
//Descrição do problema:
//Os pares têm os seguintes parâmetros:
//int k: Um Inteiro, valor alvo.
//int arr[n]: Um array de Inteiros.
//
//Retorno
//int: O número de pares que satisfazem o critério.
//
//Formatos de Entrada
//Seu código deve conter duas entradas n e k, que representam o tamanho do array e o valor
//alvo.
//Seu código deve conter um array de inteiros, de tamanho n.
//
//Exemplos de entrada
//
//STDIN Function
//----- --------
//5 2 arr[] tamanho n = 5, k =2
//1 5 3 4 2 arr = [1, 5, 3, 4, 2]
//
//Exemplo de saida
//3
