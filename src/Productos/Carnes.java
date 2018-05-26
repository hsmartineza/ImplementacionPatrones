package Productos;
public abstract class Carnes implements Productos {
	
	@Override
	 public Pedido pedidoMesa() {
	      return new PlatosFuertes();
	   }
	
	@Override
	public abstract float precio();
	
	
}
