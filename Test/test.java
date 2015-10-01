import java.util.Scanner;
public class number{

public static void main(String[] args){

boolean answer=true;

while(answer=true){

Scanner myScanner=new Scanner(System.in);

System.out.print("Select number: ");

int a= myScanner.nextInt();

int b = a%5;

if(b==0){

answer=false;

}

}

}
}
        
    

        
    
