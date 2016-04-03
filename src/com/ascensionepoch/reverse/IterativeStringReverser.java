package com.ascensionepoch.reverse;

public class IterativeStringReverser extends AbstractStringReverser {

	@Override
	public String reverse(String string) {
		if (string == null)
			return null;
		
		int strLen = string.length();
		if (strLen == 1)
			return string;
		
		char[] arr = string.toCharArray();
		char[] reversedArr = new char[strLen]; 
		
		int revIdx = 0;
		for (int i = strLen - 1; i > -1; i--)  {
			reversedArr[revIdx] = arr[i];
			revIdx++;
		}
		
		return new String(reversedArr);
	}
	
}
