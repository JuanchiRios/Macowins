package macowins;
	
	
public class Camisa extends Prenda {

     public Camisa(double precioBase, double tasaImp, double valorFijoNegocio, boolean esImportada) {
		super(precioBase, tasaImp, valorFijoNegocio, esImportada);
		}

	public double getPrecioBase(){
    	 return 200;
     }
     
     public double calculoPrecioFinal(Camisa unaCamisa){
    	 double precioFinal;
    	 precioFinal = unaCamisa.calculoFinalSegunPrenda(unaCamisa, isEsImportada());
    	 return precioFinal;
     }
}





