package servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;
import manager.LoginManager;

public class LoginServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");
		
		//jspの入力データの取得
		String id = request.getParameter("id");
		String password =request.getParameter("password");
		
		//managerの生成
		LoginManager manager = new LoginManager();
		
		//LoginManagerのcertifyメソッドを実行する
		User user = manager.certifyUser(id,password);
		
		if(user==null){
			response.sendRedirect(response.encodeRedirectURL("./error.jsp"));
		}
		else{
			//ユーザーの情報を保持する
			HttpSession session=request.getSession();
			session.setAttribute("user",user);
			
			if(user.getRole() == 1){
				response.sendRedirect(response.encodeRedirectURL("./teacher/teacherTop.jsp"));
			}
			else{
			response.sendRedirect(response.encodeRedirectURL("./student/studentTop.jsp"));
			}
		}
	}

}
