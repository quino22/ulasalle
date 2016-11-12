package dlince;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RemoveAll extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/plain");		
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		
		final Query p3 = pm.newQuery(Persona03.class);
		final Query p2 = pm.newQuery(Persona02.class);
		final Query q = pm.newQuery(Color.class);
			try{
				p3.deletePersistentAll();
				p2.deletePersistentAll();
				q.deletePersistentAll();
				resp.getWriter().println("Se han borrado personas y colores.");
				resp.sendRedirect("/index.html");
			}catch(Exception e){
					System.out.println(e);
					resp.getWriter().println("No se han podido borrar datos.");
					resp.sendRedirect("/index.html");
			}finally{
				q.closeAll();
				pm.close();
			}				
	}
}

