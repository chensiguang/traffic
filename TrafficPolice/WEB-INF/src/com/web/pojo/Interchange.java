package com.web.pojo;

/**
 * 
 * @ClassName: Interchange
 * 
 * @Description: TODO
 * 
 * @author ln
 * 
 * 
 * 
 */
public class Interchange extends BasePojo
{
	// 问题id
	private Long qid;

	// 答案id
	private Long aid;

	// 问题
	private String question;

	// 回答内容
	private String answer;

	// 操作人name
	private String username;

	private Admin admin;//

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Long getQid()
	{
		return qid;
	}

	public void setQid(Long qid)
	{
		this.qid = qid;
	}

	public Long getAid()
	{
		return aid;
	}

	public void setAid(Long aid)
	{
		this.aid = aid;
	}

	public String getQuestion()
	{
		return question;
	}

	public void setQuestion(String question)
	{
		this.question = question;
	}

	public String getAnswer()
	{
		return answer;
	}

	public void setAnswer(String answer)
	{
		this.answer = answer;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String toJson()
	{
		StringBuffer strbuffBuffer = new StringBuffer();

		strbuffBuffer.append("{'id':'");
		strbuffBuffer.append(getId());
		strbuffBuffer.append("','qid':'");
		strbuffBuffer.append(qid);
		strbuffBuffer.append("','aid':'");
		strbuffBuffer.append(aid);
		strbuffBuffer.append("','question':'");
		strbuffBuffer.append(question);
		strbuffBuffer.append("','answer':'");
		strbuffBuffer.append(answer);
		strbuffBuffer.append("','username':'");
		strbuffBuffer.append(username);
		strbuffBuffer.append("'}");
		return strbuffBuffer.toString();
	}
}
