package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class MinimoNota {

	    static int[] notas;

	    @BeforeAll
	    static void setUp() {
	        notas = new int[]{3, 1, 4, 2, 5};
	    }

	    @Test
	    public void testMInimoNota() {
	        int resultadoEsperado = 5;
	        int resultadoObtenido = MisArrays.minimaNota(notas);
	        assertEquals(resultadoEsperado, resultadoObtenido);
	    }
	}


