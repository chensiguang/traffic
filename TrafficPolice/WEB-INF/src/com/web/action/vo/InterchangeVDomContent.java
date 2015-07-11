/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.Interchange;

/**
 * @author ln
 *
 * 2013-9-15上午10:47:05
 */
public class InterchangeVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	// 问题id
    private Long qid;

    // 答案id
    private Long aid;

    // 问题
    private String question;

    // 回答内容
    private String answer;
    
    private String opertime;//操作时间
    
    private Long operid;//操作人id
   
    
    //操作人name
    private String username;

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

	public String getOpertime()
	{
		return opertime;
	}

	public void setOpertime(String opertime)
	{
		this.opertime = opertime;
	}

	public Long getOperid()
	{
		return operid;
	}

	public void setOperid(Long operid)
	{
		this.operid = operid;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	
	public InterchangeVDomContent()
	{
		
	}
	
	public InterchangeVDomContent(Interchange interchange)
	{
		if(null != interchange)
		{
			this.aid = interchange.getAid();
			
			this.answer = interchange.getAnswer();
			
			this.operid = interchange.getOperid();
			
			this.opertime = sdf.format(interchange.getOpertime());
			
			this.username = interchange.getUsername();
			
			this.question = interchange.getQuestion();
			
			this.qid = interchange.getQid();
		}
	}
    
}
