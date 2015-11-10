import java.lang.reflect.Array;//import java utility
public class sorting{//add class
	public static void sort(int a[]){//add sorting method
		int temp;//initalize variable to swap
		for(int i=0; i<a.length; i++){//start for loop for bubble sort
			for(int j=0;j<(a.length)-1;j++){//another for loop to sort array
				if(a[j]>a[j+1]){//if statement to switch
					temp=a[j];//sets temp equal to whatever array[j] is
					a[j]=a[j+1];//swaps array[j] and array[j+1]
					a[j+1]=temp;//changes temp to a[j+1]
				}
		}
		}
		}
	
	public static void main(String[]args){//adds main method
		int array1[]= new int[10];//initialize array with size 10
		int array2[]= new int[20];//initalize array with size 20
		int array3[]= new int[30];//initalize array with size 30
		for (int i=0;i<10; i++){//for loop to allocate numbers into array1
			array1[i]= (int)(Math.random()*101);//assigns a random number for that array position
		}
		for (int j=0;j<20;j++){//for loop to allocate number into array2
			array2[j]=(int)(Math.random()*101);//assigns a random number for that array position
		}
		for(int k=0;k<30;k++){// for loop to allocate number into array3
			if(k<=9){//if statement that is used when k is less than or equal 9
			array3[k]=array1[k];//sets array3[k] to array1[k]
			}
			else if (k>9){//if statement that is used if k is greater than 9
			array3[k]=array2[k-10];//sets array[k] to the number at array2[k-10]
			}
		}
		sort(array3);//sorts array3 from least to greatest
		for (int k=0;k<30;k++){//for loop to print out each number in array3
			System.out.println(array3[k]);//prints out number in array3 at position k
		}
	}
}

