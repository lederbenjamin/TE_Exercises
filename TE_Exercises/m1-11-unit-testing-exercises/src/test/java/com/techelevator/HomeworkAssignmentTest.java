package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

public class HomeworkAssignmentTest {

	private HomeworkAssignment assignment;
	
	@Before
	public void Constructor() {
		assignment = new HomeworkAssignment(100);

	}
	
	@Test
	public void ShouldGetA() {
		assignment.setTotalMarks(90);
		Assert.assertEquals("A", assignment.getLetterGrade());
	}
	
	@Test
	public void ShouldGetB() {
		assignment.setTotalMarks(80);
		Assert.assertEquals("B", assignment.getLetterGrade());
	}

	@Test
	public void ShouldGetC() {
		assignment.setTotalMarks(70);
		Assert.assertEquals("C", assignment.getLetterGrade());
	}
	
	@Test
	public void ShouldGetD() {
		assignment.setTotalMarks(60);
		Assert.assertEquals("D", assignment.getLetterGrade());
	}
	
	@Test
	public void ShouldGetF() {
		assignment.setTotalMarks(59);
		Assert.assertEquals("F", assignment.getLetterGrade());
	}
	
	
	@Test
	public void ShouldOnlyTotalMarksValuesBetween1and100() {
		HomeworkAssignment assignment1 = new HomeworkAssignment(100);
		assignment1.setTotalMarks(101);
		Assert.assertEquals(0, assignment1.getTotalMarks());
		
		HomeworkAssignment assignment2 = new HomeworkAssignment(100);
		assignment2.setTotalMarks(-1);
		Assert.assertEquals(0, assignment2.getTotalMarks());
	}
	
	
	

}
