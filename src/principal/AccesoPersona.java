package principal;

import modelo.Persona;

public class AccesoPersona {

	public float cuantoAvanza(Persona quien,int numPasos)
	{
		float longitud=quien.getLongitudPaso();
		return (longitud*numPasos)/100;
	}
//	public 

}
