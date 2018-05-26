package Productos;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	List<MesaBuilder> mesas = new ArrayList<MesaBuilder>();

	private static Restaurant restaurantInstance = new Restaurant();
	
	
	private Restaurant(){
	
	
	}
	
	 
	public static Restaurant getInstance(){
	      return restaurantInstance;
	   }
	
	public void showMessage(){
		      System.out.println("Dia iniciado en Restaurante");
		   }
	public float TotalVentas(List<MesaBuilder> mesas)
	{
		float precioTotal = 0.0f;
		
	     for (MesaBuilder mesa : mesas) {
	    	 precioTotal  += mesa.ordenarCombo().obtenerPrecio();
	      }		
	      return precioTotal;
	 }
}
