package com.ascensionepoch.reverse;

public class StringBufferReverser extends AbstractStringReverser {

	@Override
	public String reverse(String string) {
		StringBuffer sb = new StringBuffer(string);
		return sb.reverse().toString();
	}

}
