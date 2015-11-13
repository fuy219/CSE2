import java.util.Scanner;//import Scanner
public class MineSweeper{//add public class
	public static void main(String[]args){//add main method
		Scanner myScanner= new Scanner(System.in);//initialize scanner
		System.out.println("Enter Size of your board (2-30)");//ask user input to board size
		int n= myScanner.nextInt();//stores user input for board size
		if(n<2 || n>30){// if statement to make sure user input is within range
			System.exit(-1);//exits if user input for size is not in range
		}
		System.out.println("Enter number of mines (1-BoardSize^2)");//asks for number of mines
		int m=myScanner.nextInt();//stores user input for number of mines
		if(n<1 || n> n*n){//if statement to check if number of mines is within range
			System.exit(-1);//exits program if not in range
		}
		int[][] array= new int[n][n];//initialize array
		
		for(int j=0;j<m;j++){//for loop to randomly place mines
			int x= (int)(Math.random()*n);//get random x coordinate
			int y= (int)(Math.random()*n);//get random y coordinate
			if (array[x][y] !=9){//if statement to check if array[x][y] is equal to 9
				array[x][y]=9;//if not set it equal to 9
			}
			else if (array[x][y]==9){// if statement for when array[x][y] is equal to 9
				int test=0;//initialize test to equal 0
				while(test==0){//while loop to place mine if array[x][y] is already 9
					int testx=(int)(Math.random()*n);//new x coordinate
					int testy=(int)(Math.random()*n);// new y coordinate
					if (array[testx][testy]!=9){// if statement for when new array[x][y] is not9
						array[testx][testy]=9;//sets the array[x][y] to 9
						test=1;// ends loop
					}
					else if (array[testx][testy]==9){//if new array[x][y] still is 9 restarts loop
						test=0;// restart while loop
					}

				}
			}
		}
		for (int a=0;a<array.length;a++){// for loop to add numbers near mines
			for (int b=0;b<array.length;b++){//for loop to add numbers near mines
			if(array[a][b]>=9){//check is array[a][b]>=9 meanings a mine
					if (b-1>=0){//check to see if it will go out of bounds
					array[a][b-1]++;//increments above mine
					}
					if (b+1<n){//check to see if it will go out of bounds
					array[a][b+1]++;//increment below mine
					}
					if (a-1>=0){//check to see if it will go out of bounds
					array[a-1][b]++;//increment to the left of mine
					}
					if (a-1>=0 && b+1<n){//check to see if it will go out of bounds
					array[a-1][b+1]++;//increment to the left bottom corner
					}
					if (a-1>=0&&b-1>=0){//check to see if it will go out of bounds
					array[a-1][b-1]++;//increment to the left top corner
					}
					if (a+1<n){//check to see if it will go out of bounds
					array[a+1][b]++;//increment to right of mine
					}
					if(a+1<n && b+1<n){//check to see if it will go out of bounds
					array[a+1][b+1]++;//increment to the right bottom corner
					}
					if (a+1<n && b-1>=0){//check to see if it will go out of bounds
					array[a+1][b-1]++;//increment to the right top corner
					}
				}
			}
		}
		
		for (int c=0;c<array.length;c++){//for loop to print out board
			for (int d= 0; d<array.length;d++){//for loop to print out board
				if (array[c][d]>=9){// if statement to check if greater than or equal to 9
					System.out.print("m"+" ");// if >=9 print out m and a space
				}
				else if (array[c][d]!=9){// if it is not greater than or equal to 9
				System.out.print(array[c][d]+" ");//print out number at location
				}
			}
				System.out.println("");//print out "" to start next line
		}
	}
}