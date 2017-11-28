package principal;

import java.time.LocalDate;
import java.util.Arrays;

//import java.time.LocalDate;
//import modelo.Estudiante;
//import modelo.Profesor;
import auxiliar.Practica;
import modelo.Datos;
import modelo.Estudiante;

public class Principal {// método por el que debe empezar la ejecución
	public static void main(String[] args) {
		Practica practica = new Practica();
		String[][] resultados = new Datos().getResultados();
		int[] puntuacion = practica.obtenerClasificacion(resultados);
		for (int i : puntuacion) {
			System.out.println(i);
		}

		// int[] lista1 = {29,8,17,24,14,6,35};
		// int[] lista2 = {50,40,8,23};
		// int[] mezcla= practica.mezclaListas3(lista1, lista2);
		// for (int mez : mezcla) {
		// System.out.println(mez);
		// }
		 System.out.println(practica.validarNIF("45352356H"));
			System.exit(0);
		/*
		 * String[] cadenas = { "123", "42", "6x3", "111" }; int[] enteros =
		 * practica.convierteCadenaANumeros(cadenas); for (int entero : enteros) {
		 * System.out.println("numero: " + entero); }
		 */
		/*
		 * float saldo=530.0f; String[] movimientos = { "150.0f", "-25.0f","3x","40.0f",
		 * "-15.0f" }; System.out.println("saldo final: " + practica.calculaSaldo(saldo,
		 * movimientos) + "€");
		 */
		// System.out.println(practica.sumaDigito(53023423));
		//
		/*
		 * String[] cadenas =
		 * {"Pipas","Pal","Pajaro","Vente","Para","Mi","Casa","Que","Tengo","Golosinas"}
		 * ; practica.ordenaCadena(cadenas); for (String cadena : cadenas) {
		 * System.out.println(cadena); }
		 */
		/*
		 * Estudiante estAnonimo = new Estudiante(123); Estudiante estudiante1 = new
		 * Estudiante(111, "44556677G","Carlos", 'M', LocalDate.now(), 187,40 );
		 * Estudiante estudiante2 = new Estudiante(112, "11223344H","Xavier", 'M',
		 * LocalDate.now(), 147, 30); Estudiante estudiante3 = new Estudiante(112,
		 * "99887766F","Marcos", 'M', LocalDate.now(), 163,50); Estudiante[]
		 * listaEstudiante ={estAnonimo,estudiante1,estudiante2,estudiante3};
		 * practica.ordenaEstudiantes(listaEstudiante); for (Estudiante estudiante :
		 * listaEstudiante) { System.out.println(estudiante); }
		 * practica.ordenaEnteros(numeros);
		 */

		// practica.muestraNumerosDe1a1000();
		// practica.muestraFor(1, 5);
		// practica.generaAleatorio2(5, 60, 70);
		// practica.estadisticaCadena2("Hola PepiT@");
		// int[] numeros = practica.generaAleatorio3(5, 1, 6);
		// for (int numero : numeros) {
		// System.out.println(numero);
		// }
		/*
		 * int[] resultados=practica.frecuenciaApariciones(5, 1, 6); for (int resultado
		 * : resultados) { System.out.println(resultado); }
		 */
		/*
		 * practica.diasSemana();
		 * 
		 * for (Estudiante dato : datos.getEstudiantes()) { if( dato != null)
		 * System.out.println(dato); }
		 */
		// Estudiante[][] lista = new Datos().getEstudiantes();
		// practica.listarTodos(lista);
		// int[][] visitantesYear = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, { 1, 2,
		// 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
		// { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
		// 11, 12 },
		// { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
		// 11, 12 },
		// { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, };
		// int isla = 0;
		// int mes = 12;
		// String[] islas = { "GC", "FTV", "LZT", "TNR", "PL", "H", "G" };
		// String[] meses = { "ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO",
		// "SEP", "OCT", "NOV", "DIC" };
		// Datos datos = new Datos();
		// System.out.println("visitas año en " + islas[isla] + " : " +
		// datos.visitantesIslaYear(isla, visitantesYear));
		// System.out.println("visitas totales en Canarias en el mes de " + meses[mes -
		// 1] + ": "+ datos.visitantesMesIslas(mes, visitantesYear));
		// practica.relojArray();
		/*
		 * Persona padre = new Persona(); padre.setNombre("JorgePadre");
		 * padre.setSexo('M'); Persona madre = new Persona();
		 * madre.setNombre("MariaMadre"); madre.setSexo('F');
		 */
		// Profesor profesor1 = new Profesor();
		// System.out.println("Sin parametros");
		// System.out.println(profesor1);
		// System.out.println("Con Parametros");
		// Profesor profesor2 = new Profesor("43423456h", "Pepito", 'M',
		// LocalDate.now(), 160, 30);
		// System.out.println(profesor2);
		// Estudiante estudiante = new Estudiante(12, "nif", "pepito", 'M',
		// LocalDate.now(), 170, 20);
		// System.out.println(estudiante);
		/*
		 * Persona persona; persona = new Persona(); //Persona1
		 * persona.setNombre("Pedrito"); System.out.println("persona creada");
		 * System.out.println("nif:		"+persona.getNif());
		 * System.out.println("nombre:	"+persona.getNombre());
		 * System.out.println("sexo:	"+persona.getSexo());
		 * System.out.println("fecha:	"+persona.getFecha());
		 * System.out.println("altura:	"+persona.getAltura());
		 * System.out.println("Paso:	"+persona.getLongitudPaso());
		 * System.out.println("Padre:	"+persona.getPadre());
		 * System.out.println("Madre:	"+persona.getMadre()); System.out.println(" ");
		 * 
		 * //Persona2 Persona persona2 = new
		 * Persona("45352356J","Ivancito",'M',LocalDate.of(1994,05,
		 * 31),170,58,padre,madre);
		 * System.out.println("nif:		"+persona2.getNif());
		 * System.out.println("nombre:	"+persona2.getNombre());
		 * System.out.println("sexo:	"+persona2.getSexo());
		 * System.out.println("fecha:	"+persona2.getFecha());
		 * System.out.println("altura:	"+persona2.getAltura());
		 * System.out.println("Paso:	"+persona2.getLongitudPaso());
		 * System.out.println("Padre:	"+persona2.getPadre().getNombre());
		 * System.out.println("Madre:	"+persona2.getMadre().getNombre());
		 * System.out.println(" "); System.out.println(persona.getNombre()); int
		 * numPaso= 44; AccesoPersona ap = new AccesoPersona();
		 * System.out.println("Número de pasos:"+numPaso);
		 * System.out.println("Longitud de Paso: "+persona.getLongitudPaso());
		 * System.out.println("Distancia recorrida: "+ap.cuantoAvanza(persona,numPaso)
		 * +" metros"); System.out.println(" ");
		 * System.out.println(persona2.getNombre()); numPaso= 94;
		 * System.out.println("Número de pasos:"+numPaso);
		 * System.out.println("Longitud de Paso: "+persona2.getLongitudPaso());
		 * System.out.println("Distancia recorrida: "+ap.cuantoAvanza(persona2,numPaso)
		 * +" metros");
		 */
	}
}
