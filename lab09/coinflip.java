import java.util.Scanner;// import scanner
public class coinflip{// declare class
	public static int flip(){//add flip method to flip coin
		int flip= (int) (Math.random()+.5);//random generation to flip coin
		return flip;// return the flip value
		
	}
public static void flip(int a){// add flip method (overload) use to flip x number of times
	int heads=0;// count for heads flipped
	int tails=0;// count for tails flipped
	for(int i=0;i<a;i++){//for loop to go through number of flips
		int flip= flip();// calling first flip method
			
		if (flip==0){// if statement for heads flip
			System.out.println("Heads 0");// print out the head flip
			heads++;// count number of times heads was flipped
		}
		if (flip==1){// if statement for tails flip
			System.out.println("Tail 1");// print out the tail flip
			tails++;// count number of times tails was flipped
		}
	}
	System.out.println("Number of heads "+ heads);// print out tails flip
	System.out.println("Number of tails "+ tails);// print out heads flip
	
}
public static void main(String[]args){// add main method
	Scanner myScanner= new Scanner(System.in);//initialize scanner
	System.out.print("Enter number of flips: ");// ask user imput for number of flips
	int numberFlips= myScanner.nextInt();// store number of flips
	if (numberFlips>=0 && numberFlips<=100){// if statement for user input of 0-100 to do coin flip
		flip(numberFlips);
	}
	else{// if statement for user input of invalid number
		System.exit(-1);//exits program
		
}
}
}