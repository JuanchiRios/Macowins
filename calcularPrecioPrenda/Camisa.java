package macowins;
	
	
public class Camisa extends Prenda {

private double precioBase = 0;
    
	public double getPrecioBasePrenda(){
    	precioBase = 200;
    	return precioBase;
    }

	public double calculoPrecioFinal(boolean importado){
    	 double precioFinal;
    	 precioFinal = this.calculoFinalSegunPrenda(importado);
    	 return precioFinal;
     }
}





