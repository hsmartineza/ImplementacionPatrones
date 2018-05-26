package Productos;
import java.util.ArrayList;
import java.util.List;


public class Orden {

	private List<Productos> productos = new ArrayList<Productos>();
	
	
	public void agregarProducto(Productos producto) {
		productos.add(producto);
		
	}
	
	public float obtenerPrecio() {
		float precioTotal = 0.0f;
		
	     for (Productos producto : productos) {
	         precioTotal += producto.precio();
	      }		
	      return precioTotal;
	}
	
	public String obtenerNombre() {
		String nombre = "Productos ";
	     for (Productos producto : productos) {
	    	 nombre += producto.nombre();
	      }		
	      return nombre;
	}
	
	public void showItems(){
		   
		for (Productos producto : productos) {
		      System.out.print("Producto : " + producto.nombre() + producto.descripcion());
		      System.out.print(", Pedido : " + producto.pedidoMesa().pedidoMesa());
		      System.out.println(", Precio Total  : " + producto.precio());
		      }		
		   }	
	
	
}
