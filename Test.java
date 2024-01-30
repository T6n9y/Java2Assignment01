package GroupAssignment;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		Scanner kbd = new Scanner(System.in);
		double side1, side2, side3;
		boolean filled;
		Triangle triangle = new Triangle();
		
		
		//GET USER INPUT FOR TRIANGLE SIDES
		do {
			System.out.println("Is the Triangle color filled? (true/false):");
			filled = kbd.nextBoolean();
			triangle.setFilled(filled);
			System.out.println("Enter the 3 sides of the Triangle: ");
			System.out.println("Side 1 :");
			side1 = kbd.nextDouble();
			System.out.println("Side 2 :");
			side2 = kbd.nextDouble();		
			System.out.println("Side 3 :");
			side3 = kbd.nextDouble();
			
			if(side1<= 0 || side2 <= 0 || side3 <= 0) {
				System.out.println("Enter a positive value for the sides");
			}
		}while (side1 <=0 || side2<= 0 || side3<=0);
			
		
		
		//SET THE SIDES TO THE TRIANGLE
		triangle.setSide1(side1);
		triangle.setSide2(side2);
		triangle.setSide3(side3);
		
		//PRINTS THE TRIANGLE INFO
		System.out.println(triangle.toString());
		
		kbd.close();

	}

}
