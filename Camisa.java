package macowins;

public class Camisa extends Prenda {
	
	public double getPrecioBase(){
		return 300;
	}
	
public double aumentarTasaImp(){
		return super.agregarTasaImportacion();
	}

	@Override
	public double calculoValorFinal() {
		double precioFinal;
		double valorNegocio;
		valorNegocio = Prenda.importeFijoNegocio();
		precioFinal = (this.getPrecioBase() + valorNegocio) * this.aumentarTasaImp();
		return precioFinal;
	}
}


