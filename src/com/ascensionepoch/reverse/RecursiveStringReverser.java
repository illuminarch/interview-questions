package com.ascensionepoch.reverse;

public class RecursiveStringReverser extends AbstractStringReverser {

	@Override
	public String reverse(String string) {
		if (string == null)
			return null;
		
		if (string.length() == 1) 
			return string;
		
		return reverse(string.substring(1)) + string.charAt(0);
	}
	
	
}
