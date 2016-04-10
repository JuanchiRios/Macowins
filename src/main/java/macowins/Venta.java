package macowins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {

	//Atributos
	private int cantidadPrendas;
	
	private LocalDate fecha;
	List<Prenda> prendas = new ArrayList<Prenda>();

	private Prenda unaPrenda;
	
	//Constructor Venta
	public Venta(Prenda prenda, int cantidad, String fecha){
		this.setCantidadPrendas(cantidad);
		this.prendas.add(prenda);
		unaPrenda = prenda;
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

	//Metodos
	
	public double calculoVenta(){
		
		return unaPrenda.calculoFinalSegunPrenda() * this.getCantidadPrendas();
	}
	
		
}
	
	


