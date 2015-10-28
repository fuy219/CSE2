//Fung Yeung
//CSE02
//Hw 08
// 10-27-15
//create 3 different methods with the same name in order to calculate area of a circle, rectangle, and trapezoid (whichever one applies)
import java.util.Scanner;// import scanner
public class areas{//add class
	public static double area(double a){//method for circle calculation
	double output= (3.14*a*a);// equation for calculation of circle area
		return output;// returns calculation result
	}
	public static double area(double a, double b){//method for rectangle calcuation
		double output= a*b;//equation for calculation of rectangle area
		return output;// returns calculation result
	}
	public static double area(double a, double b, double c){//method for trapezoid calculation
		double output= .5*(a+b)*c;//equation for calculation of trapezoid area
		return output;//returns calculation result
	}
	public static void main(String[]args){//add main method
		String answer="";//string left blank to start while loop
		while (!answer.equals("n")){//while loop set to go until string is equal to n
			Scanner myScanner=new Scanner(System.in);//initialize scanner
			System.out.print("Type 1 for circle, 2 for rectangle and 3 for trapezoid: ");//ask user to input 1,2,or 3 depending on shape
			int selection= myScanner.nextInt();//store user input for shape
			if (selection==1){//if statement used when user selects 1 which is the circle
				System.out.print("Type in radius of circle in x.x form: ");//ask user input for radius of circle
				double radius=myScanner.nextDouble();// stores user input for radius of circle
				double area=area(radius);// calls area method to calculate circle area
				System.out.println("The area of the circle is: "+area);//prints out result of circle area
			}
			else if (selection==2){//if statement used when user selects 2 which is the rectangle
				System.out.print("Type in length of rectangle in x.x form: ");//asks user input for length of rectangle
				double length= myScanner.nextDouble();//stores user input for length of rectangle
				System.out.print("Type in width of rectangle in x.x form: ");//asks user input for width of rectangle
				double width= myScanner.nextDouble();//stores user input for rectangle
				double area= area(length,width);// calls area method to calculate rectangle area
				System.out.println("The area of the rectangle is: " +area);// prints out results of rectangle area
			}
			else if (selection==3){// if statement used when user selects 3 which is the trapezoid
				System.out.print("Type in base1 of trapezoid in x.x form: ");//asks user input for base 1 of trapezoid
				double base1=myScanner.nextDouble();// stores user input of base1
				System.out.print("Type in base2 of trapezoid in x.x form: ");// asks user input for base 1 of trapezoid
				double base2=myScanner.nextDouble();//stores user input of base 2
				System.out.print("Type in height of trapezoid in x.x form: ");//asks user input for height of trapezoid
				double height=myScanner.nextDouble();//stores user input for height
				double area= area(base1,base2,height);//calls area method to calculate trapezoid area
				System.out.println("The area of the trapezoid is: "+area);//prints out results of trapezoid area
			}
			else{// if statement when user inputs invalid number
				System.out.println("Invalid number");// notifies user that they entered an invalid number
			}
			System.out.println("Would you like to continue?");// asks if user would like to continue program
			System.out.println("If no type n if yes type y");//asks user to type y if they wish to continue and n if they wish to stop
			answer=myScanner.next();//stores user input for continuing
		}
		}
	
	}
