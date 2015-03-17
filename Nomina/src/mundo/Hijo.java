package mundo;

import java.util.Date;

public class Hijo {
	private String nombre;
	private String apellidos;
	private int documento;
	private Date fechaNacimiento;
	private int edad;
	
	public Hijo(String nombreP, String apellidosP, int documentoP, Date fechaNcimientoP, int edadP){
		nombre = nombreP;
		apellidos = apellidosP;
		documento = documentoP;
		fechaNacimiento = fechaNcimientoP;
		edad = edadP;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
