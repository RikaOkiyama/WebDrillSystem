package manager;

import java.sql.Connection;

import dao.UserDAO;
import beans.User;

public class UserManager {
	//  属性
	private Connection connection = null;

	//  引数を持たないコンストラクタ
	public UserManager(){
	}

	//  追加する
	//  引数はuserオブジェクト
	public void createUser(User user){

		//  userDAOオブジェクト生成
		UserDAO userDAO = new UserDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = userDAO.createConnection();

		//  userオブジェクトをDataBaseに登録する
		userDAO.Regist(user, this.connection);

		//  DataBaseとの接続を切断する
		userDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;
	}
}
