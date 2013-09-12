package sdec;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaludadorServlet {

	@Autowired
	private Saludador servicioSaludador;
	
	@RequestMapping("saluda.do")
	public void calcula(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String nombre = request.getParameter("nombre");
		response.getOutputStream().println(
						servicioSaludador.saludar(nombre));
	}

}
