package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String paramName = "powerInput";
		String paramName1 = "incidentInput";
		String paramName2 = "lcoationInput";
		String paramName3 = "userInput";

		String paramValue = request.getParameter(paramName);
		String paramValue1 = request.getParameter(paramName1);
		String paramValue2 = request.getParameter(paramName2);
		String paramValue3 = request.getParameter(paramName3);

		
		//out.write(<h3>");
		out.write("Incident");
		out.write(" = ");
		out.write("robbery");
	
		out.println();
		out.write("Location");
		out.write(" = ");
		out.write("area 121");
		
		out.println();
		out.write("User");
		out.write("     = ");
		out.write("user 435");
		
		OpennlpParser mynlp = new OpennlpParser();
		out.write(mynlp.doNlp(paramValue));
		out.write(paramValue);

	}

	/**s
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
