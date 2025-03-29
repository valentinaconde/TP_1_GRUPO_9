package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
	Empleado[] empleados = new Empleado[5];
	empleados[0]= new Empleado("Juan Perez",45);
	empleados[1]= new Empleado();
	empleados[2]= new Empleado("Luis Gomez",30);
	empleados[3]= new Empleado();
	empleados[4]= new Empleado("Jose Fernandez",50);

	for (Empleado empleado : empleados) {
		System.out.println(empleado.toString());
	}
	System.out.println("El siguiente ID es: "+Empleado.devuelveProximoID());
	}

}
