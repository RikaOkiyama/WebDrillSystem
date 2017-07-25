package servlet.student;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;
import manager.GetQuestionManager;

@WebServlet("/student/getQuestion")
public class GetQuestionServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		String id = user.getId();

		GetQuestionManager manager=new GetQuestionManager();

		//idが登録した全ての問題をlistに渡す
		ArrayList list = manager.GetList(id);

		//取得したlistをquestionListと名付けjspに受け渡せる形にする
		request.setAttribute("questionList",list);
		getServletContext().getRequestDispatcher("/webDrill/jsp/student/studentSelect.jsp").forward(request, response);
	}
}