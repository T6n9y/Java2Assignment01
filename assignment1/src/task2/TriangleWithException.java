package task2;

import task1.GeometricObject;

public class TriangleWithException extends GeometricObject{
	// fields named side1, side2, and side3 with default
	// values 1.0 to denote three sides of the triangle
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
			
	// no-arg constructor that creates a default triangle
	TriangleWithException(){
		super();
	}
			
	// constructor that creates a triangle with the specified
	// side1, side2, and side3.
	TriangleWithException(double side1, double side2, double side3)
	throws TriangleException{
		try {
			// get the maximum, medium, minimum value of the three sides
			double maxSide = Math.max(side1, Math.max(side2, side3));
			double midSide = Math.min(side1, Math.max(side2, side3));
			double minSide = Math.min(side1, Math.min(side2, side3));
			
			// validate the sides obey the triangle rule 
			if(maxSide >= midSide + minSide) {
				throw new TriangleException();
			}
		
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		catch(TriangleException ex) {
//			// re-throw the exception to terminate processing
			throw ex;
		}
				
	}
			
	// accessor methods for all three data fields
	public double getSide1() {
		return this.side1;
	}
			
	public double getSide2() {
		return this.side2;
	}
			
	public double getSide3() {
		return this.side3;
	}
			
	// method named getArea() that returns the area of this triangle
	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
			
	// method named getPerimeter() that returns the perimeter
	// of this triangle
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
			
	//  method named toString() that returns a string description for
	// the triangle
	public String toString() {
		return "\nSides of the triangle: " + getSide1() + ", " + getSide2() + ", " + getSide3() +
				"\nArea of the triangle: " + getArea() +
				"\nPerimeter of the traangle: " + getPerimeter() +
				"\nColor of the triangle: " + super.getColor() +
				"\nFilled or not: " + super.getFilled();			
	}	
	

}