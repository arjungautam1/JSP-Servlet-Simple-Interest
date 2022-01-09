package arjuncodes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleInterest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		double p = Double.parseDouble(request.getParameter("principal"));
		double t = Double.parseDouble(request.getParameter("time"));
		double r = Double.parseDouble(request.getParameter("rate"));

		double interest = (p * t * r) / 100;

		PrintWriter out = response.getWriter();
		out.println("Simple Interest is :" + interest);

	}

}
