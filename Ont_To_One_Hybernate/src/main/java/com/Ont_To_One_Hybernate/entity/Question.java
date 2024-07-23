package com.Ont_To_One_Hybernate.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "quetable")
public class Question {
	@Id
	@Column(name = "qid", nullable = true)
	private int qid;
	
	@Column
	private String question;
	
	@Column
	private double total_marks;
	
	@OneToOne(targetEntity = Answer.class, cascade = CascadeType.ALL)
	private Answer answer;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public double getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(double total_marks) {
		this.total_marks = total_marks;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(int qid, String question, double total_marks, Answer answer) {
		super();
		this.qid = qid;
		this.question = question;
		this.total_marks = total_marks;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", total_marks=" + total_marks + ", answer=" + answer
				+ "]";
	}

	
	
	
}
