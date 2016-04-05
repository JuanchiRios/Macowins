package macowins;
	
	
public class Camisa extends Prenda {
    
	//Atributos
	private double precioBase;
	
	//Constructor Camisa
    public Camisa(){
    	precioBase = 200;
    }
    
    //Metodos
	public double getPrecioBasePrenda(){
    	return precioBase;
    }

	public double calculoPrecioFinal(boolean importado){
    	 double precioFinal;
    	 precioFinal = this.calculoFinalSegunPrenda(importado);
    	 return precioFinal;
     }
}





