package macowins;

public class Saco extends Prenda { 

    public Saco(double precioBase, double tasaImp, double valorFijoNegocio, boolean esImportada) {
		super(precioBase, tasaImp, valorFijoNegocio, esImportada);
		}

	public double getPrecioBase(){
   	 return 200;
    }
    
    public double calculoPrecioFinal(Saco unSaco){
   	 double precioFinal;
   	 precioFinal = unSaco.calculoFinalSegunPrenda(unSaco, isEsImportada());
   	 return precioFinal;
    }
}
