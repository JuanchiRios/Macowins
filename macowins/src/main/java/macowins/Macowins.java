package macowins;

import java.util.ArrayList;
import java.util.List;

public class Macowins {

	List<Venta> ventas = new ArrayList<Venta>();

	public void crearVenta(Prenda prenda, int cantidad, int fecha) {

		Venta venta = new Venta(prenda, cantidad, fecha);
		this.ventas.add(venta);

	}

	public double calcularGanancias(int fecha) {
		double ganancias = ventas.stream()
				.filter(venta -> venta.getFecha() == fecha)
				.mapToDouble(venta -> venta.getPrecioTotal())
				.sum();
		return ganancias;

	}
}