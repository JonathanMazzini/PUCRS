package Application;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Business.Bar;
import Persistence.BarPersistence;

/**
 * Servlet implementation class SaidaServlet
 */
@WebServlet("/SaidaServlet")
public class SaidaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Bar bar = new Bar();
       
   
    public SaidaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		bar.saidaDeCliente(request.getParameter("cpfSaida"));
		response.sendRedirect("form.jsp");
	}

}
