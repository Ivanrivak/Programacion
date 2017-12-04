package auxiliar;

public class Equipo {
	private String nombre;
	private int puntos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public Equipo(String nombre, int puntos) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
	}
	public Equipo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
