package macowins;

public class Saco extends Prenda { 
    
	//Atributos
    private double precioBase;
	
   
    //Constructor Saco
    public Saco(boolean importado,Marca unaMarca,int unaCantBotones){
    	
    	precioBase = 300 + (10 * unaCantBotones);
    	this.setMarca(unaMarca);
    	this.setEsPrendaImportada(importado);
    	if(importado){
    		this.setTasaDeImportacion(1.3);;
    	
    	}
    	else{
    		this.setTasaDeImportacion(1);
    	}
    	
      }
    
    //Metodos
    
   public double getPrecioBasePrenda(){
    	return precioBase;
    }

	
}
