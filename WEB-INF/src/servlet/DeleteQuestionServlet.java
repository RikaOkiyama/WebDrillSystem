package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.QuestionManager;

public class DeleteQuestionServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{	

		request.setCharacterEncoding("UTF-8");		

		String id=request.getParameter("id");

		QuestionManager manager=new QuestionManager();	

		manager.Delete(id);

		response.sendRedirect(response.encodeRedirectURL("./top.jsp"));

	}
}

