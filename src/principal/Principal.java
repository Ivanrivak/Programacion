package principal;

//import java.time.LocalDate;
//import modelo.Estudiante;
//import modelo.Profesor;
import auxiliar.Practica;

public class Principal {// método por el que debe empezar la ejecución
	public static void main(String[] args) {
		Practica practica = new Practica();
		practica.generaFicheroLanzamientosDado(5, "ficheros/lanzamientos.txt");
		System.exit(0);
		
		/*	int[][] matriz = { { 3, 4, 8 }, { 6 }, { 5, 9 }, };
		ArrayList<ArrayList<Integer>> matrizlista=new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < matriz.length; i++) {
			matrizlista.add(new ArrayList<Integer>());
			for (int j = 0; j < matriz[i].length; j++) {
				matrizlista.get(i).add(matriz[i][j]);
			}
		}

		practica.recorrerMatrizIrregularPorColumna2(matrizlista);

		
		int[][] puntosJornada = new Datos().getPuntosJornada();
	
		ArrayList<ArrayList<Integer>> puntosJornadaLista = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < puntosJornada.length; i++) {
			puntosJornadaLista.add(new ArrayList<Integer>());
			for (int j = 0; j < puntosJornada[i].length; j++) {
				puntosJornadaLista.get(i).add(puntosJornada[i][j]);
			}
		}
		Equipo[] puntos = practica.obtenerClasificacion3(puntosJornada);
		ArrayList<Equipo> puntoslista = practica.obtenerClasificacion3(puntosJornadaLista);
		
		for (Equipo equipo : puntos) {
			System.out.println(equipo.getNombre());
		}
		System.out.println("arraylist");
		for (Equipo equipo : puntoslista) {
			System.out.println(equipo.getNombre());
		}

		
		String[][] resultados = {
				{"","2-2","2-1","0-0","3-0"},
				{"1-1","","0-0","1-1","1-1"},
				{"0-3","3-2","","4-2","0-3"},
				{"1-0","1-1","0-2","","1-2"},
				{"2-1","2-1","1-0","","2-1"},
		};
		ArrayList<ArrayList<String>> resultadosLista = new ArrayList<ArrayList<String>>();
		
		for (int i = 0; i < resultados.length; i++) {
			resultadosLista.add(new ArrayList<String>());
			for (int j = 0; j < resultados[i].length; j++) {
				resultadosLista.get(i).add(resultados[i][j]);
			}
		}
		ArrayList<Integer> clasificacion = practica.obtenerClasificacion2(resultadosLista);
		for (Integer integer : clasificacion) {
			System.out.println(integer);
		}
System.out.println("array");
		int[] clasificacion2 = practica.obtenerClasificacion2(resultados);
		for (Integer integer : clasificacion2) {
			System.out.println(integer);
		}

		float saldo=530.0f;
		Float[] movimientos = { 150.52f, -25.0f,3f,40.0f,-15.0f };
		ArrayList<Float> movimientosList= new ArrayList<Float>();
		for (Float movimiento : movimientos) {
			movimientosList.add(movimiento);
		}
		
		System.out.println(practica.calculaSaldo(saldo, movimientosList));
		HashMap<String, ArrayList<Float>> ventas = practica.resumenVentasVendedor("ficheros/ventas.txt");
		practica.resumenVentasPorVendedor(ventas);

		
		practica.leerFicherosHashMap("ficheros/persona.txt");
		ArrayList <String> resultado= practica.leerFicheroArrayList("ficheros/persona.txt");
		for (String string : resultado) {
			System.out.println(string);
		}

		
		HashMap<String, Estudiante> mapa = practica.introMapas();
		Estudiante noexisto = mapa.get("noexisto");
		

		
	
		
		int[][] visitantesYear = {
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, 
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
			 };

		ArrayList<ArrayList<Integer>> resultado= practica.convierteMatrizArrayLista(visitantesYear);
		
		for (ArrayList<Integer> numeros : resultado) {
			System.out.println("FILAA");
			for (int filas : numeros) {
				System.out.println(filas);
			}
		}
			
		int[] numeros= {4,3,21,34,2};
		ArrayList<Integer> lista1= new ArrayList<Integer>();
		for (int numero : numeros) {
			lista1.add(numero);
		}
		int[] numeros2= {6,2,4};
		ArrayList<Integer> lista2= new ArrayList<Integer>();
		for (int numero2 : numeros2) {
			lista2.add(numero2);
		}
		
		ArrayList<Integer>mezclas=practica.mezclaListas(lista1, lista2);
		for (Integer mezcla : mezclas) {
			System.out.println(mezcla);
		}

		ArrayList<Estudiante> ordenar = practica.introListas();
		practica.ordenaEstudiantes(ordenar);
		for (Estudiante orden : ordenar) {
			System.out.println(orden);
		}
		
		
		 String[] cadenas ={"Pipas","Pal","Pajaro","Vente","Para","Mi","Casa","Que","Tengo","Golosinas"};
			ArrayList<String> listacadenas= new ArrayList<String>();
			for (String cadena : cadenas) {
				listacadenas.add(cadena);
			}
			
		 practica.ordenaCadena(cadenas);
		 	
		int[] numeros= {4,3,21,34,2};
		ArrayList<Integer> listanumeros= new ArrayList<Integer>();
		for (int numero : numeros) {
			listanumeros.add(numero);
		}
		practica.ordenaEnteros(listanumeros);
		
		ArrayList<Integer>frecuencias= practica.frecuenciaApariciones1(5, 1, 6);
		//int[] frecuencias=practica.frecuenciaApariciones(5, 1,6 );
		for (int frecuencia : frecuencias) {
			System.out.println(frecuencia);
		}
		
		//String[] cadenas = { "123", "42", "6x3", "111" };
		ArrayList<Integer> lista=practica.convierteCadenaANumeros(cadenas);
		for (Integer list : lista) {
			System.out.println(list);
		}

		practica.listaEstudiantes(practica.introListas());
*/
		// PRIMERA EVALUACION
		/*int[][] matriz = { { 3, 4, 8 }, { 6 }, { 5, 9 }, };
		Integer[][] matriz2 = { { 3, 4, null, 8 }, { 6, 7, 12, null, 34 }, { 5, null, 9 }, };
		// practica.recorrerMatrizIrregularPorColumna(matriz);
		practica.recorrerMatrizIrregularPorColumna2(matriz2);*/
		/*
		 * int[] primos = practica.numerosPrimos(15); for (int primo : primos) {
		 * System.out.println(primo); }
		 */
		/*
		 * int[] fibos=practica.numeroFibonacci(10); for (int fibo : fibos) {
		 * System.out.println(fibo); }
		 */
		/*
		 * int[][] puntosJornada = new Datos().getPuntosJornada(); Equipo[]
		 * clasificacion = practica.obtenerClasificacion3(puntosJornada); for (Equipo
		 * equipo : clasificacion) {
		 * System.out.println(equipo.getNombre()+" "+equipo.getPuntos()); }
		 */
		// int x=1;
		// System.out.println("El numero "+ x + (practica.esPrimo(x)?" ES ":" NO ES
		// ")+"PRIMO");
		// int[] lista1 = {29,8,17,24,14,6,35};
		// int[] lista2 = {50,40,8,23};
		// int[] mezcla= practica.mezclaListas3(lista1, lista2);
		// for (int mez : mezcla) {
		// System.out.println(mez);
		// }
		// System.out.println(practica.validarNIF("45352356H"));
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
