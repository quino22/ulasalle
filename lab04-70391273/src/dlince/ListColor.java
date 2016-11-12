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
	public class ListColor extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			//resp.setContentType("text/plain");
			
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Color.class);
			
			q.setOrdering("idColor descending");
			//q.setRange(0, 10);
				try{
					@SuppressWarnings("unchecked")
					List<Color> colores = (List<Color>) q.execute();
					req.setAttribute("colores", colores);
					RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/listcolor.jsp");
					rd.forward(req, resp);
				}catch(Exception e){
					System.out.println(e);
				}finally{
					q.closeAll();
					pm.close();
				}
						
		}
	}
