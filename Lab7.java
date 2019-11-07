import java.util.Scanner;

 public class Lab7{
 	public static void main(String[] args){

 		Scanner scan = new Scanner(System.in);
 		double height, base;
 		int count = 0;
 		int rtID = 0;
 		int userChoice, rtIndex, rtX, rtY;

 		RightTriangle rt1[] = new RightTriangle[10];

 		boolean programRunner = true;
 		boolean programDebug;

 		while(programRunner){
 			System.out.println("1 - Enter a new right triangle \n");
 			System.out.println("2 - Delete a right triangle \n");
 			System.out.println("3 - Delete all right triangles \n");
 			System.out.println("4 - Display all right triangle \n");
 			System.out.println("5 - Move a triangle \n");
 			System.out.println("6 - Resize a triangle \n");
 			System.out.println("7 - Enter a scale factor \n");
 			System.out.println("8 - Scale all triangles \n");
 			System.out.println("9 - Exit program \n\n");
 			System.out.println("Please choose an option: ");

 			



 			
 		}

 	}
 }
 

 class RightTriangle{
 	private double base, height, hypotenuse, area, perimeter;
 	int rtID, rtX, rtY;
 	static double rtScale;

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

 	//setValues for base,height and calculate hypotenuse
 	public void setValues(double newBase, double newHeight){
 		this.base = newBase;
 		this.height = newHeight;
 		this.hypotenuse = getHypotenuse();
 	}

 	//setX
 	public void setX(int x){
 		this.rtX = x;
 	}

 	//setY
 	public void setY(int y){
 		this.rtY = y;
 	}

 	//setScale
 	public void scaleTriangle(){
 		this.height = this.height*rtScale;
 		this.base = this.base*rtScale;
 		this.hypotenuse = this.hypotenuse*rtScale;
 	}

 	//constructor
 	public RightTriangle(double base, double height, int rtID, int rtX, int rtY){
 		this.base = base;
 		this.height = height;
 		this.rtID = rtID;
 		this.rtX = rtX;
 		this.rtY = rtY;		
 	}



 }

