package dlince;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class SavePersona02 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		String email = req.getParameter("email");
		Key key = KeyFactory.stringToKey(req.getParameter("color"));
		
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		tx.begin();
		try{
			Color found = pm.getObjectById(Color.class, key);
			//Color copy = new Color(found.getName());
			Persona02 p = new Persona02(name, lastname, email);
			p.setColor(found);
			//p.setColor(copy);
			try{
				pm.makePersistent(p);
				tx.commit();
				resp.getWriter().println("Persona grabada correctamente.");
				resp.sendRedirect("/listpersona02");
			}catch(Exception e){
				System.out.println(e);
				resp.getWriter().println("Ocurrió un error, vuelva a intentarlo.");
				resp.sendRedirect("/persona02");
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try {
				if (tx.isActive())
					tx.rollback();
            } finally {
            	pm.close();
            }
		}		
	}
}

