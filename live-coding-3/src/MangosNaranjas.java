
public class MangosNaranjas {

	private String mangos;
	private String naranjas;
	private double cantidad;
	private double cajas;
	public MangosNaranjas(String mangos, String naranjas, double cantidad, double cajas) {
		super();
		this.mangos = mangos;
		this.naranjas = naranjas;
		this.cantidad = cantidad;
		this.cajas = cajas;
	}//constructor 
	public String getMangos() {
		return mangos;
	}
	public void setMangos(String mangos) {
		this.mangos = mangos;
	}
	public String getNaranjas() {
		return naranjas;
	}
	public void setNaranjas(String naranjas) {
		this.naranjas = naranjas;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getCajas() {
		return cajas;
	}
	public void setCajas(double cajas) {
		this.cajas = cajas;
	}
	@Override
	public String toString() {
		return "MangosNaranjas [mangos=" + mangos + ", naranjas=" + naranjas + ", cantidad=" + cantidad + ", cajas="
				+ cajas + "]";
	}



}
