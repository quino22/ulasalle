package dlince;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SavePersona01 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		String email = req.getParameter("email");
		String color = req.getParameter("color");
		
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Persona01 p = new Persona01(name, lastname, email, color);
		try{
			pm.makePersistent(p);
			resp.getWriter().println("Persona grabada correctamente.");
			resp.sendRedirect("/listpersona01");
		}catch(Exception e){
			System.out.println(e);
			resp.getWriter().println("Ocurrió un error, vuelva a intentarlo.");
			resp.sendRedirect("/persona01.jsp");
		}finally{
			pm.close();
		}
	}
}
