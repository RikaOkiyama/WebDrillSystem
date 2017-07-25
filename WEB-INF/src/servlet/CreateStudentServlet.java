package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;
import manager.UserManager;

@WebServlet("/CreateStudentServlet")
public class CreateStudentServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");
			// requestオブジェクトから登録情報の取り出し
			String id = request.getParameter("id");
			String password = request.getParameter("password");

			User user = new User(id, password, 0);
  
			UserManager service = new UserManager();

			//  登録
			service.createUser(user);

			// フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("./student/createStudentComplete.jsp");
			dispatcher.forward(request, response);
		
	}
}
