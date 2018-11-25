package com.techelevator;

public class KataRomanNumerals {
	
	private String[] oneRoman = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"  };
	private String[] tenRoman = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"  };
	private String[] hundredRoman = new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	private String[] thousandRoman  = new String[] {"","M", "MM", "MMM"};
	
	
	
	public String convertToRoman (int n) {
		
		String romanNumeral = "";
		String tensplace = "";
		String hundredsplace = "";
		String thousandsplace = "";
		int remainder;
		
		if(n >= 1000 && n <= 3000 ) 
		{
			thousandsplace = thousandRoman[n/1000];
			remainder = n % 1000;
			romanNumeral += thousandsplace;
			hundredsplace = hundredRoman[remainder/100];
			remainder = n % 100;
			romanNumeral += hundredsplace;
			tensplace = tenRoman[remainder/10];
			remainder = n % 10;
			romanNumeral += tensplace;
			romanNumeral += oneRoman[remainder/10];
		}
		else if(n >= 100 && n <= 999 ) 
		{
			hundredsplace = hundredRoman[n/100];
			remainder = n % 100;
			romanNumeral += hundredsplace;
			tensplace = tenRoman[remainder/10];
			remainder = n % 10;
			romanNumeral += tensplace;
			romanNumeral += oneRoman[remainder/10];
		}
		else if(n >= 10 && n <= 99 ) 
		{
			tensplace = tenRoman[n/10];
			remainder = n % 10;
			romanNumeral += tensplace;
			romanNumeral += oneRoman[remainder/10];
		}
		else if(n >= 1 && n <= 9 ) 
		{
			romanNumeral += oneRoman[n % 10];
		}
		
		return romanNumeral;
		
	}


}

