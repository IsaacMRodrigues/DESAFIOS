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

