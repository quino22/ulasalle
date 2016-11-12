package pw2;

import java.io.IOException;
import java.util.ArrayList; 
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class EliminarServlet extends HttpServlet {
	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		String dnix = req.getParameter("dni");
		boolean encontro=false;	
		ArrayList<Votante> votantes = (ArrayList<Votante>) getServletContext().getAttribute("votantes");
		int i = 0;
		if( votantes != null ){
			for(Votante v : votantes){
				if(v.getDni().equals(dnix)){
					encontro = true;
					break;
				}
				i++;
			}
			if(encontro){
				votantes.remove(i);
				resp.sendRedirect("votantes.jsp");
			}else{
				resp.getWriter().println("<p>No se ha encontrado ningun votante ("+dnix+").");
			}
				
		}else{
			resp.getWriter().println("<p>No hay donde buscar.</p>");
		}
		
		
	}
}