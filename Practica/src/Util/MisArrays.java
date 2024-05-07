
package Util;

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
}
