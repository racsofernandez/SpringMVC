package sdec;

public class Saludador {

	public Saludador() {
		System.out.println("Saludador inicializado por Spring !!");
	}
	
	public String saludar(String nombre) {
		return "Buenos días, buenas tardes, buenas noches para " + nombre;		
	}
}
