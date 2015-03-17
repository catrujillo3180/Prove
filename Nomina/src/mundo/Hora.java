package mundo;

import java.util.Date;
import java.util.Locale.Category;

public class Hora {
	
	private String usuario;
	
	private String tipo;
	
	private Date fechaRealizada;
	
	private Date fechaIngreso;
	
	private int cantidad;
	
	private String concepto;
	
	private double valorUnitario;
	
	private double subTotal;

	public Hora(String pUsuario, String pTipo, Date pFechaRealizada,
			Date pFechaIngreso, int pCantidad, String pConcepto, double pValorUnitario) {
		
		usuario = pUsuario;
		tipo = pTipo;
		fechaRealizada = pFechaRealizada;
		fechaIngreso = pFechaIngreso;
		cantidad = pCantidad;
		concepto = pConcepto;
		valorUnitario = pValorUnitario;
		subTotal = cantidad*valorUnitario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaRealizada() {
		return fechaRealizada;
	}

	public void setFechaRealizada(Date fechaRealizada) {
		this.fechaRealizada = fechaRealizada;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getValor() {
		return valorUnitario;
	}

	public void setValor(int valor) {
		this.valorUnitario = valor;
	}

	@Override
	public String toString() {
		return "Hora [usuario=" + usuario + ", tipo=" + tipo
				+ ", fechaRealizada=" + fechaRealizada + ", fechaIngreso="
				+ fechaIngreso + ", cantidad=" + cantidad + ", concepto="
				+ concepto + ", valor=" + valorUnitario + "]";
	}
	
	
	
}
