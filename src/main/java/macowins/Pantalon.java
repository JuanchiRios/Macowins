package macowins;


public class Pantalon extends Prenda {
    
	//Atributos
	private double precioBase;
	private double telaUsada;
	//Constructor Pantalon
    public Pantalon(boolean importado,Marca unaMarca,double unaTelaUsada){
    	telaUsada = unaTelaUsada;
    	precioBase = 250 + telaUsada;
    	this.setEsPrendaImportada(importado);
    	this.setMarca(unaMarca);
    	if(importado){
    		this.setTasaDeImportacion(1.3);
    	
    	}
    	else{
    		this.setTasaDeImportacion(1.0);
    	}
    	
      }
    	
    	
    
    //Metodos
    
   public double getPrecioBasePrenda(){
    	return precioBase;
    }
}


