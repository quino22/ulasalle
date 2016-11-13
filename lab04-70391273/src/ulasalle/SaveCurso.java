package ulasalle;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SaveCurso extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		String name = req.getParameter("name");
		String creditos = req.getParameter("creditos");
		String estado = req.getParameter("estado");
		
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Curso c = new Curso(name, creditos, estado);
		try{
			pm.makePersistent(c);
			resp.getWriter().println("Color grabado correctamente.");
			resp.sendRedirect("/listcurso");
		}catch(Exception e){
			System.out.println(e);
			resp.getWriter().println("Ocurrió un error, vuelva a intentarlo.");
			resp.sendRedirect("/curso.jsp");
		}finally{
			pm.close();
		}
	}
}
