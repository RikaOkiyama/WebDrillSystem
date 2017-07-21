package manager;

import java.sql.Connection;

import dao.LoginDAO;
import dao.UserDAO;
import beans.User;

public class LoginManager{

	private Connection connection = null;
	
	public LoginManager(){		
	}
	
	public User certifyUser(String id, String password) {

		//daoの生成
		LoginDAO loginDao = new LoginDAO();

		this.connection = loginDao.createConnection();

		//LoginDaoのcertifyメソッドを実行し結果をuserに渡す
		User user = loginDao.certifyUser(id,this.connection);

		loginDao.closeConnection(this.connection);

		this.connection = null;

		if(user==null)
			return null;
		//DBから取得したパスワードと入力されたパスワードが一致するか判別する
		else if(password.equals(user.getPassword()))
		{
			return user;
		}
		else
			return null;
	}

}
