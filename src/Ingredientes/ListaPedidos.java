
package Ingredientes;

import java.util.ArrayList;
import java.util.List;

public class ListaPedidos {
	   private List<Preparacion> preparaciones = new ArrayList<Preparacion>(); 

	   public void tomarPreparacion(Preparacion preparar){
		   preparaciones.add(preparar);		
	   }

	   public void colocarPreparaciones(){
	   
	      for (Preparacion preparar : preparaciones) {
	    	  preparar.preparar();
	      }
	      preparaciones.clear();
	   }
}
