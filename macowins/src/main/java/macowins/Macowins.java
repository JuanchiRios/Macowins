package macowins;

import java.util.ArrayList;
import java.util.List;

public class Macowins {

	List<Venta> ventas = new ArrayList<Venta>();
	public Venta inicializarVenta(int cantidad) {
		Venta venta = new Venta();
		ventas.add(venta);
		venta.cantidadPrendas = cantidad;
		return venta;
	}
	
	
	public double crearVenta(int cantidad, String tipoPrenda) {

		if (tipoPrenda == "Saco") {
			Venta venta = inicializarVenta(cantidad);
			Saco saco = new Saco();
			venta.agregarPrenda(saco);
			venta.precioTotal = venta.cantidadPrendas * saco.precioFinal();
			return venta.precioTotal;

		} else if (tipoPrenda == "Camisa") {
			Venta venta = inicializarVenta(cantidad);
			Camisa camisa = new Camisa();
			venta.agregarPrenda(camisa);
			venta.precioTotal = venta.cantidadPrendas * camisa.precioFinal();
			return venta.precioTotal;

		} else if (tipoPrenda == "Pantalon") {

			Venta venta = inicializarVenta(cantidad);
			Pantalon pantalon = new Pantalon();
			venta.agregarPrenda(pantalon);
			venta.precioTotal = venta.cantidadPrendas * pantalon.precioFinal();
			return venta.precioTotal;

		} else {
			return -1;
		}

	}

	

	public double calcularGanancias(){
		double ganancias = 0;
		for (int i = 0; i < ventas.size(); i++){
			ganancias = ganancias + ventas.get(i).precioTotal;
		}
		return ganancias;
	}
}