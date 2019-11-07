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
 		boolean programDebug = true;

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

 			userChoice = scan.nextInt();

 			switch(userChoice){

 				case 1: 
 					if(count<10){
	 					System.out.println("Enter right triangle height: ");
	 					height = scan.nextDouble();
	 					System.out.println("Enter right triangle base: ");
	 					base = scan.nextDouble();
	 					System.out.println("Enter the X coordinate: ");
	 					rtX = scan.nextInt();
	 					System.out.println("Enter the Y coordinate: ");
	 					rtY = scan.nextInt();

	 					rt1[count++] = new RightTriangle(height, base, rtID, rtX, rtY);
	 					rtID +=1;
	 				}else{
	 					System.out.println("\nThe program has reached the max number of right triangles allowed.\n");
	 				}
	 				break;

	 			case 2:
 					System.out.println("Enter the Right Triangle ID: ");
 					rtIndex = scan.nextInt();
 					for(int j=0; j<count; j++){
 						if(rt1[j].rtID == rtIndex){
 							rt1[j] = rt1[count-1];
 							rt1[count-1] = null;
 							count--;
 							System.out.println("\nRight Triangle with ID " + rtIndex + " has been deleted\n");
 							programDebug = false;
 						}
 					}
 					if(programDebug){
 						System.out.println("\nInvalid Right Triangle ID\n");
 					}
 					break;

 				case 3: 
 					for(int j=0; j<count; j++){
 						rt1[j] = null;
 					}
 					count = 0;
 					System.out.println("\nAll right triangles have been deleted.\n");
 					break;

 				case 4:
 					for(int j=0; j<count; j++){

 						System.out.println("\nRight Triangle ID: " + rt1[j].rtID);
 						System.out.println("Right Triangle Height: " + rt1[j].getHeight());
 						System.out.println("Right Triangle Base: " + rt1[j].getBase());
 						System.out.println("Right Triangle Hypotenuse: " + rt1[j].getHypotenuse());
 						System.out.println("Right Triangle X coordinate: " + rt1[j].rtX);
 						System.out.println("Right Triangle Y coordinate: " + rt1[j].rtY + "\n");
 					}
 					break;

 				case 5:
 					rtIndex = scan.nextInt();
 					for(int j=0; j<count; j++){
 						if(rt1[j].rtID == rtIndex){
 							System.out.println("Enter the Right Triangle X coordinate: ");
 							rtX = scan.nextInt();
 							rt1[j].setX(rtX);
 							System.out.println("Enter the Right Triangle Y coordinate: ");
 							rtY = scan.nextInt();
 							rt1[j].setY(rtY);
 							programDebug = false;
 						}
 					}
 					if(programDebug){
 							System.out.println("\nInvalid Right Triangle ID\n");
 					}
 					break;

 				case 6:
 					System.out.println("Enter the Right Triangle ID: ");
 					rtIndex = scan.nextInt();
 					for(int j=0; j<count; j++){
 						if(rt1[j].rtID == rtIndex){
 							System.out.println("Enter the New Height for the Right Triangle: ");
 							height = scan.nextInt();
 							System.out.println("Enter the New Base for the Right Triangle: ");
 							base = scan.nextInt();
 							rt1[j].setValues(base, height);
 							programDebug = false
 						}
 					}
 					if(programDebug){
 						System.out.println("\nInvalid Right Triangle ID\n");
 					}
 					break;

 			}//end of switch


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

