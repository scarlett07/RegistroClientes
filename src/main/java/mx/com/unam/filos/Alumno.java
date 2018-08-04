package mx.com.unam.filos;

public class Alumno {
	private int numeroBoleta;
	private String nombre;
	private String apallidos;
	private String carrera;
	private String correo;

	public Alumno(int numeroBoleta, String nombre, String apallidos, String carrera, String correo) {
		super();
		this.numeroBoleta = numeroBoleta;
		this.nombre = nombre;
		this.apallidos = apallidos;
		this.carrera = carrera;
		this.correo = correo;
	}

	public int getNumeroBoleta() {
		return numeroBoleta;
	}

	public void setNumeroBoleta(int numeroBoleta) {
		this.numeroBoleta = numeroBoleta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApallidos() {
		return apallidos;
	}

	public void setApallidos(String apallidos) {
		this.apallidos = apallidos;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
