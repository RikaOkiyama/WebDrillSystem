package beans;

public class Result {
	
	//属性
	private String userId = null;
	private int questionId;
	private String answer;
	private String result;
	
	public Result(String userId,int questionId, String answer, String result){
		this.userId = userId;
		this.questionId = questionId;
		this.answer = answer;
		this.result = result;
	}
	
	public Result(){}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
