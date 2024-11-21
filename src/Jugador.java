
public class Jugador {
	
	private String nombre;
	private Puesto posicion;
	private int dorsal;
	private int edad;
	private int goles=0;
	private boolean activo;
	
	public Jugador() {
		this.dorsal=-1;
		this.activo=true;
	}
	
	public Jugador(String nombre, Puesto posicion, int dorsal, int edad, int goles, boolean activo) {
		this.nombre=nombre;
		this.posicion=posicion;
		this.dorsal=dorsal;
		this.edad=edad;
		this.goles=goles;
		this.activo=activo;
	}
	
	public int getDorsal() {return this.dorsal;}
	
	public void setDorsal(int dorsal) {this.dorsal =dorsal;}
	
	public int getGoles() {return this.goles;}
	
	public void setGoles(int goles) {this.goles =goles;}
	
	public int getEdad() {return this.edad;}
	
	public void setEdad(int edad) {this.edad =edad;}
		
	public String getNombre() {return nombre;}
	
	public void setNombre(String nombre) {this.nombre =nombre;}
	
	public Puesto getPosicion() {return this.posicion;}
	
	public void setPosicion(Puesto posicion) {this.posicion =posicion;}
	
	public boolean isActivo() {return this.activo;}
	
	public void setActivo(boolean activo) {this.activo=activo;}

}

	