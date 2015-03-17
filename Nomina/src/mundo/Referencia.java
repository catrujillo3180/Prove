package mundo;

import java.util.Date;

public class Referencia {
	
	private String tipo;
	private String nombre;
	private int telefono;
	private String empresa;
	private String concepto;
	private Date fechaInicio;
	private Date fechaFin;
	
	public final static String PERSONAL = "Personal";
	public final static String LABORAL = "Laboral";
	
	public Referencia(String tipoP, String nombreP, int telefonoP, String empresaP, 
			String conceptoP, Date fechaInicioP, Date fechaFinP){
		
		tipo = tipoP;
		nombre = nombreP;
		telefono = telefonoP;
		empresa = empresaP;
		concepto = conceptoP;
		fechaInicio = fechaInicioP;
		fechaFin = fechaFinP;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public static String getPersonal() {
		return PERSONAL;
	}

	public static String getLaboral() {
		return LABORAL;
	}

}
