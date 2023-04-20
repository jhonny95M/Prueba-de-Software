package edu.cibertec.pe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class Caso01 {
	NumeroArabigo numeroArabigo=new NumeroArabigo();
	@Test
	public void testArabigoNumero1(){
		
		assertEquals("I",numeroArabigo.convertirANumeroRomano(1));
	}
	@Test
	public void testArabigoNumero5() {
		assertEquals("V", numeroArabigo.convertirANumeroRomano(5));
	}
	@Test
	public void testArabigoNumero10() {
		assertEquals("X", numeroArabigo.convertirANumeroRomano(10));
	}
	@Test
	public void testArabigoNumero50() {
		assertEquals("L", numeroArabigo.convertirANumeroRomano(50));
	}
	@Test
	public void testArabigoNumero100() {
		assertEquals("C", numeroArabigo.convertirANumeroRomano(100));
	}
	@Test
	public void testArabigoNumero500() {
		assertEquals("D", numeroArabigo.convertirANumeroRomano(500));
	}
	@Test
	public void testArabigoNumero1000() {
		assertEquals("M", numeroArabigo.convertirANumeroRomano(1000));
	}
	@Test
	public void testNumero333() {
		assertEquals("CCCXXXIII", numeroArabigo.convertirANumeroRomano(333));
	}
	@Test
	public void testNoNumero444() {
		assertNotEquals("CCCCXXXXIIII", numeroArabigo.convertirANumeroRomano(444));
	}
	@Test
	public void testNumero444() {
		assertEquals("CDXLIV", numeroArabigo.convertirANumeroRomano(444));
	}
	@Test
	public void testNoNumero10() {
		assertNotEquals("VV", numeroArabigo.convertirANumeroRomano(10));
	}
	@Test
	public void testNumero6() {
		assertEquals("VI", numeroArabigo.convertirANumeroRomano(6));
	}
	@Test
	public void testNumero9() {
		assertNotEquals("VIIII", numeroArabigo.convertirANumeroRomano(9));
	}
	@Test
	public void testArabigoNoNumero1() {
		assertNotEquals("I", numeroArabigo.convertirANumeroRomano(2));
	}
	@Test
	public void testArabigoNumero2() {
		assertEquals("II", numeroArabigo.convertirANumeroRomano(2));
	}

}
