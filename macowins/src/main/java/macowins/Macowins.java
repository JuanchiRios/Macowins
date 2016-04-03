package macowins;

import java.util.ArrayList;
import java.util.List;

public class Macowins {

	List<Venta> ventas = new ArrayList<Venta>();

	public void crearVenta(Prenda prenda, int cantidad, int fecha) {

		Venta venta = new Venta(prenda, cantidad, fecha);
		this.ventas.add(venta);

	}

	public double calcularGanancias() {
		double ganancias = 0;
		for (int i = 0; i < ventas.size(); i++) {
			ganancias = ganancias + ventas.get(i).getPrecioTotal();
		}
		return ganancias;
	}
}