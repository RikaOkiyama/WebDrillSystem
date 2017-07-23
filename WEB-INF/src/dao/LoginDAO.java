package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utility.DriverAccessor;
import beans.User;

public class LoginDAO extends DriverAccessor{

	public User certifyUser(String id, Connection connection) {

		try{
			String sql="select * from user where id = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			//数字は何個目の？かを表す
			stmt.setString(1 , id);

			ResultSet rs=stmt.executeQuery();

			rs.first();

			User user = new User();
			user.setId( rs.getString("id") );
			user.setPassword( rs.getString("password") );
			user.setRole( rs.getInt("role"));

			stmt.close();
			rs.close();

			return user;

		}catch(SQLException e){

			e.printStackTrace();

			return null;
		}finally{
		}
	}
}