package macowins;


public class Pantalon extends Prenda {
    
	private double precioBase = 0;
    
	public double getPrecioBasePrenda(){
    	precioBase = 250;
    	return precioBase;
    }

	public double calculoPrecioFinal(boolean importado){
   	 double precioFinal;
   	 precioFinal = this.calculoFinalSegunPrenda(importado);
   	 return precioFinal;
    }
}


