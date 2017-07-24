package beans;

public class Question {

	//属性
	private int id = 0;
	private String question = null;
	private String answer = null;
	private int activation = 0;
	private String userId = null;

	//初期値を引数に持ったコンストラクタ
	public Question(int id ,String question,String answer,int activation,String userId){
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.activation = activation;
		this.userId = userId;
	}

	//初期値を引数に持たないコンストラクタ
	public Question(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getActivation() {
		return activation;
	}

	public void setActivation(int activation) {
		this.activation = activation;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
