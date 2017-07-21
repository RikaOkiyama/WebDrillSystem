// user_id passwordの新しい型を作る
package beans;

public class User {

	//  属性
	private String id = null;
	private String password = null;
	private int role = 0;

	//　初期値を引数に持ったコンストラクタ
	public User(String id, String password, int actor){
		this.id = id;
		this.password = password;
		this.role = role;
	}

	//  初期値を引数に持たないコンストラクタ
	//  Java beansは初期値を持たないコンストラクタが必ず必要
	public User(){}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
}
