package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverAccessor {

	//  属性

	//  データベースの接続先アドレスを静的変数として記述
	private final static String DRIVER_URL =
		"jdbc:mysql://localhost:3306/Webdrill?useUnicode=true&characterEncoding=Windows-31J";

	//  データベース接続ドライバの名前を静的変数として記述
	private final static String DRIVER_NAME = "com.mysql.jdbc.Driver";

	//  データベースのユーザー名　（デフォルトではroot）
	private final static String USER_NAME = "root";

	//  データベースのユーザーのパスワード　(デフォルトでは設定なし)
	private final static String PASSWORD = "";

	//  データベースとの接続を行う
	//  データベースの接続情報を持ったConnectionオブジェクトを返す
	public Connection createConnection(){
		try{
			Class.forName(DRIVER_NAME);
			Connection con = DriverManager.getConnection(DRIVER_URL, USER_NAME, PASSWORD);
			return con;
		} catch(ClassNotFoundException e){
			System.out.println("Can't Find JDBC Driver.\n");

		} catch(SQLException e){
			System.out.println("Connect Error.\n");
		}
		return null;
	}

	//  Connectionオブジェクトを使って、データベースとの接続を切断する
	//  引数Connectionオブジェクト
	public void closeConnection(Connection con){

		try{
			con.close();
		}catch(Exception ex){}
	}
}
