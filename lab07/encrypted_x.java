//Fung Yeung
//CSE 02
//Lab 07
//10-8-2015
//Create a program that uses loops to hide a secret message x
//import scanner
import java.util.Scanner;
//add public class
public class encrypted_x{
    //add main method
    public static void main(String[]args){
        Scanner myScanner= new Scanner(System.in);//initialize scanner
        System.out.print("Enter an integer 0-100: ");//ask user for integer
        int stars=myScanner.nextInt();//stores user input for integer
        int k=0;//intilize variable for later
        int l=stars-1;//initialize variable for later
        if (stars>=0 && stars<=100){// if statement to start loop if conditions met
        for  (int i=0; i<stars; i++){//for loop start # of rows
            for (int j=0; j<stars; j++){// for loop start number of symbols per row
                int h=j;//initialize variable
            if (h==k){// if statement for " "
                System.out.print(" ");//prints out " "
            }
            else if (h==l){// second if statement for " "
                System.out.print(" ");//prints out " "
            }
            else if (h==k && h==l){//third else if statement for " "
                System.out.print("");//prints out " "
            }
            else if (h!=k && h!=l){// what to print out if nothing else matched
                System.out.print("*");// prints out *
            }
            }
            System.out.println("");  //starts next row
            k++;//counts number of times it has looped
            l--;// similar to above counter but backwards
        }
        }
        
    else{//if user input is outside of 0-100 then it goes to this statement
            System.exit(-1);//exits the program due to error
        }
    }
}
    
    

    
