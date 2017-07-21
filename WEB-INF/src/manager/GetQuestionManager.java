package manager;

import java.sql.Connection;
import java.util.ArrayList;

import dao.GetQuestionDAO;

public class GetQuestionManager {
	
	private Connection connection = null;
	
	public GetQuestionManager(){
	}
	
	public ArrayList GetList(int id){
		
		GetQuestionDAO dao = new GetQuestionDAO();
		
		this.connection = dao.createConnection();
		
		ArrayList list = dao.GetList(id, this.connection);
		
		dao.closeConnection(this.connection);
		
		this.connection = null;
		
		return list;
		
	}
}
