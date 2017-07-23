package manager;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.Calendar;

import dao.ResultDAO;
import beans.Result;

public class ResultManager {
	//  属性
	private Connection connection = null;

	//  引数を持たないコンストラクタ
	public ResultManager(){
	}

	//  追加する
	//  引数はresultオブジェクト
	public void createResult(Result result){

		//  resultDAOオブジェクト生成
		ResultDAO resultDAO = new ResultDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = resultDAO.createConnection();

		//  resultオブジェクトをDataBaseに登録する
		resultDAO.createResult(result, this.connection);

		//  DataBaseとの接続を切断する
		resultDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;
	}
}
