
public class AppLaLigaV2 {

	public AppLaLigaV2() {
		// TODO Auto-generated constructor stub
	}
//---------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador j1 = new Jugador();
		
		j1.setNombre("Diego Armando Maradona");
		j1.setEdad(25);
		j1.setPosicion(Puesto.DELANTERO);
		j1.setDorsal(10);
		
		Jugador j2 = new Jugador ("Lionel Messi", Puesto.EXTREMO,10,37,848,true);
		Jugador j3 = new Jugador ("Tierry Henry", Puesto.EXTREMO,11,43,608,false);
		Jugador j4 = new Jugador ("Samuel Eto'o", Puesto.DELANTERO,9,47,421,false);
		Jugador j5 = new Jugador ("Andres Iniesta", Puesto.MEDIOCENTRO,8,47,127,false);
		Jugador j6 = new Jugador ("Xavi Hernandez", Puesto.MEDIOCENTRO,6,49,184,false);
		Jugador j7 = new Jugador ("Sergio Busquets", Puesto.MEDIOCENTRO,5,39,104,true);
		Jugador j8 = new Jugador ("Dani Alves", Puesto.LATERAL_DERECHO,2,47,311,false);
		Jugador j9 = new Jugador ("Gerard Pique", Puesto.DEFENSA,3,37,81,false);

		Entrenador e2 = new Entrenador ("Pep Guardiola",53, 39);
		Entrenador e1 = new Entrenador();
		e1.setNombre("Sir Alex Ferguson");
		e1.setEdad(82);
		e1.setTitutlos(49);
		
		Equipo eq1 = new Equipo ("FC Barcelona","Nou Camp");
	
		Entrenador [] cjto2= {e2,e1};
		
		Jugador[] cjto1= {j3,j4,j5,j6,j7,j8,j9};
		
		Equipo nuevo = new Equipo ("FCB","Camp Nou",cjto1,cjto2);
		
		
	}

}
