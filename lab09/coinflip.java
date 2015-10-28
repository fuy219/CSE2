import java.util.Scanner;
public class coinflip{
	public static int flip(){
		int output=0;
		int flip= (int) (Math.random()+.5);
		return flip;
		
	}
public static void flip(int a){
	int heads=0;
	int tails=0;
	for(int i=0;i<a;i++){
		int flip= flip();
			
		if (flip==0){
			System.out.println("Heads 0");
			heads++;
		}
		if (flip==1){
			System.out.println("Tail 1");
			tails++;
		}
	}
	System.out.println("Number of heads "+ heads);
	System.out.println("Number of tails "+ tails);
	
}
public static void main(String[]args){
	Scanner myScanner= new Scanner(System.in);
	System.out.print("Enter number of flips: ");
	int numberFlips= myScanner.nextInt();
	if (numberFlips>=0 && numberFlips<=100){
		flip(numberFlips);
	}
	else{
		System.exit(-1);
		
}
}
}