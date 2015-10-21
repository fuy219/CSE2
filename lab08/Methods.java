//Fung Yeung
//CSE02
//Lab08
//10-20-2015
import java.lang.reflect.Array;//add array utility
import java.util.Scanner;// add scanner utility
public class Methods{//add class
    public static void main(String[]args){//main method
    	Scanner myScanner=new Scanner(System.in);//initialize scanner
        double array[]= new double[10];//initialize array
        for (int i=0; i<array.length;i++){//for loop to loop through all positions of array
        System.out.print("Enter 10 numbers in order lowest to highest: ");//prompt user to imput 10 numbers
        array[i] =myScanner.nextDouble();//store user input into array
        
        }
        double mean= Mean(array);//using mean method
        double median= Median(array);//using median method
        results(mean,median);//using results method
        }
    
    public static double Mean(double[] a){//mean method
    	double sum=0;//initalize sum variable to store number
    	for (int i=0; i<a.length; i++){//for loop to loop through array
    		sum= sum+a[i];// adding all numbers stored in array
    		
    	}
    	return (sum/10);// returns the mean of array
    }
    public static double Median(double[] a){//median method
    	double sum=0;//initialize sum variable to store n/2 and n/2+1 where n is array length
    	for (int i=4;i<6;i++){// for loop to get n/2 and n/2+1
    	sum= sum+a [i];//stores sum of n/2 and n/2+1
    		 
    	 }
		 return sum/2;// returns median of array

    }
    public static void results(double a, double b){//results method, void print method
    	System.out.println("The mean is= "+a);//print out mean
    	System.out.println("The median is= "+b);//print out the median
    }
    }
