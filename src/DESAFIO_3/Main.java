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


