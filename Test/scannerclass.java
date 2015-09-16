import java.util.Scanner;   
    public class scannerclass{
        public static void main(String[]args){
            Scanner myScanner= new Scanner( System.in );
            System.out.print("Enter number 1 in form of xx.xx: ");
            double numberOne= myScanner.nextDouble();
            System.out.print("Enter number 2 in form of xx.xx: ");
            double numberTwo= myScanner.nextDouble();
            System.out.print("Enter number 3 in form of xx.xx: ");
            double numberThree= myScanner.nextDouble();
            double average;
            average= (numberOne*numberTwo*numberThree)/3;
            System.out.println("The average of the three numbers is " + average);
        }
    }