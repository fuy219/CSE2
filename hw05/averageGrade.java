//Fung Yeung
//CSE 02
//Hw05
// 10/1/2015
// create a program that asks and stores grades that are between and including 0 and 100. 
//When number 999 is typed in proceed to calculate the average of all those grades.
//import scanner tool
import java.util.Scanner; 
//add class
public class averageGrade{
    //add the main method
    public static void main(String[]args){
        double totalGrade=0;
        int count=0;
        //start while loop
        while(true){

        Scanner myScanner= new Scanner(System.in);//declare scanner instance
        System.out.print("Enter grade: ");//ask user imput for grade
        int grade= myScanner.nextInt();
        if(grade>=0 && grade<=100){
            totalGrade=totalGrade+grade;
            count++;
        
        }
        else if(grade==999){
        double average=totalGrade/count;
        System.out.println("Your average grade is: " +average);
        break;
        }
        else{
            System.out.println("Your grade is invalid");
        
        }
        }
    }
}