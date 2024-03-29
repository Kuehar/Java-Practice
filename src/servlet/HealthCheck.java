package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogic;;


/**
 * Servlet implementation class HealtCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//forward

		RequestDispatcher dispatcher = request.getRequestDispatcher("/HealthCheck.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");

		Health health = new Health();
		health.setHeight(Double.parseDouble(height));
		health.setWeight(Double.parseDouble(weight));

		HealthCheckLogic healthCheckLogic = new HealthCheckLogic();
		healthCheckLogic.HealthCheck(health);

		request.setAttribute("health", health);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/healthCheckResult.jsp");
		dispatcher.forward(request, response);

	}

}
