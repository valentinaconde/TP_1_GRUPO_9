package Ejercicio1;

public class Empleado {
	private int id;
	private String nombre;
	private int edad;
	
	//punto 4
	static int cont=999;
	
	//constructor
	public Empleado()
	{
		cont++;
		this.id = cont;
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
