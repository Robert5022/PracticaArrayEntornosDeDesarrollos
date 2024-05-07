package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Util.MisArrays;

class TestMediana {

            static int[] notas;
          

            @BeforeAll
            static void setUp() {
                notas = new int[]{3, 1, 4, 2, 5};
            }

            @Test
            public void testMedianaValido1() {
                float resultadoEsperado = 3f;
                float resultadoObtenido = MisArrays.medianaNotas(notas);
                assertEquals(resultadoEsperado, resultadoObtenido);
            }

            @Test
            public void testMedianaValido2() {
                int[] arrayCorrecto2 = {3, 1, 4, 2, 5, 6};
                float resultadoEsperado = 3.5f;
                float resultadoObtenido = MisArrays.medianaNotas(arrayCorrecto2);
                assertEquals(resultadoEsperado, resultadoObtenido);
            }
}