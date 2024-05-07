package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Util.MisArrays;


class TestMedia {

    static int[] notasValidas; 
    static int[] notasNoValidas; 
    
	@BeforeAll
	void setUp() throws Exception {

        notasValidas = new int[5];
        notasValidas[0] = 8;
        notasValidas[1] = 8;
        notasValidas[2] = 8;
        notasValidas[3] = 8;
        notasValidas[4] = 8;

        notasNoValidas = new int[5];
        notasNoValidas[0] = 100;
        notasNoValidas[1] = 1;
        notasNoValidas[2] = -2;
        notasNoValidas[3] = -4;
        notasNoValidas[4] = 6;

    }
	

	@Test
		void testMediaNotas_NotasValidas() 
	    {
	        float media = MisArrays.mediaNotas(notasValidas);
	        assertEquals(8, media); 
	    }
	void testMediaNotas_NotasNoValidas() 
    {
        assertThrows(IllegalArgumentException.class, () -> {
            MisArrays.mediaNotas(notasNoValidas);
        });
    }
	

}
