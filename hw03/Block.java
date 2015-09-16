//Fung Yeung
//9/15/2015
//Hw03
//CSE02
//Create a program that can calculate the volume and surface area of a block
    import java.util.Scanner;// import scanner util
    public class Block{// add class
        public static void main(String[] args){// add main method
            Scanner myScanner= new Scanner(System.in);// declare instance of scanner
            System.out.print("Enter length of the block in form of x.x: ");//prompts user to enter length of block
            double length= myScanner.nextDouble();//accepts user statement for length of block
            System.out.print("Enter width of the block in form of x.x: ");// prompts user to enter width of block
            double width= myScanner.nextDouble();// accepts user statement for width of block
            System.out.print("Enter height of the block in form of x.x: ");//prompts user to enter height of block
            double height= myScanner.nextDouble();//accepts user statement for height of block
            double volume= length*width*height;// calculations for volume
            System.out.println("The volume of the block of dimensions "+length+ " x " +width+ " x " +height+ " is " +volume);
            double side1= length*height*2;
            double side2=width*height*2;
            double side3=length*width*2;
            double surfacearea= side1+side2+side3;
            System.out.println("The surface area of the block is "+surfacearea);
        }
    }