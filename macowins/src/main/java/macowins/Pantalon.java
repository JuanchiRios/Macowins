package macowins;


public class Pantalon extends Prenda {

	int precioBase = 250;

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

