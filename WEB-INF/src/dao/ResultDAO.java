package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utility.DriverAccessor;
import beans.Result;

public class ResultDAO extends DriverAccessor{
	
		//  Connectionオブジェクトを使って、データベースとの接続を切断する
		//  引数Connectionオブジェクト
		public void closeConnection(Connection con){

			try{
				con.close();
			}catch(Exception ex){}
		}

		//  情報をデータベースに登録する
		//  引数はuserオブジェクトと、Connectionオブジェクト
		public void createResult(Result result, Connection connection){

			try{

				//  SQLコマンド insert into=値をカラムに入れる
				String sql = "insert into result (userId, answerDate, questionId,result) values (?, ?, ?, ?)";

				//  SQLコマンドの実行
				PreparedStatement stmt = connection.prepareStatement(sql);

				//  SQLコマンドのクエッションマークに値を、1番目から代入する
				stmt.setString(1,result.getUserId());
				stmt.setTimestamp(2,result.getAnswerDate());
				stmt.setInt(3,result.getQuestionId());
				stmt.setInt(4,result.getResult());
				
				stmt.executeUpdate();

				System.out.println(sql);

			}catch(SQLException e){

				//エラーが発生した場合、エラーの原因を出力する
				e.printStackTrace();

			} finally {
			}
		}
}
