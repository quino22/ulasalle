package pw2;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class BuscarServlet extends HttpServlet {
	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		
		resp.getWriter().println("<ul class='navbar'><li><a href='buscar.html'>Buscar</a><li><a href='registrar.html'>Registrar</a><li><a href='votantes.jsp'>Ver</a></ul>");
		
		String dnix = req.getParameter("dni");
		boolean encontro=false;	
		ArrayList<Votante> votantes = (ArrayList<Votante>) getServletContext().getAttribute("votantes");
		
		if( votantes != null ){
			Votante ok= new Votante();
			for(Votante v : votantes){
				if(v.getDni().equals(dnix)){
					encontro=true;
					ok = v;
					break;
				}					
			}
			if(encontro){
				resp.getWriter().println("<p><Un votante encontrado></p>");
				resp.getWriter().println("<p>DNI:"+ok.getDni()+".</p>");
				resp.getWriter().println("<p>Nombres:"+ok.getNombres()+".</p>");
				resp.getWriter().println("<p>Apellidos:"+ok.getApellidos()+".</p>");
				if(ok.getMiembro()){
					resp.getWriter().println("<p>Sí es miembro de mesa.</p>");
				}else{
					resp.getWriter().println("<p>No es miembro de mesa.</p>");
				}
				resp.getWriter().println("<p>Departamento/Provincia/Distrito:"+ok.getDepartamento()+"/"+ok.getProvincia()+"/"+ok.getDistrito()+".</p>");
			}else{
				resp.getWriter().println("<p>No se ha encontrado ningun votante ("+dnix+").");
			}
				
		}else{
			resp.getWriter().println("<p>No hay donde buscar.</p>");
		}
	}
}