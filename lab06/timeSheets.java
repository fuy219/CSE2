//Fung Yeung
//CSE 02
//October 1, 2015
//lab 06
// create a program that will give total payroll of employee 
//import scanner command 
import java.util.Scanner;
//add class
public class timeSheets{
    //add main method
    public static void main(String[] args){
        Scanner myScanner= new Scanner(System.in);// declare scanner instance
        System.out.print("Enter number of employees: ");// prompt user for number of employees
        int employees= myScanner.nextInt();//stores user input for number of employees
            double pay=0.0;
            int hours=0;
        for(int numberEmployees=employees;numberEmployees>0; numberEmployees--){//start loop for salary
            System.out.print("Enter pay for employee in cents per hour: ");
            double employeePay= myScanner.nextDouble();
            pay=pay+employeePay;
            System.out.println(pay);
            
            for(int dayWeek=5;dayWeek>0;dayWeek--){
                System.out.print("Number of hours per day: ");
                int hourPerDay=myScanner.nextInt();
                hours=hours+hourPerDay;
                
            }

    }
                double totalpay=0.0;
        totalpay=totalpay+(hours*pay);
    System.out.println("Your total payroll is: " +totalpay);
}
}