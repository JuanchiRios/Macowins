package TP0;

public class Pantalon extends Prenda {

	int precioBase = 250;

	public double precioFinal() {
		if (esImportado) {
			return ((valorFijoNegocio() + precioBase) * aplicaTasaImportacion);
		} else {
			return (valorFijoNegocio() + precioBase);
		}

	}

}
