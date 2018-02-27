package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Persona implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLongitudPaso() {
		return longitudPaso;
	}
	public void setLongitudPaso(int longitudPaso) {
		this.longitudPaso = longitudPaso;
	}
	public Persona getPadre() {
		return padre;
	}
	public void setPadre(Persona padre) {
		this.padre = padre;
	}
	public Persona getMadre() {
		return madre;
	}
	public void setMadre(Persona madre) {
		this.madre = madre;
	}
	public static int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		Persona.contador = contador;
	}
	private String nif;	
	private String nombre;
	private char sexo; // 'M' 'F'
	private LocalDate fecha;
//	private Integer altura;
	private int altura;
	private int longitudPaso; // centímetros
	private Persona padre;
	private Persona madre;
	private static int contador = 0; // static porque es de la clase persona
	// tipos posibles
	// primitivos: int, boolean, float, double
	// clases: Date; Random,....	
	
	public Persona() // contructor sin parametros
	{
		this.nif = "44882229Y";
		this.nombre="Anonimo";
		this.sexo = 'F';
		this.fecha = LocalDate.now();
		this.altura =180;
		this.longitudPaso=30;
		contador++;
	}
	
	public Persona(String nif, String nombre, char sexo, LocalDate fecha, int altura, int longitudPaso) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.sexo = sexo;
		this.fecha = fecha;
		this.altura = altura;
		this.longitudPaso = longitudPaso;
		contador++;
	}

	public Persona(String nif, String nombre, char sexo, LocalDate fecha, int altura,Persona padre,
			Persona madre) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.sexo = sexo;
		this.fecha = fecha;
		this.altura = altura;
		this.padre = padre;
		this.madre = madre;
		contador++;
	}
	public float caminar (int numPasos) //cabecera, declaración, prototipo o firma
	//Implementación
	{ 
		float numMetros = (numPasos*longitudPaso)/100;
		return numMetros;
	}

	public String toString() {
	return "\nnombre: "+ this.nombre +" sexo: "+ this.sexo + " ";
	}
}