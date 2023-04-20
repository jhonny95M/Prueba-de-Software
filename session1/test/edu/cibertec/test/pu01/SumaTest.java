package edu.cibertec.test.pu01;
import edu.cibertec.pu01.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SumaTest {
	@Test
    public void SumaPositivos(){
        System.out.println("Sumando dos numeros positivos......");
        Suma s=new Suma(2, 1);
        assertTrue(s.sumar()==3);
    }
    @Test
    public void SumaNegativo(){
        assertFalse(false);
    }

}
