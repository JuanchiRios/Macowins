package macowins;

import java.util.ArrayList;
import java.util.List;

public class Venta {

	private int cantidadPrendas;
	private double precioTotal;
	private int fecha;
	List<Prenda> prendas = new ArrayList<Prenda>();
	
	public Venta(Prenda prenda, int cantidad, int fecha){
		this.setCantidadPrendas(cantidad);
		this.prendas.add(prenda);
		this.setPrecioTotal(prenda.precioFinal() * cantidad);
		this.setFecha(fecha);
	}

	public int getCantidadPrendas() {
		return cantidadPrendas;
	}

	public void setCantidadPrendas(int cantidadPrendas) {
		this.cantidadPrendas = cantidadPrendas;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	


}