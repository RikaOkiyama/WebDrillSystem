package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utility.DriverAccessor;
import beans.Question;

public class GetQuestionDAO extends DriverAccessor{
	
	public ArrayList GetList(String id,Connection connection){
		
		try{
			String sql="select * from question";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			
			ArrayList list = new ArrayList();
			
			while(rs.next()){
				Question question = new Question();
				question.setId(rs.getInt("id"));
				question.setQuestion(rs.getString("question"));
				question.setAnswer(rs.getString("answer"));
				question.setActivation(rs.getInt("activation"));
				list.add(question);
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
	
public ArrayList GetList1(String id,Connection connection){
		
		try{
			String sql="select * from question";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			
			ArrayList list = new ArrayList();
			
			while(rs.next()){
				Question question = new Question();
				question.setId(rs.getInt("id"));
				question.setQuestion(rs.getString("question"));
				question.setAnswer(rs.getString("answer"));
				question.setActivation(rs.getInt("activation"));
				list.add(question);
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