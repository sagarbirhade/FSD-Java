package com.Ont_To_One_Hybernate.entity;

import jakarta.persistence.AssociationOverride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "anstable")
public class Answer {
	
	@Id
	@Column(name = "aid", nullable = true)
	private int aid;
	
	@Column
	private String Answer;
	
	@Column
	private double Obtained_marks;
	
	@OneToOne
	private Question question;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public double getObtained_marks() {
		return Obtained_marks;
	}

	public void setObtained_marks(double obtained_marks) {
		Obtained_marks = obtained_marks;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer(int aid, String answer, double obtained_marks, Question question) {
		super();
		this.aid = aid;
		Answer = answer;
		Obtained_marks = obtained_marks;
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", Answer=" + Answer + ", Obtained_marks=" + Obtained_marks + ", question="
				+ question + "]";
	}

	
	


	
	

}
