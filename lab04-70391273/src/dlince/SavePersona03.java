package dlince;

import java.io.IOException;
import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class SavePersona03 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		String email = req.getParameter("email");
		String[] colores = req.getParameterValues("colores");
				 
		final PersistenceManager pm = PMF.get().getPersistenceManager();		
		
		try{
			Key key;
			Color found;
			Persona03 p = new Persona03(name, lastname, email);
			if( req.getParameterValues("colores")!=null )
				for(int i=0;i<colores.length;i++){
					key = KeyFactory.stringToKey(colores[i]);
					found = pm.getObjectById(Color.class, key);
					p.getColor().add(found);
				}
			try{
				pm.makePersistent(p);
				resp.getWriter().println("Persona grabada correctamente.");
				resp.sendRedirect("/listpersona03");
			}catch(Exception e){
				System.out.println(e);
				resp.getWriter().println("Ocurrió un error, vuelva a intentarlo.");
				resp.sendRedirect("/persona03");
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			pm.close();
		}
		
	}
}

