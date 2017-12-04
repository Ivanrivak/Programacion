package auxiliar;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import modelo.Datos;
import modelo.Estudiante;

public class Practica {

	public void muestraNumerosDe1a1000() {
		int a = 1;
		while (a <= 1000) {
			System.out.println("x:" + a);
			a++;
		}
	}

	public void muestraNumeros(int numero1, int numero2) {
		if (numero1 <= numero2) {
			while (numero1 <= numero2) {
				System.out.println("x:" + numero1);
				numero1++;
			}
		} else {
			System.out.println("el primer número tiene que ser menor que el segundo");
		}
	}

	public void muestraFor(int numero1, int numero2) {
		if (numero1 <= numero2) {
			for (int x = numero1; x <= numero2; x++) {
				System.out.println("x:" + numero1);
			}
		} else {
			System.out.println("el primer número tiene que ser menor que el segundo");
		}
	}

	public void generaAleatorio(int cuantos, int inferior, int superior) {

		for (int y = 0; y < cuantos; y++) {
			System.out.println((int) (inferior + (Math.random()) * (superior - inferior + 1)));
		}
	}

	public void generaAleatorio2(int cuantos, int inferior, int superior) {
		Random random = new Random();
		for (int i = 0; i < cuantos; i++) {
			System.out.println(inferior + random.nextInt(superior - inferior + 1));
		}
	}

	// mostrar caracter por caracter en pantalla
	public void estadisticaCadena(String cadena) {
		int x = 0;
		while (x < cadena.length()) {
			System.out.println(cadena.charAt(x));
			x++;
		}
	}

	public void estadisticaCadena2(String cadena) {
		int contador = 0;
		int contador2 = 0;
		int contador3 = 0;
		for (int x = 0; x < cadena.length(); x++) {

			int caracter = (int) cadena.charAt(x);
			// contador de vocales
			if (caracter == 97 || caracter == 101 || caracter == 105 || caracter == 111 || caracter == 117
					|| caracter == 65 || caracter == 69 || caracter == 73 || caracter == 79 || caracter == 85) {
				contador++;
			}
			// contador de mayusculas
			if (caracter >= 65 && caracter <= 90) {
				contador2++;
			}
			// contador de caracteres especiales
			if (caracter >= 33 && caracter <= 47 || caracter >= 58 && caracter <= 64 || caracter >= 91 && caracter <= 96
					|| caracter >= 123 && caracter <= 126) {
				contador3++;
			}
		}
		System.out.println("hay estas vocales: " + contador + " en " + "\"" + cadena + "\"");
		System.out.println("El string tiene " + contador2 + " mayusculas");
		System.out.println("hay " + contador3 + " caracteres especiales");
	}

	// random con Array
	public int[] generaAleatorio3(int cuantos, int inferior, int superior) {
		Random random = new Random();
		int[] numeros = new int[cuantos];
		for (int i = 0; i < cuantos; i++) {
			numeros[i] = inferior + random.nextInt(superior - inferior + 1);
		}

		return numeros;
	}

	public int[] frecuenciaApariciones(int cuantos, int inferior, int superior) {
		int[] frecuencias = new int[superior - inferior + 1];
		int[] lanzamientos = this.generaAleatorio3(cuantos, inferior, superior);
		for (int x = 0; x < lanzamientos.length; x++) {
			frecuencias[lanzamientos[x] - 1]++;
		}
		return frecuencias;
	}

	public void diasSemana() {
		// String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
		// "Sabado", "Domingo" };
		Datos datos = new Datos();
		for (String dia : datos.getDias()) {
			System.out.println(dia);
		}
	}

	public void listaEstudiantes(Estudiante[] lista) {
		for (Estudiante estudiante : lista) {
			// if(estudiante != null)
			try {
				System.out.println("nombre: " + estudiante.getNombre());
			} catch (NullPointerException e) {
			}
		}
	}

	public void listarTodos(Estudiante[][] todos) {
		int contador = 0;
		int contador2 = 0;
		for (int i = 0; i < todos.length; i++) {
			for (int j = 0; j < todos[i].length; j++) {
				if (todos[i][j] != null)
					contador++;
			}
		}
		Estudiante[] estudiantes2 = new Estudiante[contador];

		for (int i = 0; i < todos.length; i++) {
			for (int j = 0; j < todos[i].length; j++) {
				if (todos[i][j] != null) {
					System.out.println("nombre: " + todos[i][j].getNombre());
					estudiantes2[contador2] = todos[i][j];
					contador2++;
				}
			}
		}
		for (Estudiante estudiante : estudiantes2) {
			System.out.println(estudiante);
			;
		}

	}

