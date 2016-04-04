package macowins;

public abstract class Prenda {
        
	    private double precioBase;
		private double tasaImp;
		private double valorFijoNegocio;
		private boolean esImportada;
		
		public double getPrecioBase() {
			return precioBase;
		}

		public Prenda(double precioBase,double tasaImp,double valorFijoNegocio,boolean esImportada){
			this.precioBase = 0;
			this.tasaImp = 1.30;
			this.valorFijoNegocio = 100.0;
			this.setEsImportada(true);
		}
	
		public double calculoFinalSegunPrenda(Prenda unaPrenda, boolean esImportada){
			
			double valorRealFinal = 0;
			if(esImportada){
			  valorRealFinal = ((unaPrenda.getPrecioBase()) + (unaPrenda.valorFijoNegocio)) * (unaPrenda.tasaImp);
			  }
			
			else{
			  valorRealFinal = (unaPrenda.getPrecioBase()) + (unaPrenda.valorFijoNegocio);
			}
		
	    return valorRealFinal; 	
		}

		public boolean isEsImportada() {
			return esImportada;
		}

		public void setEsImportada(boolean esImportada) {
			this.esImportada = esImportada;
		}
}

	
	

