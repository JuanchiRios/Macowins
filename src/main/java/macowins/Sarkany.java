package macowins;

public class Sarkany implements Marca{

	
	public double calculoCoeficiente(double precioBase) {
		if(precioBase > 500){
			return 1.35;
		}
		else{
			return 1.10;
		}
		
	}

}
