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
	private Sarkany rickySarkany;
	private Armani armani;
    
	@Before
	public void initialize(){
		rickySarkany = new Sarkany();
		armani = new Armani();
		unPantalon = new Pantalon(false,rickySarkany,10);
		unaCamisa = new Camisa(true,rickySarkany);
		unSaco = new Saco(false,armani,3);
		localMacowins = new Macowins();
		}
	
	@Test
	public void cuantoCuestaUnPantalon(){
		double precioPantalon = unPantalon.calculoFinalSegunPrenda();;
		Assert.assertEquals(291.5,precioPantalon,0);
	}
	
	@Test
	public void laGananciaDelDia(){
		Venta ventaCamisa = new Venta(unaCamisa, 1, "2016-01-20");
		Venta ventaPantalon = new Venta(unPantalon, 1, "2016-01-20");
		Venta ventaSaco = new Venta(unSaco,2,"2016-01-21");
		
		localMacowins.crearVenta(ventaCamisa);
		localMacowins.crearVenta(ventaPantalon);
		localMacowins.crearVenta(ventaSaco);
		
		String fechaGanancias = "2016-01-20";
		
		double gananciaDia = localMacowins.calcularGanancias(LocalDate.parse(fechaGanancias));
		
		Assert.assertEquals(gananciaDia, 584.65,0.1);
	}
}

