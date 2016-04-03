package macowins;

public abstract class Prenda {

	protected double valorFijoNegocio = 5.0;
	protected double aplicaTasaImportacion = 1.30;
	protected int precioBase = 0;
	protected boolean esImportado = true;

	public double precioFinal() {
		double valorRealFinal = 0;
		if (esImportado) {
			valorRealFinal = ((valorFijoNegocio + precioBase) * aplicaTasaImportacion);
		} else {
			valorRealFinal = (valorFijoNegocio + precioBase);
		}
		return valorRealFinal;
	}
}
