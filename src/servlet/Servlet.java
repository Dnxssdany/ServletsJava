package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet(urlPatterns = {"/log"})
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	*/ 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
			String usuario = request.getParameter("nombre");
			String peli = request.getParameter("pelis");  
			
			
			request.getParameter("pelis");
			
			
			response.setContentType("text/html; charset=UTF-8"); 
			PrintWriter out = response.getWriter();
			out.println("<!DCOTYPE html> \n "
					+ "<html> "
					+ "\n <head> "
					+ "\n <title> Resultado </title>" 
					+ "\n </head> "
					+ "<body> "
					+ " Hola! " + usuario
					+ " Tus peliculas son las siguientes: <br>");
			
			for(int i = 0; i < peli.length; i++)
			{
				
				out.println(i + ". " + peli[i]);
			}
					
					out.println("\n </body>"
							+ "</html>");
					
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	*/
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html; charset=UTF-8"); 
		PrintWriter out = response.getWriter();
		out.println("<!DCOTYPE html> \n "
				+ "<html> "
				+ "\n <head> "
				+ "\n <title> Le diste clic al post </title>" 
				+ "\n </head> "
				+ "<body> "
				+ " Le diste clic al post! "
				+ "\n </body>"
				+ "</html>");
	} 
	
}
