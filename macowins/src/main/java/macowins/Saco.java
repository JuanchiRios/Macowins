package macowins;

public class Saco extends Prenda { 
    
	//Atributos
    private double precioBase;
    
    //Constructor Saco
    public Saco(){
    	precioBase = 300;
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
