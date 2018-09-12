package mx.com.unam.filos;

import java.util.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alumnos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class AlumnoServicio {
	// esta es como un objeto, con propiedades y atributos
	private static Map<Integer, Alumno> alumnos = new HashMap<>();

	static {
		// jalo la calse que cree hace rato y le doy los parámetros necesarios
		Alumno scarlett = new Alumno(306239278, "Scarlett", "Rocha", "Geografía", "scarlett.geo@gmail.com");

		// lo coloco en la base de datos, bueno en el objeto que creamos alla arriba
		Alumno karen = new Alumno(568742, "Ana", "Carroen", "Administración", "karen.carreon@citibanamex.com");
		alumnos.put(1, scarlett);
		alumnos.put(2, karen);
	}

	/**
	 * Este método nos regresará la lista de todos los alumnos existentes en la base
	 * de datos en este caso nuesteo hashmap
	 */

	@GET
	public List<Alumno> alumnos() {
		return new ArrayList<>(alumnos.values());
	}

	/*
	 * Método para guardar un nuevo alumno Recibe como parametro alumno
	 * 
	 * @param Alumno
	 */

	@POST
	public void addAlumno(Alumno alumno) {
		alumnos.put(alumnos.size() + 1, alumno);
	}

	@Path("/{id}")
	@DELETE
	public void remove(@PathParam("id") Integer id) {
		alumnos.remove(id);
	}
}
