package com.ascensionepoch.reverse;

public class ReverseString {
	
	public static final void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: stringToReverse reversalMethod");
		}
		
		StringReverser reverser = StringReverserFactory.buildStringReverser(args[1]);
		if (reverser != null) {
			reverser.printReverse(args[0]);
		}
		
		
	}

}
