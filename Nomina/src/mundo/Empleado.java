package mundo;

import java.util.ArrayList;
import java.util.Date;

public class Empleado implements IEmpleado{
	
	private String nombres;
	private String apellidos;
	private int cedula;
	private String sexo;
	private String estadoCivil;
	private Date fechaNacimiento;
	private String dirección;
	private int telefonoFijo;
	private int telefonoCelular;
	private String correo;
	
	private String nombresPareja;
	private String apellidosPareja;
	private int cedulaPareja;
	private Date fechaNacimientoPareja;
	private int edad;
	
	private ArrayList hijos;
	
	private String cargo;
	private double salarioFijo;
	private double salarioVariable;
	private double auxilioTransporte;
	private String tipoContrato;
	private String duracionContrato;
	private Date fechaInicioContrato;
	private Date fechaFinContrato;
	
	private String salud;
	private String pensiones;
	private String arl;
	private String solidaridad;
	private Date fechaAfiliacionSS;
		
	private ArrayList referenciasPersonales;
	private ArrayList referenciasLaborales;
	
	public Empleado(String nombresP, String apellidosP, String sexoP, int cedulaP, 
			String estadoCivilP, String direcciónP, Date fechaNacimientoP, int telefonoFijoP, 
			int telefonoCelularP, String correoP, String nombresParejaP, String apellidosParejaP, 
			int cedulaParejaP, Date fechaNacimientoParejaP, int edadP, ArrayList hijosP, String cargoP, 
			double salarioFijoP, double auxilioTransporteP, String tipoContratoP, String duracionContratoP, 
			Date fechaInicioContratoP, Date fechaFinContratoP, String saludP, String pensionesP, String arlP,
			String solidaridadP, Date fechaAfiliacionSSP, ArrayList referenciasPersonalesP, 
			ArrayList referenciasLaboralesP){
		
		nombres = nombresP;
		apellidos = apellidosP;
		cedula = cedulaP;
		sexo = sexoP;
		estadoCivil = estadoCivilP;
		fechaNacimiento = fechaNacimientoP;
		dirección = direcciónP;
		telefonoFijo = telefonoFijoP;
		telefonoCelular = telefonoCelularP;
		correo = correoP;
		
		nombresPareja = nombresParejaP;
		apellidosPareja = apellidosParejaP;
		cedulaPareja = cedulaParejaP;
		fechaNacimientoPareja = fechaNacimientoParejaP;
		edad = edadP;
		
		hijos = hijosP;
		
		cargo = cargoP;
		salarioFijo = salarioFijoP;
		salarioVariable = 0;
		auxilioTransporte = auxilioTransporteP;
		tipoContrato = tipoContratoP;
		duracionContrato = duracionContratoP;
		fechaInicioContrato = fechaInicioContratoP;
		fechaFinContrato = fechaFinContratoP;
		
		salud = saludP;
		pensiones = pensionesP;
		arl = arlP;
		solidaridad =  solidaridadP;
		fechaAfiliacionSS = fechaAfiliacionSSP;
			
		referenciasPersonales = referenciasPersonalesP;
		referenciasLaborales = referenciasLaboralesP;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public int getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(int telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public int getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(int telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombresPareja() {
		return nombresPareja;
	}

	public void setNombresPareja(String nombresPareja) {
		this.nombresPareja = nombresPareja;
	}

	public String getApellidosPareja() {
		return apellidosPareja;
	}

	public void setApellidosPareja(String apellidosPareja) {
		this.apellidosPareja = apellidosPareja;
	}

	public int getCedulaPareja() {
		return cedulaPareja;
	}

	public void setCedulaPareja(int cedulaPareja) {
		this.cedulaPareja = cedulaPareja;
	}

	public Date getFechaNacimientoPareja() {
		return fechaNacimientoPareja;
	}

	public void setFechaNacimientoPareja(Date fechaNacimientoPareja) {
		this.fechaNacimientoPareja = fechaNacimientoPareja;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList getHijos() {
		return hijos;
	}

	public void setHijos(ArrayList hijos) {
		this.hijos = hijos;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalarioFijo() {
		return salarioFijo;
	}

	public void setSalarioFijo(double salarioFijo) {
		this.salarioFijo = salarioFijo;
	}

	public double getSalarioVariable() {
		return salarioVariable;
	}

	public void setSalarioVariable(double salarioVariable) {
		this.salarioVariable = salarioVariable;
	}

	public double getAuxilioTransporte() {
		return auxilioTransporte;
	}

	public void setAuxilioTransporte(double auxilioTransporte) {
		this.auxilioTransporte = auxilioTransporte;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public String getDuracionContrato() {
		return duracionContrato;
	}

	public void setDuracionContrato(String duracionContrato) {
		this.duracionContrato = duracionContrato;
	}

	public Date getFechaInicioContrato() {
		return fechaInicioContrato;
	}

	public void setFechaInicioContrato(Date fechaInicioContrato) {
		this.fechaInicioContrato = fechaInicioContrato;
	}

	public Date getFechaFinContrato() {
		return fechaFinContrato;
	}

	public void setFechaFinContrato(Date fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}

	public String getSalud() {
		return salud;
	}

	public void setSalud(String salud) {
		this.salud = salud;
	}

	public String getPensiones() {
		return pensiones;
	}

	public void setPensiones(String pensiones) {
		this.pensiones = pensiones;
	}

	public String getArl() {
		return arl;
	}

	public void setArl(String arl) {
		this.arl = arl;
	}

	public String getSolidaridad() {
		return solidaridad;
	}

	public void setSolidaridad(String solidaridad) {
		this.solidaridad = solidaridad;
	}

	public Date getFechaAfiliacionSS() {
		return fechaAfiliacionSS;
	}

	public void setFechaAfiliacionSS(Date fechaAfiliacionSS) {
		this.fechaAfiliacionSS = fechaAfiliacionSS;
	}

	public ArrayList getReferenciasPersonales() {
		return referenciasPersonales;
	}

	public void setReferenciasPersonales(ArrayList referenciasPersonales) {
		this.referenciasPersonales = referenciasPersonales;
	}

	public ArrayList getReferenciasLaborales() {
		return referenciasLaborales;
	}

	public void setReferenciasLaborales(ArrayList referenciasLaborales) {
		this.referenciasLaborales = referenciasLaborales;
	}

	@Override
	public double getSueldoPeriodo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTiempoPeriodo() {
		// TODO Auto-generated method stub
		return 0;
	}
}
