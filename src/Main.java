import java.util.ArrayList;
import java.util.List;

import GestionEmpleados.Cocinero;
import GestionEmpleados.Empleado;
import GestionEmpleados.Mesero;
import Ingredientes.ListaPedidos;
import Ingredientes.Plato;
import Ingredientes.PreapararPedido;
import Productos.MesaBuilder;
import Productos.Orden;
import Productos.Restaurant;

public class Main {
	   public static void main(String[] args) {

		   	  // Inicializando los empleados para el dia
		   	 System.out.println("*****Inicio  de  turno trabajadores******");
		   	 Empleado empleado = new Cocinero();
		   	 empleado.contratar("Juan");
		   	 System.out.println();
		   	 empleado = new Mesero();
		   	 empleado.contratar("Jose");
		   	 
		   	 // Inicializando mesas y ordenes
		   	 System.out.println("*****Pedidos de  las mesas******");

			  List<MesaBuilder> mesas = new ArrayList<MesaBuilder>();
			  
		      Restaurant restaurante = Restaurant.getInstance();
		      restaurante.showMessage();
			  
			  MesaBuilder mesaUno = new MesaBuilder();
			  MesaBuilder mesaDos = new MesaBuilder();
			  
			  Orden ordenUno = mesaUno.ordenarCombo();
			  ordenUno.showItems();
			  Orden ordenDos = mesaDos.ordenarCombo();
			  ordenDos.showItems();
			  
			  mesas.add(mesaUno);
			  mesas.add(mesaDos);
			  //Preparacion de ordenes
			  
			  
			
			
				
				for (MesaBuilder mesa : mesas) {
						 System.out.println(mesa.ordenarCombo().obtenerNombre());
				    	 Plato  plato = new Plato(mesa.ordenarCombo().obtenerNombre(),3);
				    	 PreapararPedido pedidopreparacion = new PreapararPedido(plato);
				    	 ListaPedidos lista = new ListaPedidos();
				    	 lista.tomarPreparacion(pedidopreparacion);
				    	 
				    	 lista.colocarPreparaciones();
				      }		
				 
			  
			  // Calculo de Ventas Restaurante


		      float costo = restaurante.TotalVentas(mesas);

		      //Muestra mensaje
		
		      System.out.println("Ventas Total Día:"+ costo);

		      
		      
		   }
}
