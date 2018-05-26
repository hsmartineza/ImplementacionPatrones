package Productos;
public abstract class Gaseosas implements Productos{
	
	@Override
	public Pedido pedidoMesa() {
		return new Bebidas();
	}
	@Override
	public abstract float precio();
	
}
