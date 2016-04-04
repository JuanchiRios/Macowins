package macowins;

public abstract class Prenda {
        // Atributos
	
	private double tasaDeImportacion;
	private boolean esPrendaImportada;
	private double valorFijoNegocio;
	    
	    //Constructor Prenda
        
	    public Prenda(){
        	
        	tasaDeImportacion = 1.30;
        	esPrendaImportada = true;
        	valorFijoNegocio = 5.0;
        }
	    
        //Getters y Setters
       
        

	public boolean isEsPrendaImportada() {
			return esPrendaImportada;
		}

		public void setEsPrendaImportada(boolean esPrendaImportada) {
			this.esPrendaImportada = esPrendaImportada;
		}

		//Metodos
		
		public abstract double getPrecioBasePrenda();
        
		public double calculoFinalSegunPrenda(boolean esImportada){
			
			double valorRealFinal = 0;
			if(esImportada){
			  valorRealFinal = ((this.getPrecioBasePrenda()) + (this.valorFijoNegocio)) * (this.tasaDeImportacion);
			  }
			
			else{
			  valorRealFinal = (this.getPrecioBasePrenda()) + (this.valorFijoNegocio);
			}
		
	    return valorRealFinal; 	
		}

	
}

	
	

