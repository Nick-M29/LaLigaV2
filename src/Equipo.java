
public class Equipo {
	
	private String Nombre;
	private String Estadio;
	final int TOT_JUGADORES=20;
	final int TOT_ENTRENADORES=2;
	public Jugador [] Jugadores;
	public Entrenador [] Entrenadores;
	
	public Equipo() {
		this.Jugadores = new Jugador [TOT_JUGADORES];
		this.Entrenadores = new Entrenador [TOT_ENTRENADORES];
	}
	
	public Equipo(String Nombre, String Estadio) {
		this.Nombre= Nombre;
		this.Estadio= Estadio;
		this.Jugadores = new Jugador [TOT_JUGADORES];
		this.Entrenadores = new Entrenador [TOT_ENTRENADORES];
	}

	public Equipo(String nombre, String estadio, Jugador[] jugadores, Entrenador[] entrenadores) {
		super();
		Nombre = nombre;
		Estadio = estadio;
		Jugadores = jugadores;
		Entrenadores = entrenadores;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getEstadio() {
		return Estadio;
	}

	public void setEstadio(String estadio) {
		Estadio = estadio;
	}

	public Jugador[] getJugadores() {
		return Jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		Jugadores = jugadores;
	}

	public Entrenador[] getEntrenadores() {
		return Entrenadores;
	}

	public void setEntrenadores(Entrenador[] entrenadores) {
		Entrenadores = entrenadores;
	}
	
	
	
}
