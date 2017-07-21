package manager;
import java.sql.Connection;


import dao.QuestionDAO;
import beans.Question;

public class QuestionManager {
	//  属性
	private Connection connection = null;

	//  引数を持たないコンストラクタ
	public QuestionManager(){
	}

	//  追加する
	//  引数はuserオブジェクト
	public void createQuestion(Question question){

		//  userDAOオブジェクト生成
		QuestionDAO questionDAO = new QuestionDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = questionDAO.createConnection();

		//  userオブジェクトをDataBaseに登録する
		questionDAO.createQuestion(question, this.connection);

		//  DataBaseとの接続を切断する
		questionDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;
	}

	public void Delete(String id) {
		QuestionDAO dao = new QuestionDAO();
		this.connection = dao.createConnection();

		dao.Delete(id, this.connection);

		dao.closeConnection(this.connection);

		this.connection = null;
	}

	public Question Select(String id) {
		QuestionDAO dao = new QuestionDAO();
		this.connection = dao.createConnection();

		Question question = dao.Select(id, this.connection);

		dao.closeConnection(this.connection);

		this.connection = null;

		return question;
	}
}

