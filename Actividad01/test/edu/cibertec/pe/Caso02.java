package edu.cibertec.pe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.cibertec.pe.EmpleadoCA.TipoEmpleado;

public class Caso02 {
	EmpleadoCA obj=new EmpleadoCA();
	@Test
	public void CalcularSalarioBruto1360() throws Exception {	
		assertTrue(1360== obj.calculaSalarioBruto(TipoEmpleado.Vendedor, 2000, 8));
	}
	@Test
	public void CalcularSalarioBruto1260() throws Exception {	
		assertTrue(1260== obj.calculaSalarioBruto(TipoEmpleado.Vendedor, 1500, 3));
	}
	@Test
	public void CalcularSalarioBruto1100() throws Exception {	
		assertTrue(1100== obj.calculaSalarioBruto(TipoEmpleado.Vendedor, 1499.99f, 0));
	}
	@Test
	public void CalcularSalarioBruto1760() throws Exception {	
		assertTrue(1760== obj.calculaSalarioBruto(TipoEmpleado.Encargado, 1250, 8));
	}
	@Test
	public void CalcularSalarioBruto1600() throws Exception {	
		assertFalse(1600== obj.calculaSalarioBruto(TipoEmpleado.Encargado, 1000, 8));
	}
	@Test
	public void CalcularSalarioBruto1560() throws Exception {	
		assertFalse(1560== obj.calculaSalarioBruto(TipoEmpleado.Encargado, 999.99f, 3));
	}
	@Test
	public void CalcularSalarioBruto1500() throws Exception {	
		assertFalse(1500== obj.calculaSalarioBruto(TipoEmpleado.Encargado, 500, 0));
	}
	@Test
	public void CalcularSalarioBruto1660() throws Exception {	
		assertFalse(1660== obj.calculaSalarioBruto(TipoEmpleado.Encargado, 0, 8));
	}
	@Test
	public void CalcularSalarioBrutoExceptioNegativoVentaMes() throws Exception {	
		assertThrows(Exception.class,()-> obj.calculaSalarioBruto(TipoEmpleado.Vendedor, -1, 8));
	}
	@Test
	public void CalcularSalarioBrutoExceptioNegativoHoras() throws Exception {	
		assertThrows(Exception.class,()->{ obj.calculaSalarioBruto(TipoEmpleado.Encargado, 1500, -1);});
	}
	@Test
	public void CalcularSalarioBrutoExceptioTipoEmpleadoNull() throws Exception {	
		assertThrows(Exception.class,()->{ obj.calculaSalarioBruto(null, 1500, 8);});
	}
	@Test
	public void CalcularSalarioNeto1640() throws Exception {	
		assertTrue(1640==obj.calculaSalarioNeto(2000));
	}
	@Test
	public void CalcularSalarioNeto1230() throws Exception {	
		assertTrue(1230==obj.calculaSalarioNeto(1500));
	}
	@Test
	public void CalcularSalarioNeto1259_9916() throws Exception {	
		assertTrue(1259.9916f==obj.calculaSalarioNeto(1499.99f));
	}
	@Test
	public void CalcularSalarioNeto1050() throws Exception {	
		assertTrue(1050==obj.calculaSalarioNeto(1250));
	}
	@Test
	public void CalcularSalarioNeto840() throws Exception {	
		assertTrue(840f==obj.calculaSalarioNeto(1000));
	}
	@Test
	public void CalcularSalarioNeto999_99() throws Exception {	
		assertTrue(999.99f==obj.calculaSalarioNeto(999.99f));
	}
	@Test
	public void CalcularSalarioNeto500() throws Exception {	
		assertTrue(500==obj.calculaSalarioNeto(500));
	}
	@Test
	public void CalcularSalarioNeto0() throws Exception {	
		assertTrue(0==obj.calculaSalarioNeto(0));
	}
	@Test
	public void CalcularSalarioNetoNegativo() throws Exception {	
		assertThrows(Exception.class,()->{ obj.calculaSalarioNeto(-1);});
	}
	
	

}
