package GestionEmpleados;
public class Cocinero extends Empleado{

	   @Override
	   void crearEmpleado(){
	      System.out.println("Empleado Creado");
	   }

	   @Override
	   void iniciarTurno() {
	      System.out.println("Turno de empleado iniciado");
	   }

	   @Override
	   void finalizarTurno() {
	      System.out.println("Turno de empleado finalizado");
	   }
	   @Override
	   void nombre(String name) {
		   System.out.println("El nombre del empleado es" + name);

	   }
}
