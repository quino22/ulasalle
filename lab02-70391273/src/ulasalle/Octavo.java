package ulasalle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")

public class Octavo extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("<h1>Es por metodo get</h1>");
		resp.getWriter().println("<form>");
		resp.getWriter().println("<input type='radio' name='gender' value='female'> RADIO<br>");
		resp.getWriter().println("</form>");
	}
}