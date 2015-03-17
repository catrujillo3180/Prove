package mundo;

import java.util.ArrayList;
import java.util.Date;

public class Empresa {
	
	private ArrayList empleados;
	
	public Empresa(){
		empleados = new ArrayList();
	}
	
	public boolean validacionUsuario(String usuarioP, String contraseniaP){
		boolean res = false;
		if (usuarioP.equals("1") && contraseniaP.equals("1")){
			res = true;
		}
		return res;
	}

	public void agregarEmpleado(String nombresP, String apellidosP, String sexoP, int cedulaP, 
			String estadoCivilP, String direcciónP, Date fechaNacimientoP, int telefonoFijoP, 
			int telefonoCelularP, String correoP, String nombresParejaP, String apellidosParejaP, 
			int cedulaParejaP, Date fechaNacimientoParejaP, int edadP, ArrayList hijosP, String cargoP, 
			double salarioFijoP, double auxilioTransporteP, String tipoContratoP, String duracionContratoP, 
			Date fechaInicioContratoP, Date fechaFinContratoP, String saludP, String pensionesP, String arlP,
			String solidaridadP, Date fechaAfiliacionSSP, ArrayList referenciasPersonalesP, 
			ArrayList referenciasLaboralesP){
		
		Empleado nuevo = new Empleado(nombresP, apellidosP, sexoP, cedulaP, estadoCivilP, direcciónP, 
				fechaNacimientoP, telefonoFijoP, telefonoCelularP, correoP, nombresParejaP, apellidosParejaP,
				cedulaParejaP, fechaNacimientoParejaP, edadP, hijosP, cargoP, salarioFijoP, auxilioTransporteP, 
				tipoContratoP, duracionContratoP, fechaInicioContratoP, fechaFinContratoP, saludP, pensionesP, 
				arlP, solidaridadP, fechaAfiliacionSSP, referenciasPersonalesP, referenciasLaboralesP);
		
	}

	public Empleado getEmpleadoActual() {
		// TODO Auto-generated method stub
		return null;
	}
}
