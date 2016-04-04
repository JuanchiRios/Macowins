package macowins;


public class Pantalon extends Prenda {

    public Pantalon(double precioBase, double tasaImp, double valorFijoNegocio, boolean esImportada) {
		super(precioBase, tasaImp, valorFijoNegocio, esImportada);
		}

	public double getPrecioBase(){
   	 return 250;
    }
    
    public double calculoPrecioFinal(Pantalon unPantalon){
   	 double precioFinal;
   	 precioFinal = unPantalon.calculoFinalSegunPrenda(unPantalon, isEsImportada());
   	 return precioFinal;
    }
}


