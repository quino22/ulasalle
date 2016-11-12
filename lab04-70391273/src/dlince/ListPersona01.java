package dlince;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	@SuppressWarnings("serial")
	public class ListPersona01 extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			//resp.setContentType("text/plain");
			
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Persona01.class);
			
			if( req.getParameter("color")!=null ){
				
				String color = req.getParameter("color");
				//q.setOrdering("id ascending");
				q.setOrdering("id descending");
				//q.setRange(0, 10);
				q.setFilter("color == colorParam");
				q.declareParameters("String colorParam");
				
				try{
					
					@SuppressWarnings("unchecked")
					List<Persona01> personas = (List<Persona01>) q.execute(color);
					req.setAttribute("personas", personas);
					RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/listpersona01.jsp");
					rd.forward(req, resp);
				
				}catch(Exception e){
					System.out.println(e);
				}finally{
					q.closeAll();
					pm.close();
				}
				
			}else {
				q.setOrdering("id descending");
				//q.setRange(0, 10);			 
				try{
					@SuppressWarnings("unchecked")
					List<Persona01> personas = (List<Persona01>) q.execute();
					req.setAttribute("personas", personas);
					RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/listpersona01.jsp");
					rd.forward(req, resp);
				}catch(Exception e){
					System.out.println(e);
				}finally{
					q.closeAll();
					pm.close();
				}
			}			
		}
	}

	