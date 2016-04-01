package macowins;

public abstract class Prenda {

	private double precioBase;
	private static double valorFijoNegocio = 5.0;
	
	private double tasaImportacion;
	
	
	
	public double agregarTasaImportacion(){
		boolean ropaImportada=true;
		
		if(ropaImportada){
			tasaImportacion = 1.3;
			}
		else{
			tasaImportacion = 1;
		}
		return tasaImportacion;
	}

	public double getPrecioBase() {
		return precioBase;
	}
	
	public static double importeFijoNegocio(){
		return valorFijoNegocio;
	}
	
	public abstract double calculoValorFinal();


}
	
	

