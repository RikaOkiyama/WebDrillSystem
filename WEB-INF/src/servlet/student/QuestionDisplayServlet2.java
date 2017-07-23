package servlet.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Question;
import manager.QuestionManager;

@WebServlet("/questionDisplay2")
public class QuestionDisplayServlet2 extends HttpServlet{

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

		QuestionManager manager=new QuestionManager();

		Question question=manager.Select(id);

		
		request.setAttribute("question",question);
		getServletContext().getRequestDispatcher("/jsp/student/studentAnswer.jsp").forward(request, response);
	}
}
