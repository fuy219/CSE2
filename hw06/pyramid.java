//Fung Yeung
//CSE02
//Hw 06
//10-4-15
//create a program that asks the user what size pyramid they want(3-6) then use a loop to print print out the pyramid.

import java.util.Scanner;// add scanner utility
//add public class
public class pyramid{
    //add main method
    public static void main(String[]args){
        Scanner myScanner=new Scanner(System.in);//initialize scanner
        System.out.print("What size pyramid do you want: ");//prompt user for pyramid size
        int size=myScanner.nextInt();//store user input for pyramid size
        //start for loop based on user size input
        for(int x=0;x<size;x++){
            //for loop to add spaces based on user size input
            for(int y=size-1;y>x;y-- ){
                System.out.print(" ");
            }
            int z=0;//initialize variable
            //while loop to add * to make pyramid according to user input
            while(z<=x){
                System.out.print("*");
                z++;
            }
            //for loop to make pyramid count by odd numbers to make it "scalable"
        	for(int a=0; a<x; a++){
        	    System.out.print("*");
        	}
        	System.out.println("");//starts new line of pyramid 
        }
    }
}