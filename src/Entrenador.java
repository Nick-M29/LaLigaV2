
public class Entrenador {
	
	private String nombre;
	private int edad;
	private int titulos;
	
	
	public Entrenador() {
		
	}
	
	public Entrenador(String nombre, int edad, int titulos) {
		this.nombre=nombre;
		this.edad=edad;
		this.titulos=titulos;
	}
	
	public String getNombre() {return this.nombre;}
	
	public void setNombre(String nombre) {this.nombre=nombre;}
	
	public int getEdad() {return this.edad;}
	
	public void setEdad(int edad) {this.edad=edad;}
	
	public int getTitulos() {return this.titulos;}
	
	public void setTitutlos(int titulos) {this.titulos=titulos;}
	
}
