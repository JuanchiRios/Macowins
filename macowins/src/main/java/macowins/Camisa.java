package macowins;
	
	
public class Camisa extends Prenda {
    
	//Atributos
	private double precioBase;
	
	//Constructor Camisa
    public Camisa(boolean importado,Marca unaMarca){
    	precioBase = 200;
    	this.setMarca(unaMarca);
    	this.setEsPrendaImportada(importado);
    	if(importado){
    		this.setTasaDeImportacion(1.30);
    	
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




