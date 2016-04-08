package macowins;

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
		localMacowins.crearVenta(unaCamisa, 5, 200116, true);
		localMacowins.crearVenta(unPantalon, 2, 200116, false);
		localMacowins.crearVenta(unSaco,2,210116,false);
		double gananciaDia = localMacowins.calcularGanancias(200116);
		Assert.assertEquals(gananciaDia, 1842.5,0);
	}
}

