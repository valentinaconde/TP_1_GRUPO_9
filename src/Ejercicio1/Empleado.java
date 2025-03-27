package Ejercicio1;

public class Empleado {
	private int id;
	private String nombre;
	private int edad;
	
	//punto 4
	static int cont=999;
	
	//punto 5
	//constructor 1
	public Empleado()
	{
		cont++;
		this.id = cont;

		//valores por defecto
		this.nombre = "sin nombre";
		this.edad = 99;
	}
	// constructor 2
	public Empleado(String nombre, int edad) {
		cont++;
		this.id = cont;
		
		//asignacion de parametros 
		this.nombre = nombre;
		this.edad = edad;
	}
		
	//getters and setters 	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Punto 6: Método estático que devuelve el próximo ID
    public static int devuelveProximoID() {
        return cont + 1;
    }
}
