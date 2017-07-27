package servlet.teacher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Question;
import beans.User;
import manager.QuestionManager;

@WebServlet("/CreateQuestionServlet")
public class CreateQuestionServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");
			String question = request.getParameter("question");
			String answer = request.getParameter("answer");
			
			HttpSession session = request.getSession();
			User user = (User)session.getAttribute("user");
			
			Question question1 = new Question(0,question,answer,0,user.getId());

			QuestionManager service = new QuestionManager();

			//  登録
			service.createQuestion(question1);

			// フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/teacher/createComplete.jsp");
			dispatcher.forward(request, response);
			
	}
}
