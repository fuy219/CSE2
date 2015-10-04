//Fung Yeung
//CSE02
//10/1/201
//Lab06
//Create a that will give total payroll of employees
//import scanner
import java.util.Scanner;
//add public class
public class timeSheets{
    //add main method
    public static void main(String[]args){
        //initialize variables
        int totalPayRoll=0;
        Scanner myScanner= new Scanner(System.in);//declare scanner instance
        System.out.print("Enter number of employees: ");// prompt user for employee number information
        int employees= myScanner.nextInt();//store number of employees
        //for loop using number of Employees
        for(int numberEmployees= employees; numberEmployees>0; numberEmployees--){
            System.out.print("Enter payrate of employee in cents ex $7.25=725: ");//prompt user to enter payrate in cents
        int payrate= myScanner.nextInt();//stores user imput of payrate
        int hours=0; //initialize hours variable
        //create nestled for loop for 5 days of week
        for(int daysWeek=5; daysWeek>0; daysWeek--){
            System.out.print("Number of hours per day: ");
            int hoursPerDay= myScanner.nextInt();
            hours=hours+hoursPerDay;
        }
        int sep= (hours*payrate);//declare and calculate total pay of a single employee
        totalPayRoll=totalPayRoll+sep;
        }
        System.out.println("Your total payroll is: " +totalPayRoll);
    }
}