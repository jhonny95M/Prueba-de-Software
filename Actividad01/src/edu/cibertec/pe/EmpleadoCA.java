package edu.cibertec.pe;

import java.util.HashMap;

public class EmpleadoCA {
	
public enum TipoEmpleado{
	Vendedor,
	Encargado
}
static float RETENCION_16_PROCIENTO=0.16f;
static float RETENCION_18_PROCIENTO=0.18f;
HashMap<TipoEmpleado, Float>Salario=new HashMap<>();
	public EmpleadoCA() {
	Salario.put(TipoEmpleado.Vendedor, 1000f);
	Salario.put(TipoEmpleado.Encargado, 1500f);
	}
	public float calculaSalarioBruto(TipoEmpleado tipo,float ventasMes,float horasExta) throws Exception {
		if(tipo==null || ventasMes<0 || horasExta<0) throw new Exception("Error.");
		float resultado=0;
		if(ventasMes>=1500) {
			resultado=Salario.get(tipo)+200;
		}else
		if(ventasMes>=1000) {
			resultado=Salario.get(tipo)+100;
		}
		resultado=resultado+(20*horasExta);
	return resultado;	
	}
	public float calculaSalarioNeto(float salarioBruto) throws Exception {
		if(salarioBruto<0)throw new Exception("El salario no debe ser menor que 0");
		else if(salarioBruto==1000 && salarioBruto<1500)
			return salarioBruto * (1-RETENCION_16_PROCIENTO);
		else if(salarioBruto>=1500)
			return salarioBruto * (1-RETENCION_18_PROCIENTO);
		else return salarioBruto;
	}
}
