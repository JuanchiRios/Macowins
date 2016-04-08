package macowins;

import java.util.ArrayList;
import java.util.List;

public class Venta {

	//Atributos
	private int cantidadPrendas;
	private double precioTotalVentaPrenda;
	private int fecha;
	List<Prenda> prendas = new ArrayList<Prenda>();
	
	//Constructor Venta
	public Venta(Prenda prenda, int cantidad, int fecha, boolean esImportada){
		this.setCantidadPrendas(cantidad);
		this.prendas.add(prenda);
		setPrecioTotalVentaPrenda((prenda.calculoFinalSegunPrenda(esImportada) * cantidad));
		this.setFecha(fecha);
	}
    // Getters y Setters
	
	public int getCantidadPrendas() {
		return cantidadPrendas;
	}

	public void setCantidadPrendas(int cantidadPrendas) {
		this.cantidadPrendas = cantidadPrendas;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public double getPrecioTotalVentaPrenda() {
		return precioTotalVentaPrenda;
	}

	public void setPrecioTotalVentaPrenda(double precioTotalVentaPrenda) {
		this.precioTotalVentaPrenda = precioTotalVentaPrenda;
	}
	


}