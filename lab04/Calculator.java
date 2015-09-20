//Fung Yeung
//Lab04
//9/17/15
//CSE02
//Create a program that uses switch statements to calcultate user imput
    //import command out side public class
    import java.util.Scanner;
    //add class
    public class Calculator{
        public static void main(String[] args){
            
            Scanner myScanner = new Scanner( System.in ); //declare scanner instance
            System.out.print("Enter first number in form of x.x: ");// prompt user to input first number
            double a= myScanner.nextDouble();//accepts first number input from user
            System.out.print("Enter second number in form of x.x: ");// prompt user to input second number
            double b= myScanner.nextDouble(); //accepts second number input from user
            System.out.println("If addtion=1, if subtraction=2, if multiplication=3, if division=4");// give user operation options
            System.out.print("Enter operation of choice: ");// prompts user to put in operation of choice
            int operation= myScanner.nextInt();// accepts operation input from user
            switch (operation) {
                case 1:
                System.out.println("a+b=");
                System.out.println(a+b);
                break;
                
                case 2:
                System.out.println("a-b=");
                System.out.println(a-b);
                break;
                
                case 3:
                System.out.println("a*b= ");
                System.out.println(a*b);
                break;
                
                case 4:
                System.out.println("a/b= ");
                System.out.println(a/b);
                break;
                
                default:
                System.out.println("invalid operation");
                break;
            }
            
            
        }
    }