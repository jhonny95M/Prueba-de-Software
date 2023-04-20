package test.edu.cibertec;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.cibertec.Suma;

public class SumaTest2 {
    @Test
    public void SumaPositivos(){
        System.out.println("Sumando dos numeros positivos......");
        Suma s=new Suma(2, 1);
        assertTrue(s.sumar()==3);
    }
}
