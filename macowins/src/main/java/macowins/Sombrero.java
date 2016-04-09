package macowins;

public class Sombrero extends Prenda {
	
	private double precioBase;
	private double coefMetrosexualidad;
	
	public Sombrero(boolean importado,Marca unaMarca,double unCoefMetrosex){
      this.setEsPrendaImportada(importado);
      this.setMarca(unaMarca);
      coefMetrosexualidad = unCoefMetrosex;
      precioBase = 150 * (1 + coefMetrosexualidad);
}

	
	public double getPrecioBasePrenda() {
	  return precioBase;
	}
}