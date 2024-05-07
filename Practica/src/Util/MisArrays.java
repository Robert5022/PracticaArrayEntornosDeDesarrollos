
package Util;

import java.util.Arrays;

import Util.MisArrays;

public abstract class MisArrays {
	
	public static float mediaNotas(int[] notas) {
        validarNotas(notas);
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return (float) sum / notas.length;
    }

    private static void validarNotas(int[] notas) {
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10.");
            }
        }
    }
    public static float medianaNotas(int[] notas) {
        validarNotas(notas);
        int n = notas.length;
        Arrays.sort(notas);

        if (n % 2 == 0) {
            int indiceMedio1 = n / 2 - 1;
            int indiceMedio2 = n / 2;
            return (notas[indiceMedio1] + notas[indiceMedio2]) / 2.0f;
        } else {
            return notas[n / 2];
        }
    }
}