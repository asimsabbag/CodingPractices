package codingpractice;
import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Shape shape;
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the shape to get the area : ");
			String shapeType = input.next();
			if (shapeType.equals("Circle")) {
				
				System.out.println("Enter radius of circle : ");
				float radius = input.nextFloat();
				shape = new Circle(); 
				System.out.println("Area " + shape.getArea(radius));
				
			} 
			else if (shapeType.equals("Rectangle")) {
				
				System.out.println("Enter breadth of Rectangle : ");
				float breadth = input.nextFloat();
				System.out.println("Enter length of Rectangle : ");
				float length = input.nextFloat();
				shape = new Rectangle(); 
				System.out.println("Area " + shape.getArea(breadth,length));
				
			}
			else if (shapeType.equals("Square")) {
				
				System.out.println("Enter side of square : ");
				float side = input.nextFloat();
				shape = new Square(); 
				System.out.println("Area " + shape.getArea(side));
				
			}
			else if (shapeType.equals("Triangle")) {
				
				System.out.println("Enter base of Triangle : ");
				float base = input.nextFloat();
				System.out.println("Enter height of Triangle : ");
				float height = input.nextFloat();
				shape = new Triangle(); 
				System.out.println("Area " + shape.getArea(base,height));
				
			}
			else {
				
				System.out.println("Invalid shape");
				
			}	
		} finally {
			
			input.close();
			
		}
		
	}

}
