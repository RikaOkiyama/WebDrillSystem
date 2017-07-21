package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Result;
import utility.DriverAccessor;

public class GetResultDAO extends DriverAccessor{
	
	public ArrayList GetList(String userId,Connection connection){

		try{
			String sql="select * from result_table where userId = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1,userId);
			ResultSet rs=stmt.executeQuery();

			ArrayList list = new ArrayList();

			//登録されている日記の数だけ繰り返す
			while(rs.next())
			{
				Result result = new Result();
				result.setUserId( rs.getString("userId") );
				result.setAnswerDate( rs.getTimestamp("answerDate") );
				result.setQuestionId( rs.getInt("questionId") );
				result.setResult( rs.getInt("result") );
				list.add(result);
			}

			stmt.close();
			rs.close();

			return list;

		}catch(SQLException e){

			e.printStackTrace();

			return null;

		}finally{
		}
	}
}
