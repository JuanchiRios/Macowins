package macowins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MacowinspPrueba {
	
	
    private Macowins localMacowins;
	private Pantalon unPantalon;
	private Saco unSaco;
	private Camisa unaCamisa;
	@Before
	public void initialize(){
		unPantalon = new Pantalon();
		unSaco = new Saco();
		unaCamisa = new Camisa();
		localMacowins = new Macowins();
		
	}
    
	@Test
	public void gananciaDelDia(){
		double totalPantalon = localMacowins.crearVenta(3, "Pantalon");
		double totalSaco = localMacowins.crearVenta(2, "Saco");
		double totalCamisa = localMacowins.crearVenta(2, "Camisa");
		double totalListaGanancias = localMacowins.calcularGanancias();
		Assert.assertEquals(totalListaGanancias,1785,0);
		
	}
	@Test
	public void precioPantalon(){
		double importePantalon = unPantalon.precioFinal();
		Assert.assertEquals(importePantalon,255,0);
	}
	@Test
	public void precioSaco(){
		double importeSaco = unSaco.precioFinal();
		Assert.assertEquals(importeSaco,305,0);
	}
	@Test
	public void precioCamisa(){
		double importeCamisa = unaCamisa.precioFinal();
		Assert.assertEquals(importeCamisa,205,0);
	}
	
}

