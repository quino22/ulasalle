package ulasalle;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.*;


@SuppressWarnings("serial")
public class Ev3_70391273Servlet extends HttpServlet {
	
	Votante v1 = new Votante("Joaquin","Huaman  ",	70391273,"urb buenavista","0134","AQP",true);
	Votante v2 = new Votante("Daniel","Fabrizio ",	12345678,"Av Ejercito","0121","LIMA",false);
	Votante v3 = new Votante("Carla","Morrison  ",	19876543,"Av Parra","0123","CUZCO",true);
	
	ArrayList<Votante> lista = new ArrayList<>();
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/text");
		int dni = Integer.parseInt(req.getParameter("dni"));
		
		lista.add(v1);
		lista.add(v2);
		lista.add(v3);
		for(int i = 0; i< lista.size();i++){
			if(dni == lista.get(i).dni){
				resp.getWriter().println("Resultado de ONPE");
				resp.getWriter().println("Bienvenido/a DNI: " + lista.get(i).dni);
				resp.getWriter().println("Nombre: " + lista.get(i).nombre);
				resp.getWriter().println("Apellido: " + lista.get(i).apellido);
				resp.getWriter().println("Ciudad: " + lista.get(i).ciudad);
				resp.getWriter().println("Mesa de sufragio: " + lista.get(i).mesa);
				resp.getWriter().println("Direccion: " + lista.get(i).direccion);
				break;
			}
		}
	}
}