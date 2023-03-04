package bici;

public class BiciMTB {
	// atributos

	private String marca;
	private String modelo;
	private Suspensiones suspension;
	private byte numPlatos;
	private boolean esNueva;
	private float precio;
	private short velocidad;
	private boolean averiada;

	// constructores

	public BiciMTB() {
		// constructor con valores por defecto
		this.marca = "";
		this.modelo = "";
		this.suspension = Suspensiones.RIGIDA;
		this.numPlatos = 1;
		this.esNueva = true;
		this.precio = 0f;
		this.velocidad = 15;
		this.averiada = false;
	}

	public BiciMTB(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.suspension = Suspensiones.RIGIDA;
		this.numPlatos = 1;
		this.esNueva = true;
		this.precio = 0f;
		this.velocidad = 50;
		this.averiada = false;
	}

	public BiciMTB(String marca, String modelo, Suspensiones suspension, byte numPlatos, boolean esNueva, float precio,
			short velocidad, boolean averiada) {
		this.marca = marca;
		this.modelo = modelo;
		this.suspension = suspension;
		this.numPlatos = numPlatos;
		this.esNueva = esNueva;
		this.precio = precio;
		this.velocidad = velocidad;
		this.averiada = averiada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Suspensiones getSuspension() {
		return suspension;
	}

	public void setSuspension(Suspensiones suspension) {
		this.suspension = suspension;
	}

	public byte getNumPlatos() {
		return numPlatos;
	}

	public void setNumPlatos(byte numPlatos) {
		this.numPlatos = numPlatos;
	}

	public boolean isEsNueva() {
		return esNueva;
	}

	public void setEsNueva(boolean esNueva) {
		this.esNueva = esNueva;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public short getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(short velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "BiciMTB [marca=" + marca + ", modelo=" + modelo + ", suspension=" + suspension + ", numPlatos="
				+ numPlatos + ", esNueva=" + esNueva + ", precio=" + precio + " €, velocidad=" + velocidad
				+ ", averiada=" + averiada + "]";
	}

	public void estropear() {
		System.out.println("*ZONA ACCIDENTADA TEN CUIDADO*");
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("*ZONA ACCIDENTADA TEN CUIDADO*");
		this.averiada = true;
	}

	public void reparar() {
		if (this.averiada) {
			System.out.println("------------ENTRANDO ENEL TALLER-------------");
			System.out.println("------------Reparando Bici-------------");
			System.out.println("------------Reparando Bici-------------");
			System.out.println("------------Reparando Bici-------------");
			System.out.println("------------Reparando Bici-------------");
			System.out.println("------------Reparando Bici-------------");
			System.out.println("------------Reparando Bici-------------");
			System.out.println("------------Reparando Bici-------------");
			System.out.println("------------BICICLETA ARREGLADA ;)-------------");
			this.averiada = false;
		} else {
			System.out.println("------------La bicicleta no estaba averiada-------------");
		}
	}

	public void acelerar() {
		if (this.averiada) {
			System.out.println("No se puede acelerar, la bicicleta esta averidad.");
		} else {
			this.velocidad += 15;
			System.out.println("Acelerando, acelerando, la velocidad actual es: " + this.velocidad);
		}
	}

}
