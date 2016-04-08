package macowins;


public class Pantalon extends Prenda {
    
	//Atributos
	private double precioBase;
	//Constructor Pantalon
    public Pantalon(){
    	precioBase = 250;
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


