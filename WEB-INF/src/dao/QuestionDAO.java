package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utility.DriverAccessor;
import beans.Question;

public class QuestionDAO extends DriverAccessor{

		//  情報をデータベースに登録する
		//  引数はuserオブジェクトと、Connectionオブジェクト
		public void createQuestion(Question question, Connection connection){

			try{

				//  SQLコマンド insert into=値をカラムに入れる
				String sql = "insert into question (question, answer, activation, userId) values ( ?, ?, ?, ?)";

				//  SQLコマンドの実行
				PreparedStatement stmt = connection.prepareStatement(sql);

				//  SQLコマンドのクエッションマークに値を、1番目から代入する
				stmt.setString(1,question.getQuestion());
				stmt.setString(2,question.getAnswer());
				stmt.setInt(3,question.getActivation());
				stmt.setString(4,question.getUserId());
				
				stmt.executeUpdate();

				System.out.println(sql);

			}catch(SQLException e){

				//エラーが発生した場合、エラーの原因を出力する
				e.printStackTrace();

			} finally {
			}
		}
		
		public Question Select(String id,Connection connection){

			try{
				String sql="select * from question where id = ?";

				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1, id);
				ResultSet rs=stmt.executeQuery();

				rs.first();

				Question question = new Question();

				question.setId( rs.getInt("id"));
				question.setQuestion( rs.getString("question") );
				question.setAnswer( rs.getString("answer") );
				question.setActivation( rs.getInt("activation") );
				question.setUserId( rs.getString("userId"));

				stmt.close();
				rs.close();

				return question;

			}catch(SQLException e){

				e.printStackTrace();

				return null;

			}finally{
			}
		}
		
		public void Update(Question question,Connection connection) {

			try{

				String sql = "update question set question = ? ,answer = ? , activation = ? , userId = ? where id = ?";

				PreparedStatement stmt = connection.prepareStatement(sql);

				stmt.setString(1,question.getQuestion());
				stmt.setString(2,question.getAnswer());
				stmt.setInt(3,question.getActivation());
				stmt.setString(4,question.getUserId());
				stmt.setInt(5,question.getId());

				stmt.executeUpdate();

				stmt.close();

			}	catch(SQLException e){

				e.printStackTrace();

			} finally {
			}
		}
		
		public void Delete(String id,Connection connection){
			try{
				String sql = "delete from question where id= '"+id+"' ";

				PreparedStatement stmt = connection.prepareStatement(sql);
				
				stmt.executeUpdate();

				stmt.close();

			}catch(SQLException e){

				e.printStackTrace();

			} finally {
			}
		}
	}		
