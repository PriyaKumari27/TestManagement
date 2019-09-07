package com.cg.TestManagement.dto;

import java.math.BigDecimal;
import java.util.Arrays;

public class Question {
	
	private BigDecimal questionId;
	private String[] qusetionOptions;
	private String questionTitle;
	private Integer questionAnswer;
	private BigDecimal questionMarks;
	private Integer chosenAnswer;
	private BigDecimal marksScored;
	
	public Question() {
		
	}
	
	public Question(BigDecimal questionId, String[] qusetionOptions, String questionTitle, Integer questionAnswer,
			BigDecimal questionMarks, Integer chosenAnswer, BigDecimal marksScored) {
		super();
		this.questionId = questionId;
		this.qusetionOptions = qusetionOptions;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.questionMarks = questionMarks;
		this.chosenAnswer = chosenAnswer;
		this.marksScored = marksScored;
	}

	public BigDecimal getQuestionId() {
		return questionId;
	}

	public void setQuestionId(BigDecimal questionId) {
		this.questionId = questionId;
	}

	public String[] getQusetionOptions() {
		return qusetionOptions;
	}

	public void setQusetionOptions(String[] qusetionOptions) {
		this.qusetionOptions = qusetionOptions;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public Integer getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(Integer questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public BigDecimal getQuestionMarks() {
		return questionMarks;
	}

	public void setQuestionMarks(BigDecimal questionMarks) {
		this.questionMarks = questionMarks;
	}

	public Integer getChosenAnswer() {
		return chosenAnswer;
	}

	public void setChosenAnswer(Integer chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}

	public BigDecimal getMarksScored() {
		return marksScored;
	}

	public void setMarksScored(BigDecimal marksScored) {
		this.marksScored = marksScored;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", qusetionOptions=" + Arrays.toString(qusetionOptions)
				+ ", questionTitle=" + questionTitle + ", questionAnswer=" + questionAnswer + ", questionMarks="
				+ questionMarks + ", chosenAnswer=" + chosenAnswer + ", marksScored=" + marksScored + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chosenAnswer == null) ? 0 : chosenAnswer.hashCode());
		result = prime * result + ((marksScored == null) ? 0 : marksScored.hashCode());
		result = prime * result + ((questionAnswer == null) ? 0 : questionAnswer.hashCode());
		result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
		result = prime * result + ((questionMarks == null) ? 0 : questionMarks.hashCode());
		result = prime * result + ((questionTitle == null) ? 0 : questionTitle.hashCode());
		result = prime * result + Arrays.hashCode(qusetionOptions);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (chosenAnswer == null) {
			if (other.chosenAnswer != null)
				return false;
		} else if (!chosenAnswer.equals(other.chosenAnswer))
			return false;
		if (marksScored == null) {
			if (other.marksScored != null)
				return false;
		} else if (!marksScored.equals(other.marksScored))
			return false;
		if (questionAnswer == null) {
			if (other.questionAnswer != null)
				return false;
		} else if (!questionAnswer.equals(other.questionAnswer))
			return false;
		if (questionId == null) {
			if (other.questionId != null)
				return false;
		} else if (!questionId.equals(other.questionId))
			return false;
		if (questionMarks == null) {
			if (other.questionMarks != null)
				return false;
		} else if (!questionMarks.equals(other.questionMarks))
			return false;
		if (questionTitle == null) {
			if (other.questionTitle != null)
				return false;
		} else if (!questionTitle.equals(other.questionTitle))
			return false;
		if (!Arrays.equals(qusetionOptions, other.qusetionOptions))
			return false;
		return true;
	}
	
}