import java.util.Scanner;

 public class Lab7{
 	public static void main(String[] args){

 		/*
		Then create a test application which queries the user for the needed data to create two Circle objects 
		and two RightTriangle objects.
		It will then display all information about the four objects. 
		It should then display which Circle object has the largest area and which RightTriangle object has the largest area.
		*/

		double radius, base, height;
		Scanner scan = new Scanner(System.in);

		System.out.println("\n");
		System.out.print("Enter the radius for the first circle: ");
		radius = scan.nextDouble();
		Circle circle1 = new Circle(radius);
		System.out.println("\n");

		System.out.print("Enter the radius for the second circle: ");
		radius = scan.nextDouble();
		Circle circle2 = new Circle(radius);
		System.out.println("\n");

		System.out.print("Enter the base of the first right triangle: ");
 		base = scan.nextDouble();
 		System.out.print("Enter the height of the first right triangle: ");
 		height = scan.nextDouble();
 		RightTriangle rt1 = new RightTriangle(base, height);
 		System.out.println("\n");

 		System.out.print("Enter the base of the second right triangle: ");
 		base = scan.nextDouble();
 		System.out.print("Enter the height of the second right triangle: ");
 		height = scan.nextDouble();
 		RightTriangle rt2 = new RightTriangle(base, height);
 		System.out.println("\n");
 		
 		scan.close();

		System.out.println("circle1 radius: " + circle1.getRadius());
 		System.out.println("circle1 area: " + circle1.getArea());
 		System.out.println("circle1 perimeter: " + circle1.getPerimeter());
		System.out.println("\n");

 		System.out.println("circle2 radius: " + circle2.getRadius());
 		System.out.println("circle2 area: " + circle2.getArea());
 		System.out.println("circle2 perimeter: " + circle2.getPerimeter());
 		System.out.println("\n");

 		System.out.println("Right Triangle 1 Base: " + rt1.getBase());
 		System.out.println("Right Triangle 1 Height: " + rt1.getHeight());
 		System.out.println("Right Triangle 1 Hypotenuse: " + rt1.getHypotenuse());
 		System.out.println("Right Triangle 1 Area: " + rt1.getArea());
 		System.out.println("Right Triangle 1 Perimeter: " + rt1.getPerimeter());
 		System.out.println("\n");

 		System.out.println("Right Triangle 2 Base: " + rt2.getBase());
 		System.out.println("Right Triangle 2 Height: " + rt2.getHeight());
 		System.out.println("Right Triangle 2 Hypotenuse: " + rt2.getHypotenuse());
 		System.out.println("Right Triangle 1 Area: " + rt2.getArea());
 		System.out.println("Right Triangle 1 Perimeter: " + rt2.getPerimeter());
 		System.out.println("\n");

 		if(circle1.getArea() > circle2.getArea()){
 			System.out.println("Circle 1 has a greater Area than Circle 2\n");
 		}else{
 			System.out.println("Circle 2 has a greater Area than Circle 1\n");
 		}

 		 if(rt1.getArea() > rt2.getArea()){
 			System.out.println("Right Triangle 1 has a greater Area than Right Triangle 2\n");
 		}else{
 			System.out.println("Right Triangle 2 has a greater Area than Right Triangle 1\n");
 		}

 	}
 }

 /*
Create a class Circle with one instance variable of type double called radius. 
Then define an appropriate constructor that takes an initial value for the radius, get and set methods for the radius, 
and methods getArea and getPerimeter.(done)
 */

 class Circle{
 	private double radius, area, perimeter;


 	//radius getter
 	public double getRadius(){
 		return radius;
 	}
 	//radius setter
 	public void setRadius(double newRadius){
 		this.radius = newRadius;
 	}

 	//getArea method
 	public double getArea(){
 		area = 3.14*Math.pow(getRadius(), 2);
 		return area;
 	}

 	//getPerimeter method
 	public double getPerimeter(){
 		perimeter = 2*3.14*getRadius();
 		return perimeter;
 	}

 	//constructor
 	public Circle(double radius){
 		this.radius = radius;
 	}

 	

 }

 
/*
Create a class RightTriangle with three instance variables of type double called base, height, 
and hypotenuse. 
Then define an appropriate constructor that takes initial values for the base and height and calculates the hypotenuse, 
a single set method which takes new values for base and height and calculates the hypotenuse, get methods for all three instance variables, 
and methods getArea and getPerimeter.
*/

 class RightTriangle{
 	private double base, height, hypotenuse, area, perimeter;

 	//getBase
 	public double getBase(){
 		return base;
 	}

 	//getHeight
 	public double getHeight(){
 		return height;
 	}

 	//getHypotenuse
 	public double getHypotenuse(){
 		hypotenuse = Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getHeight(), 2));
 		return hypotenuse;
 	}

 	//getArea
 	public double getArea(){
 		area = (getBase()*getHeight())/2;
 		return area;
 	}

 	//getPerimeter
 	public double getPerimeter(){
 		perimeter = getBase() + getHeight() + getHypotenuse();
 		return perimeter;
 	}

 	//setValues
 	public void setValues(double newBase, double newHeight){
 		this.base = newBase;
 		this.height = newHeight;
 		this.hypotenuse = getHypotenuse();
 	}

 	//constructor
 	public RightTriangle(double base, double height){
 		this.base = base;
 		this.height = height;		
 	}



 }

