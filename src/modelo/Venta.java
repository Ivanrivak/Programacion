package modelo;

import java.time.LocalDate;

public class Venta {
	private String fechaV;
	private String idV;
	private Float importe;
	public String getFechaV() {
		return fechaV;
	}
	public void setFechaV(String fechaV) {
		this.fechaV = fechaV;
	}
	public String getIdV() {
		return idV;
	}
	public void setIdV(String idV) {
		this.idV = idV;
	}
	public Float getImporte() {
		return importe;
	}
	public void setImporte(Float importe) {
		this.importe = importe;
	}
	public Venta(String fechaV, String idV, Float importe) {
		super();
		this.fechaV = fechaV;
		this.idV = idV;
		this.importe = importe;
	}
	
}
