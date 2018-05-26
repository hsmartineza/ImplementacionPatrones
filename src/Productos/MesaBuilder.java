package Productos;

public class MesaBuilder {

	public Orden ordenarCombo() {
		Orden orden = new Orden();
		orden.agregarProducto(new FileteRes());
		orden.agregarProducto(new Quatro());
	    return orden;
	}
		
}
