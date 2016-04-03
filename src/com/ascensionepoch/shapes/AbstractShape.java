package com.ascensionepoch.shapes;

public abstract class AbstractShape implements Shape {

	protected int numSides; //0 will indicate a round shape
	protected int xDimension = 0;
	protected int yDimension = 0;
	protected int zDimension = 0;
	protected int tDimension = 0;
	
	public int getNumberOfSides() {
		return numSides;
	}
	
	public int getXDimension() {
		return xDimension;
	}
	
	public int getYDimension() {
		return yDimension;
	}
	
	public int getZDimension() {
		return zDimension;
	}
	
	@Override
	public boolean isPoint() {
		return xDimension == 0 && yDimension == 0 && zDimension == 0 && tDimension == 0;
	}
	
	@Override
	public boolean isLine() {
		return isFlatlander() && !isPoint()  && numSides < 3;
	}
	
	@Override
	public boolean isFlatlander() {
		return zDimension == 0;
	}
	
	@Override
	public boolean isEuclidean() {
		return numSides == 0;
	}
	
	@Override
	public boolean is3D() {
		return xDimension != 0 && yDimension != 0 && zDimension != 0 && !isHyperdimensional();
	}
	
	@Override
	public boolean isHyperdimensional() {
		return tDimension != 0;
	}
	
}
