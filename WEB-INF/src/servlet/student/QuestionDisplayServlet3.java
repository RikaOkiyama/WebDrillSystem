package servlet.student;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Result;
import beans.User;
import manager.GetResultManager;

@WebServlet("/questionDisplay3")
public class QuestionDisplayServlet3 extends HttpServlet{

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
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		String userId = user.getId();

		GetResultManager manager=new GetResultManager();
		ArrayList list = manager.GetList2(id,userId);
				

		request.setAttribute("result",list);
		getServletContext().getRequestDispatcher("/jsp/student/studentResult.jsp").forward(request, response);
		
	}
}
