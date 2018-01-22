package modelo;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Datos {
	private String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo" };
	private Estudiante[][] estudiantes;
	private int numEstudiantes = 30;

	// ejemplo liga
	private String[] equipos = { "RMA", "BCN", "VAL", "SEV", "UDLP" };
	private String[][] resultados = { { "", "3-2", "1-1", "2-0", "3-3" }, // RMA LOCAL
			{ "2-2", "", "3-1", "2-1", "1-2" }, // BCN LOCAL
			{ "1-1", "1-2", "", "2-1", "1-1" }, // VAL LOCAL
			{ "2-2", "1-3", "1-0", "", "3-0" }, // SEV LOCAL
			{ "0-0", "1-2", "2-1", "2-3", "" }, // UDLP LOCAL
	};
	private int[][] puntosJornada= {
			//primera vuelta
			{3,3,1,3,1},
			{1,1,1,0,0},
			{3,0,1,3,1},
			{3,1,1,0,1},
			//segunda vuelta
			{3,3,1,3,1},
			{1,1,1,0,0},
			{3,0,1,3,1},
			{3,1,1,0,1},
	};
	
	public int[][] getPuntosJornada() {
		return puntosJornada;
	}

	public void setPuntosJornada(int[][] puntosJornada) {
		this.puntosJornada = puntosJornada;
	}

	public String[][] getResultados() {
		return resultados;
	}

	public void setResultados(String[][] resultados) {
		this.resultados = resultados;
	}

	public String[] getEquipos() {
		return equipos;
	}

	public void setEquipos(String[] equipos) {
		this.equipos = equipos;
	}

	// Declarar propiedad private, un array de Estudiantes
	// crea getter/setter
	// en el constructor de esta clase inicializar el array
	public String[] getDias() {
		return dias;
	}

	public void setDias(String[] dias) {
		this.dias = dias;
	}

	public Estudiante[][] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[][] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Datos() {
		super();
		// inicializar array estudiantes
		estudiantes = new Estudiante[3][numEstudiantes];
		Estudiante est1 = new Estudiante(0, "nif", "pepito", 'M', LocalDate.now(), 170, 20);
		Estudiante est2 = new Estudiante(5, "nif", "jorgito", 'M', LocalDate.now(), 180, 15);
		Estudiante est3 = new Estudiante(9, "nif", "jaimita", 'F', LocalDate.now(), 165, 10);
		estudiantes[0][0] = est1;
		estudiantes[1][5] = est2;
		estudiantes[2][9] = est3;
	}




	// hora puntual
	public void reloj1() {
		Calendar calendario = Calendar.getInstance();
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		int minutos = calendario.get(Calendar.MINUTE);
		int segundos = calendario.get(Calendar.SECOND);
		System.out.println(hora + ":" + minutos + ":" + segundos);
	}

	// actualizable
	public void reloj2() {
		Timer timer = new Timer();
		TimerTask hora = new TimerTask() {

			@Override
			public void run() {

				Calendar calendario = Calendar.getInstance();
				int hora = calendario.get(Calendar.HOUR_OF_DAY);
				int minutos = calendario.get(Calendar.MINUTE);
				int segundos = calendario.get(Calendar.SECOND);
				System.out.println(hora + ":" + minutos + ":" + segundos);
			}
		};
		timer.schedule(hora, 0, 1000);

	}

}