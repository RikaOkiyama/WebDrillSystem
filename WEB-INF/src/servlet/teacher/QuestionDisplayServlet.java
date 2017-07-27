package servlet.teacher;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Result;
import manager.GetResultManager;

@WebServlet("/questionDisplay")
public class QuestionDisplayServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		String id=request.getParameter("id");

		GetResultManager manager=new GetResultManager();

		ArrayList list = manager.GetList(id);

		
		request.setAttribute("result",list);
		getServletContext().getRequestDispatcher("/jsp/teacher/studentResult.jsp").forward(request, response);
	}
}
