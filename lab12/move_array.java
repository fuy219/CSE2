//Fung Yeung
// CSE02
//Lab 10
//11-17-15
//create a program that moves a given position of an array to the back of the array
//while shifting all numbers down by 1
import java.util.Scanner;//import scanner utility
public class move_array{//add public class
	public static void main(String[]args){//add main method
		Scanner myScanner=new Scanner(System.in);//initialize scanner
		System.out.print("Enter size of array");//prompt user input for array size
		int n=0;//initialize size variable
		int[] array=null;//initalize array
		try{// start try catch statement
			n=myScanner.nextInt();//set n to user input for size
			array=new int[n-1];//make zero and all numbers less errors
			
		}catch (Exception a){//catch errors
				System.out.println("Bad Number! Please try again.");//return this when given an error
			System.exit(0);// exits program
		}
		array=new int[n];//set array constraints to n
		for(int i=0;i<array.length;i++){//for loop to put values in array
			array[i]=(int)(Math.random() *101);//random values from 0-100 to put in array
		}
		
		try{//start try catch statement
		System.out.print("Enter index number");//prompt user input for index number
		int index=myScanner.nextInt();//stores user input for index number
		int b =array[index];//set variable b in array position of index
		for(int i=index;i<n-1;i++){//for loop to switch array[index] position
			array[i]=array[i+1];//switch array[i] and number to the right of it
		}
		array[n-1]=b;//switch index number with last number in array
		}catch(ArrayIndexOutOfBoundsException b){//catch array index that are negative
		
				System.out.println("Index is out of range, array is unchanged");//prints out this statement if error is found
			}
		
		
		
		for (int k=0;k<array.length;k++){//for loop to loop through array
			System.out.println(array[k]);//print out array
		}
		}
	}
