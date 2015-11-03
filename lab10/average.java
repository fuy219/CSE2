//Fung Yeung
//CSE02
//lab 10
// 11-2-2015
// create a lab that creates random numbered arrays and manipulates them
import java.lang.reflect.Array;//add array utility
import java.util.Scanner;// import scanner utility
public class average{// add class
	public static void main(String[]args){// add main method
		Scanner myScanner= new Scanner(System.in);//initalize scanner
		System.out.print("Enter length of Array: ");//ask user input for scanner length
		int length=myScanner.nextInt();//store user input for length
		double array[]= new double[length];//initalize new array
		double total=0;//initalize variable for total
		for (int i=0;i<length;i++){//create for loop to add random numbers into array
			array[i]= (int) (Math.random()*100);//add numbers to array
		}
		for (int i=0;i<length;i++){// create for loop to print out each number
			System.out.println(array[i]);//print out each number
		}
		for (int i=0;i<length;i++){//create for loop to find average
			total= total + array[i];//equation to find total number
		}
		double average= total/length;//equation to find average
		System.out.println("The average is: "+average);//prints out average
		for (int i=0;i<length;i++){//create for loop to print out all numbers greater than or equal to average
			if (array[i]>=average){// if statement to check if number if greater than or equal to average
				System.out.println(array[i]);// prints out those numbers
			}
		}
	}
}