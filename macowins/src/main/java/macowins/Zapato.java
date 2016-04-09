package macowins;

public class Zapato extends Prenda{
	
	private int talle;
	private int precioBase;
	public Zapato(boolean importado,Marca unaMarca,int unTalle){
		this.setEsPrendaImportada(importado);
		this.setMarca(unaMarca);
		talle = unTalle;
		precioBase = 400 + 5 * talle;
	}
	
	public double getPrecioBasePrenda() {
		return precioBase;
	}

	
}
