package macowins;

public abstract class Prenda {
	// Atributos

	private double tasaDeImportacion;
	private boolean esPrendaImportada;
	private double valorFijoNegocio;
    private Marca marca;
	// Constructor Prenda

	public Prenda() {

		tasaDeImportacion = 1.30;
		esPrendaImportada = true;
		valorFijoNegocio = 5.0;
	}

	// Getters y Setters

	public boolean isEsPrendaImportada() {
		return esPrendaImportada;
	}

	public void setEsPrendaImportada(boolean esPrendaImportada) {
		this.esPrendaImportada = esPrendaImportada;
	}

	// Metodos

	public abstract double getPrecioBasePrenda();

	public double sumaFijaPrenda() {
		return (this.getPrecioBasePrenda() + this.valorFijoNegocio) * marca.calculoCoeficiente(this.getPrecioBasePrenda());
	}

	public double calculoFinalSegunPrenda() {

		return this.sumaFijaPrenda() * this.getTasaDeImportacion();
	}

	public double getTasaDeImportacion() {
		return tasaDeImportacion;
	}

	public void setTasaDeImportacion(double tasaDeImportacion) {
		this.tasaDeImportacion = tasaDeImportacion;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
