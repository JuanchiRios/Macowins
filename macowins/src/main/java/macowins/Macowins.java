package macowins;

import java.util.ArrayList;
import java.util.List;

public class Macowins {

	//Atributos
	
	List<Venta> ventas = new ArrayList<Venta>();

	//Metodos
	
	public void crearVenta(Prenda prenda, int cantidad, int fecha, boolean esImportada) {

		Venta venta = new Venta(prenda, cantidad, fecha, esImportada);
		this.ventas.add(venta);

	}

	public double calcularGanancias(int fecha) {
		double ganancias = ventas.stream()
				.filter(venta -> venta.getFecha() == fecha)
				.mapToDouble(venta -> venta.getPrecioTotalVentaPrenda())
				.sum();
		return ganancias;

	}
}