package macowins;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Prueba {
	private Pantalon unPantalon;
	private Camisa unaCamisa;
	private Saco unSaco;
	
	private Macowins localMacowins;
    
	@Before
	public void initialize(){
		unPantalon = new Pantalon();
		unaCamisa = new Camisa();
		unSaco = new Saco();
		localMacowins = new Macowins();
		}
	
	@Test
	public void cuantoCuestaUnPantalon(){
		double precioPantalon;
		precioPantalon = unPantalon.calculoFinalSegunPrenda(true);
		Assert.assertEquals(331.5,precioPantalon,0);
	}
	
	@Test
	public void laGananciaDelDia(){
		
		Venta ventaCamisa = new Venta(unaCamisa, 5, "2016-01-20", true);
		Venta ventaPantalon = new Venta(unPantalon, 2, "2016-01-20", false);
		Venta ventaSaco = new Venta(unSaco,2,"2016-01-21",false);
		
		localMacowins.crearVenta(ventaCamisa);
		localMacowins.crearVenta(ventaPantalon);
		localMacowins.crearVenta(ventaSaco);
		
		String fechaGanancias = "2016-01-20";
		
		double gananciaDia = localMacowins.calcularGanancias(LocalDate.parse(fechaGanancias));
		Assert.assertEquals(gananciaDia, 1842.5,0);
	}
}

