package com.ascensionepoch.reverse;

public class ReversalStrategy {

	public static final ReversalStrategy STRING_BUFFER = new ReversalStrategy("SB", "String Buffer Strategy");
	public static final ReversalStrategy ITERATIVE = new ReversalStrategy("ITER", "Iterative Strategy");
	public static final ReversalStrategy RECURSIVE = new ReversalStrategy("RECURSIVE", "Recursive Strategy");
	
	private String id, name;
	
	public ReversalStrategy(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
