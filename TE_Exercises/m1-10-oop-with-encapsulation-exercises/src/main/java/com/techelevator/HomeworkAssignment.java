package com.techelevator;

public class HomeworkAssignment {
	
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public String getLetterGrade() {
		String letterGrade;
		if (totalMarks >= 90) {
			letterGrade = "A";
			return letterGrade;
		}
		else if ((totalMarks >= 80) && (totalMarks <= 89)) {
			letterGrade = "B";
			return letterGrade;
		}
		else if ((totalMarks >= 70) && (totalMarks <= 79)) {
			letterGrade = "C";
			return letterGrade;
		}
		else if ((totalMarks >= 60) && (totalMarks <= 69)) {
			letterGrade = "D";
			return letterGrade;
		}
		else {
			letterGrade = "F";
			return letterGrade;
		}
	}


	
	
}
