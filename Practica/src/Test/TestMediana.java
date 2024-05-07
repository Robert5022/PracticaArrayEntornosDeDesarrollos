package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Util.MisArrays;

class TestMediana {

            static int[] notas;
            static int inicio;
            static int finValido;
            static int finInvalido;

            @BeforeAll
            static void setUp() {
                notas = new int[]{3, 1, 4, 2, 5};
                inicio = 1;
                finValido = 5; 
                finInvalido = 6; 
            }

            @Test
            void testMedianaValida() {
                int medianaEsperadaValida = 3;
                assertEquals(medianaEsperadaValida, MisArrays.buscarMediana(notas, inicio, finValido));
            }


            @Test
            void testMedianaInvalida() {
                assertThrows(IllegalArgumentException.class, () -> MisArrays.buscarMediana(notas, inicio, finInvalido));
            }
        }
