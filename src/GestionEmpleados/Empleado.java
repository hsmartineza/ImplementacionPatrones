package GestionEmpleados;

public abstract class Empleado {
	
	   abstract void crearEmpleado();
	   abstract void iniciarTurno();
	   abstract void finalizarTurno();
	   abstract void nombre(String name);

	   //template method
	   public final void contratar(String name){

	      //inicializar empleado
		   crearEmpleado();

	      //empezar turno
		   iniciarTurno();

	      //finalizar turno 
		   finalizarTurno();
		   
		   //Nombre de Emepleado
		   nombre(name);
	   }
}
