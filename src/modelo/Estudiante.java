package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Estudiante extends Persona implements Serializable,Comparable<Estudiante>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigoGrupo;
	public Estudiante(int codigoGrupo) {
		super();
		this.codigoGrupo = codigoGrupo;
	}

	public  Estudiante(int codigoGrupo,String nif, String nombre, char sexo, LocalDate fecha, int altura, int longitudPaso) {
		super(nif, nombre, sexo, fecha, altura, longitudPaso);
		this.codigoGrupo = codigoGrupo;
	}

	public int getCodigoGrupo() {
		return codigoGrupo;
	}

	public void setCodigoGrupo(int codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}
	public String toString() {
		return super.toString()+"codigoGrupo: " + this.codigoGrupo;
	}

	public int compareTo(Estudiante estudiante) {
		return this.getNombre().compareTo(estudiante.getNombre());
	}
}
