package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
	
	@Test
	public void testConstructor() {
		KataRomanNumerals roman = new KataRomanNumerals();
		Assert.assertNotNull(roman);
	}

	@Test
	public void testOnes() {
		KataRomanNumerals roman = new KataRomanNumerals();
		Assert.assertEquals("I", roman.convertToRoman(1));
		Assert.assertEquals("II", roman.convertToRoman(2));
		Assert.assertEquals("III", roman.convertToRoman(3));
		Assert.assertEquals("IV", roman.convertToRoman(4));
		Assert.assertEquals("V", roman.convertToRoman(5));
		Assert.assertEquals("VI", roman.convertToRoman(6));
		Assert.assertEquals("VII", roman.convertToRoman(7));
		Assert.assertEquals("VIII", roman.convertToRoman(8));
		Assert.assertEquals("IX", roman.convertToRoman(9));
	}
	
	@Test
	public void testTens() {
		KataRomanNumerals roman = new KataRomanNumerals();
		Assert.assertEquals("X", roman.convertToRoman(10));
		Assert.assertEquals("XX", roman.convertToRoman(20));
		Assert.assertEquals("XXX", roman.convertToRoman(30));
		Assert.assertEquals("XL", roman.convertToRoman(40));
		Assert.assertEquals("L", roman.convertToRoman(50));
		Assert.assertEquals("LX", roman.convertToRoman(60));
		Assert.assertEquals("LXX", roman.convertToRoman(70));
		Assert.assertEquals("LXXX", roman.convertToRoman(80));
		Assert.assertEquals("XC", roman.convertToRoman(90));
	}
	
	@Test
	public void testHundreds() {
		KataRomanNumerals roman = new KataRomanNumerals();
		Assert.assertEquals("C", roman.convertToRoman(100));
		Assert.assertEquals("CC", roman.convertToRoman(200));
		Assert.assertEquals("CCC", roman.convertToRoman(300));
		Assert.assertEquals("CD", roman.convertToRoman(400));
		Assert.assertEquals("D", roman.convertToRoman(500));
		Assert.assertEquals("DC", roman.convertToRoman(600));
		Assert.assertEquals("DCC", roman.convertToRoman(700));
		Assert.assertEquals("DCCC", roman.convertToRoman(800));
		Assert.assertEquals("CM", roman.convertToRoman(900));
	}
	
	@Test
	public void testThousands() {
		KataRomanNumerals roman = new KataRomanNumerals();
		Assert.assertEquals("M", roman.convertToRoman(1000));
		Assert.assertEquals("MM", roman.convertToRoman(2000));
		Assert.assertEquals("MMM", roman.convertToRoman(3000));
	}
}