	public void relojArray() {
		int[][][] hora = new int[24][60][60];
		for (int i = 0; i < hora.length; i++) {
			for (int j = 0; j < hora[i].length; j++) {
				int contador = 0;
				for (int j2 = 0; j2 < hora[i][j].length; j2++) {
					hora[i][j][j2] = contador;
					contador++;
				}
			}
		}
		int contador = 0;
		for (int i = 0; i < hora.length; i++) {
			int contador2 = 0;
			for (int j = 0; j < hora[i].length; j++) {
				for (int j2 = 0; j2 < hora[i][j].length; j2++) {
					try {
						System.out.println(contador + ":" + contador2 + ":" + hora[i][j][j2]);
						Thread.sleep(1000);
					} catch (Exception e) {
					}
					;
				}
				contador2++;
			}
			contador++;
		}
	}

	public int[] convierteCadenaANumeros(String[] cadenas) {
		int[] resultado = new int[cadenas.length];
		for (int i = 0; i < cadenas.length; i++) {
			try {
				resultado[i] = Integer.parseInt(cadenas[i]);
			} catch (NumberFormatException e) {
				resultado[i] = -1;
			}
		}
		return resultado;
	}

	public float calculaSaldo(float saldo, String[] movimientos) {
		float resultado = saldo;
		for (int i = 0; i < movimientos.length; i++) {
			try {
				resultado += Float.parseFloat(movimientos[i]);
			} catch (NumberFormatException e) {
			}
		}
		return resultado;
	}

	public int sumaDigito(int numero) {
		int resultado = 0;
		while (numero != 0) {
			resultado += numero % 10;
			numero = numero / 10;
		}
		return resultado;
	}

	public void ordenaEnteros(int[] numeros) {
		int aux;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[i] > numeros[j]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}

	public void ordenaCadena(String[] cadenas) {
		String aux;
		for (int i = 0; i < cadenas.length; i++) {
			for (int j = i + 1; j < cadenas.length; j++) {
				if (cadenas[i].compareTo(cadenas[j]) > 0) {
					aux = cadenas[i];
					cadenas[i] = cadenas[j];
					cadenas[j] = aux;
				}
			}
		}
	}

	public void ordenaEstudiantes(Estudiante[] estudiantes) {
		for (int i = 0; i < estudiantes.length - 1; i++) {
			for (int j = i + 1; j < estudiantes.length; j++) {
				if (estudiantes[i].compareTo(estudiantes[j]) > 0) {
					Estudiante aux = estudiantes[i];
					estudiantes[i] = estudiantes[j];
					estudiantes[j] = aux;
				}
			}
		}
	}

	// Mezclar arrays de enteros eficientemente
	public int[] mezclaListas(int[] lista1, int[] lista2) {
		int[] mezcla = new int[lista1.length + lista2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < mezcla.length) {
			if (j < lista1.length) {
				mezcla[i] = lista1[j];
				j++;
			} else if (k < lista2.length) {
				mezcla[i] = lista2[k];
				k++;
			}
			i++;
		}
		Arrays.sort(mezcla);
		return mezcla;
	}

	// Mezclar arrays de enteros menos eficiente
	public int[] mezclaListas2(int[] lista1, int[] lista2) {
		Arrays.sort(lista1);
		Arrays.sort(lista2);
		int[] mezcla = new int[lista1.length + lista2.length];
		int i = 0, j = 0, k = 0;
		while (i < mezcla.length) {
			if (j < lista1.length) {
				if (lista1[j] > lista2[k]) {
					mezcla[i] = lista2[k++];
				} else if (lista1[j] == lista2[k]) {
					mezcla[i] = lista2[k++];
				} else if (lista1[j] < lista2[k]) {
					mezcla[i] = lista1[j++];
				}
			} else {
				mezcla[i] = lista2[k++];
			}
			i++;
		}
		return mezcla;
	}

	// mezclar arrays de enteros menos eficiente por profe
	public int[] mezclaListas3(int[] lista1, int[] lista2) {
		Arrays.sort(lista1);
		Arrays.sort(lista2);
		int i = 0, j = 0, k = 0;
		int[] resultado = new int[lista1.length + lista2.length];
		while (lista1[i] != Integer.MAX_VALUE || lista2[j] != Integer.MAX_VALUE) {
			if (lista1[i] < lista2[j]) {
				resultado[k] = lista1[i++];
			} else {
				resultado[k] = lista2[j++];
			}
			k++;
			if (i == lista1.length)
				lista1[--i] = Integer.MAX_VALUE;
			if (j == lista2.length)
				lista2[--j] = Integer.MAX_VALUE;
		}
		return resultado;
	}

