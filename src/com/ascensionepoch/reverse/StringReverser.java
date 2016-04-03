package com.ascensionepoch.reverse;

public interface StringReverser {

	public static final String EOL = System.getProperty("line.separator");
	
	public String reverse(String string);
	
	public void printReverse(String string);
	
	public boolean isPalindrome(String string);
}
