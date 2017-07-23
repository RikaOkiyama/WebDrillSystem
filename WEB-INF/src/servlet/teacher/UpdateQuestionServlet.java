package servlet.teacher;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.QuestionManager;

@WebServlet("/updateQuestionServlet")
public class UpdateQuestionServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		String question=request.getParameter("question");
		String answer=request.getParameter("answer");
		int id=Integer.parseInt(request.getParameter("ID"));

		QuestionManager manager=new QuestionManager();

		manager.Update(question,answer,id);

		response.sendRedirect(response.encodeRedirectURL("/jsp/teacher/update.jsp"));
	}
}
