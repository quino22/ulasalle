package ulasalle;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Septimo extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		String name = req.getParameter("nombre");
		String direc = req.getParameter("direc");
		resp.getWriter().println("hola "+ name + " su direccion es: "+direc);
	}
}
