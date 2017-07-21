package servlet.teacher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Question;
import manager.QuestionManager;

public class CreateQuestionServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");
			// requestオブジェクトから登録情報の取り出し
			String question = request.getParameter("question");
			String answer = request.getParameter("answer");

			Question question1 = new Question();

			  
			QuestionManager service = new QuestionManager();

			//  登録
			service.createQuestion(question1);

			// フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("../teacher/teacherTop.jsp");
			dispatcher.forward(request, response);
		
	}
}
