package macowins;
	
	
public class Camisa extends Prenda {



	int precioBase = 200;

	public double precioFinal() {
		double valorRealFinal = 0;
		if (esImportado) {
			valorRealFinal= ((valorFijoNegocio() + precioBase) * aplicaTasaImportacion);
		} else {
			valorRealFinal= (valorFijoNegocio() + precioBase);
		}
        return valorRealFinal;
	}
}





