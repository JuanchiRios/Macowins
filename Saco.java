package TP0;

public class Saco extends Prenda { 

	int precioBase = 300;

	public double precioFinal() {
		if (esImportado) {
			return ((valorFijoNegocio() + precioBase) * aplicaTasaImportacion);
		} else {
			return (valorFijoNegocio() + precioBase);
		}

	}
}
