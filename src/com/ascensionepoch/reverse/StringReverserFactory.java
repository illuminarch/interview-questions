package com.ascensionepoch.reverse;

public class StringReverserFactory {
	static final String sbId = ReversalStrategy.STRING_BUFFER.getId();
	static final String iterId = ReversalStrategy.ITERATIVE.getId();
	static final String recurseId = ReversalStrategy.RECURSIVE.getId();

	
	public static StringReverser buildStringReverser(String strategy) {
		
		
		if (strategy == null) {
			System.out.println("No method type specified. ");
			return null;
		}
		
		if (strategy.toUpperCase().equals(ReversalStrategy.STRING_BUFFER.getId())) {
			System.out.println(ReversalStrategy.STRING_BUFFER.getName() + " strategy selected.");
			return new StringBufferReverser();
		}
		else if (strategy.toUpperCase().equals(ReversalStrategy.ITERATIVE.getId())) {
			System.out.println(ReversalStrategy.ITERATIVE.getName() + " strategy selected.");
			return new IterativeStringReverser();
		}
		else if (strategy.toUpperCase().equals(ReversalStrategy.RECURSIVE.getId())) {
			System.out.println(ReversalStrategy.RECURSIVE.getName() + " strategy selected.");
			return new RecursiveStringReverser();
		}
		else {
			System.out.println("Unrecognized method type specified. Specify either 'SB', 'ITER', or 'RECURSIVE'");
			 return null;
		}

	}
}
