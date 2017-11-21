package auxiliar;

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
			resultado[i]= Integer.parseInt(cadenas[i]);
			}catch(NumberFormatException e){
				resultado[i]=-1;
			}
		}
		return resultado;
	}
	public float calculaSaldo(float saldo,String[] movimientos) {
		float resultado=saldo;	
		for (int i = 0; i < movimientos.length; i++) {
			try {
				resultado += Float.parseFloat(movimientos[i]);
			} catch (NumberFormatException e) {
			}
		}
		return resultado;
	}
	public int sumaDigito(int numero) {
		int resultado=0;
		while(numero !=0) {
			resultado+= numero%10;
					numero=numero/10;
		}
		return resultado;
	}
	public void ordenaEnteros(int[] numeros) {
		int aux;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i+1; j < numeros.length; j++) {
				if(numeros[i] > numeros[j]) {
					aux= numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=aux;
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
				for (int j = i+1; j < cadenas.length; j++) {
					if (cadenas[i].compareTo(cadenas[j]) > 0) {
						aux = cadenas[i];
						cadenas[i]=cadenas[j];
						cadenas[j]=aux;
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
}
