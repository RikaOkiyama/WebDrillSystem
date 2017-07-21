package manager;

import java.sql.Connection;
import java.util.ArrayList;

import dao.GetResultDAO;

public class GetResultManager {
	
	private Connection connection = null;
	
	public GetResultManager(){
	}
	
	public ArrayList GetList(String userId){
		
		GetResultDAO dao = new GetResultDAO();
		
		this.connection = dao.createConnection();
		
		ArrayList list = dao.GetList(userId, this.connection);
		
		dao.closeConnection(this.connection);
		
		this.connection = null;
		
		return list;
		
	}
}
