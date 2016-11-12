package ulasalle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Cuarto extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String numb = req.getParameter("numb");
		int num = Integer.parseInt(numb);
		out.println("<h1>Pagina " + num + " </h1>");
		num++;
		out.println("<a href='/cuarto?numb=" + num + "'>Next</a>");
	}
}
