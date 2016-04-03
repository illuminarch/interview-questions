package com.ascensionepoch.reverse;

public abstract class AbstractStringReverser implements StringReverser {


	@Override
	public void printReverse(String string) {
		System.out.println("Original String: " + string + StringReverser.EOL + "Reversed String: " + reverse(string));
	}
	
	@Override
	public boolean isPalindrome(String string) {
		return string.equals(reverse(string));
	}

}
