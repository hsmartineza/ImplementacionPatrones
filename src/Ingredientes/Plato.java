package Ingredientes;
	
public class Plato {
	
	   private String nombre;
	   private int cantidad;

	   
	   public  Plato(String name, int cantidad) {
		   this.nombre =  name ;
		   this.cantidad = cantidad ;
	   }


	   public void cocinar(){
		   System.out.println("Lista Pedido [ Nombre: " + nombre +",Quantity: " + cantidad +" ] !En Preparacion¡");
	   }	
}