	public boolean validarNIF(String nif) {
		String[] Caracteres = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
				"V", "H", "L", "C", "K", "E" };
		boolean resultado = false;
		String nif2 = nif.toUpperCase();
		if (nif2.length() == 9) {
			int dni = Integer.parseInt(nif2.substring(0, nif2.length() - 1));
			int resto = dni % 23;
			char letra2 = nif2.charAt(8);
			char letra = Caracteres[resto].charAt(0);
			if (letra2 == letra) {
				resultado = true;
			} else {
				resultado = false;
			}
		}
		return resultado;
	}

	// LIGA obtener clasificacion a partir de resultados.
	public int[] obtenerClasificacion(String[][] resultados) {
		int[] puntosEquipo = new int[5];
		int golesLocal;
		int golesVisitante;
		for (int i = 0; i < resultados.length; i++) {
			for (int j = 0; j < resultados[i].length; j++) {
				if (resultados[i][j].indexOf('-') != -1) {
					String[] goles = resultados[i][j].split("-");
					golesLocal = Integer.parseInt(goles[0]);
					golesVisitante = Integer.parseInt(goles[1]);
					if (golesLocal > golesVisitante) {
						puntosEquipo[i] += 3;
					} else if (golesLocal < golesVisitante) {
						puntosEquipo[j] += 3;
					} else {
						puntosEquipo[i] += 1;
						puntosEquipo[j] += 1;
					}
				}
			}
		}
		return puntosEquipo;
	}

	public void ordenaClasificacion(int[] numeros, String[] equipos) {
		for (int i = 0; i < numeros.length - 1; i++)
			for (int j = i + 1; j < numeros.length; j++)
				if (numeros[i] < numeros[j]) {
					int aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
					String aux2 = equipos[i];
					equipos[i] = equipos[j];
					equipos[j] = aux2;
				}
	}

	public int[] obtenerClasificacion2(String[][] resultados) {
		int[] puntosEquipo = new int[5];
		int golesLocal;
		int golesVisitante;
		for (int i = 0; i < resultados.length; i++) {
			for (int j = 0; j < resultados[i].length; j++) {
				if (resultados[j][i].indexOf('-') != -1) {
					String[] goles = resultados[j][i].split("-");
					golesLocal = Integer.parseInt(goles[0]);
					golesVisitante = Integer.parseInt(goles[1]);
					if (golesLocal > golesVisitante) {
						puntosEquipo[j] += 3;
					} else if (golesLocal < golesVisitante) {
						puntosEquipo[i] += 3;
					} else {
						puntosEquipo[j] += 1;
						puntosEquipo[i] += 1;
					}
				}
			}
		}
		return puntosEquipo;
	}

	public Equipo[] obtenerClasificacion3(int[][] puntosJornada) {
		Equipo[] clasificacion = new Equipo[5];
		String[] equipo = new Datos().getEquipos();
		for (int j = 0; j < puntosJornada[0].length; j++) {
			Equipo e = new Equipo();
			e.setNombre(null);
			e.setPuntos(0);
			for (int i = 0; i < clasificacion.length; i++) {
				e.setNombre(equipo[j]);
				e.setPuntos(e.getPuntos() + puntosJornada[i][j]);
				clasificacion[j] = e;
			}
		}
		return clasificacion;
	}

	public boolean esPrimo(int numero) {
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0)
				return false;
		}
		return true;
	}

	public int[] numerosPrimos(int cuantos) {
		int[] primos = new int[cuantos];
		int i = 0;
		int j = 1;
		while (i < cuantos) {
			if (esPrimo(j))
				primos[i++] = j;
			j++;
		}
		return primos;
	}

	public int[] numeroFibonacci(int cuantos) {
		int[] numeros = new int[cuantos];
		int x = 0;
		int y = 1;
		int z = 0;
		numeros[0] = x;
		numeros[1] = y;
		for (int i = 0; i < numeros.length; i++) {
			z = x + y;
			x = y;
			y = z;
			numeros[i] = z;
		}
		return numeros;
	}

	public void recorrerMatrizIrregularPorColumna(int[][] matriz) {
		int JMAX = 0;
		// obtener el numero maximo de columnas.
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i].length > JMAX)
				JMAX = matriz[i].length;
		}
		// recorrer el array.
		for (int j = 0; j < JMAX; j++) {
			for (int i = 0; i < matriz.length; i++) {
				try {
					System.out.println("[" + i + "] [" + j + "]: " + matriz[i][j]);
				} catch (ArrayIndexOutOfBoundsException e) {
					continue;
				}
			}
		}
	}

	public void recorrerMatrizIrregularPorColumna2(Integer[][] matriz) {
		int JMAX = 0;
		// obtener el numero maximo de columnas.
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i].length > JMAX)
				JMAX = matriz[i].length;
		}
		// recorrer el array.
		for (int j = 0; j < JMAX; j++) {
			for (int i = 0; i < matriz.length; i++) {
				try {
					System.out.println("[" + i + "] [" + j + "]: " + matriz[i][j].toString());

				} catch (NullPointerException e) {
					continue;
				} catch (ArrayIndexOutOfBoundsException e) {
					continue;
				}
			}
		}
	}
}