package macowins;

public class Saco extends Prenda { 

	int precioBase = 300;

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
