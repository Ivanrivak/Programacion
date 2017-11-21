package modelo;

import java.time.LocalDate;

public class Profesor extends Persona{
	private int codDepto;
	private LocalDate fechaIngreso;

	public int getCodDepto() {
		return codDepto;
	}
	public void setCodDepto(int codDepto) {
		this.codDepto = codDepto;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Profesor() {
		super();

	}
	public Profesor(String nif, String nombre, char sexo, LocalDate fecha, int altura, int longitudPaso) {
		super(nif, nombre, sexo, fecha, altura, longitudPaso);

	}
	public String toString() {
		return super.toString()+ "codDepto: " + this.codDepto + " fechaIngreso: " +this.fechaIngreso;
	}
}
