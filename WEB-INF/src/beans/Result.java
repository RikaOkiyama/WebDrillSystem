package beans;

import java.sql.Timestamp;

public class Result {
	
	//属性
	private String userId = null;
	private Timestamp answerDate = null;
	private int questionId;
	private int result = 0;
	
	public Result(String userId,Timestamp answerDate,int question, int result){
		this.userId = userId;
		this.answerDate = answerDate;
		this.questionId = questionId;
		this.result = result;
	}
	
	public Result(){}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Timestamp getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(Timestamp answerDate) {
		this.answerDate = answerDate;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
