package pw2;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RegistrarServlet extends HttpServlet {
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String dni = req.getParameter("dni").trim();
		String nombres = req.getParameter("nombres").trim();
		String apellidos = req.getParameter("apellidos").trim();
		boolean miembro = Boolean.parseBoolean(req.getParameter("miembro"));
		String departamento = req.getParameter("departamento").trim();
		String provincia = req.getParameter("provincia").trim();
		String distrito = req.getParameter("distrito").trim();
		String mesa = req.getParameter("mesa").trim();
		String local = req.getParameter("local").trim();
		String pabellon = req.getParameter("pabellon").trim();
		String piso = req.getParameter("piso").trim();
		String aula = req.getParameter("aula").trim();
		String direccion = req.getParameter("direccion").trim();
		
		
		Votante nuevo = new Votante(dni,nombres,apellidos,miembro,departamento,provincia,distrito,mesa,local,pabellon,piso,aula,direccion);
		if(getServletContext().getAttribute("votantes") != null ){
			ArrayList<Votante> votantes = (ArrayList<Votante>) getServletContext().getAttribute("votantes");
			votantes.add(nuevo);
			getServletContext().setAttribute("votantes", votantes);
						
		}else{
			ArrayList<Votante> votantes = new ArrayList<Votante>();
			votantes.add(nuevo);
			getServletContext().setAttribute("votantes", votantes);
		}
		
		resp.sendRedirect("votantes.jsp");
		
	}
}
