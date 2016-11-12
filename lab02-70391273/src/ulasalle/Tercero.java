package ulasalle;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Tercero extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		String msj = req.getParameter("msj");
		resp.getWriter().println("El mensaje es: "+ msj);
	}
}
