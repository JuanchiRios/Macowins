package TP0;

public class Camisa extends Prenda {


	int precioBase = 200;

	public double precioFinal() {
		if (esImportado) {
			return ((valorFijoNegocio() + precioBase) * aplicaTasaImportacion);
		} else {
			return (valorFijoNegocio() + precioBase);
		}

	}

}
