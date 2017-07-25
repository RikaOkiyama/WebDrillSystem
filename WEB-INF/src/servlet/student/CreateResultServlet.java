package servlet.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Result;
import beans.User;
import manager.ResultManager;

@WebServlet("/student/CreateResult")
public class CreateResultServlet extends HttpServlet {
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
			
			HttpSession session = request.getSession();
		
			request.setCharacterEncoding("UTF-8");
			// requestオブジェクトから登録情報の取り出し
			String answer = request.getParameter("answer");
			int questionId = Integer.parseInt(request.getParameter("questionId"));
			
			String userId = ((User) session.getAttribute("user")).getId();
			
			Result result = new Result(userId, questionId, answer, null);
			
			ResultManager service = new ResultManager();

			//  登録
			service.createResult(result);

			// フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/webDrill/jsp/student/answerComplete.jsp");
			dispatcher.forward(request, response);
		
	}
}
