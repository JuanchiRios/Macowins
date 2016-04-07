package macowins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Macowins {

	// Atributos

	List<Venta> ventas = new ArrayList<Venta>();

	// Metodos

	public void crearVenta(Venta venta) {

		this.ventas.add(venta);

	}

	public double calcularGanancias(LocalDate fecha) {
		double ganancias = ventas.stream()
				.filter(venta -> venta.getFecha().isEqual(fecha))
				.mapToDouble(venta -> venta.getPrecioTotalVentaPrenda())
				.sum();
		return ganancias;

	}
}