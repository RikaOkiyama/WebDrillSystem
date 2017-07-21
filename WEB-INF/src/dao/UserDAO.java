// DBに値を入れる
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.DriverAccessor;
import beans.User;

public class UserDAO extends DriverAccessor{

	//  情報をデータベースに登録する
	//  引数はuserオブジェクトと、Connectionオブジェクト
	public void Regist(User user, Connection connection){

		try{
			//  SQLコマンド insert into=値をカラムに入れる
			String sql = "insert into user (id, password, role) values (?, ?, ?)";

			//  SQLコマンドの実行
			PreparedStatement stmt = connection.prepareStatement(sql);

			
			//  SQLコマンドのクエッションマークに値を、1番目から代入する
			stmt.setString(1, user.getId());
			stmt.setString(2, user.getPassword());
			stmt.setInt(3, user.getRole());
			
			stmt.executeUpdate();

			System.out.println(sql);

		}catch(SQLException e){

			//エラーが発生した場合、エラーの原因を出力する
			e.printStackTrace();

		} finally {
		}
	}
	
	
}
