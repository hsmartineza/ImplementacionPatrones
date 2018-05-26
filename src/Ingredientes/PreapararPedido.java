package Ingredientes;

public class PreapararPedido implements Preparacion {
	private Plato lista;
	
	  public PreapararPedido(Plato lista){
	      this.lista = lista;
	   }

	   public void preparar() {
		   lista.cocinar();
	   }
}
