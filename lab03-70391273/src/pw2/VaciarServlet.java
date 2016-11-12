package pw2;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class VaciarServlet extends HttpServlet {
	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		ArrayList<Votante> votantes = (ArrayList<Votante>) getServletContext().getAttribute("votantes");
		votantes.clear();
		getServletContext().setAttribute("votantes", votantes);
		resp.sendRedirect("votantes.jsp");
	}
}