package macowins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {

	//Atributos
	private int cantidadPrendas;
	private double precioTotalVentaPrenda;
	private LocalDate fecha;
	List<Prenda> prendas = new ArrayList<Prenda>();
	
	//Constructor Venta
	public Venta(Prenda prenda, int cantidad, String fecha, boolean esImportada){
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

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = LocalDate.parse(fecha);
	}

	public double getPrecioTotalVentaPrenda() {
		return precioTotalVentaPrenda;
	}

	public void setPrecioTotalVentaPrenda(double precioTotalVentaPrenda) {
		this.precioTotalVentaPrenda = precioTotalVentaPrenda;
	}
	


}