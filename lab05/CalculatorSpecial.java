//Fung Yeung
//Lab05
//Cse02
//9/24/15
//create program that uses switch statements to calculate user input
//in addition uses the while loop to keep asking until user inputs N to stop
    import java.util.Scanner;//import command to activate scanner, put outside of class
    public class CalculatorSpecial{//add class
        public static void main(String[] args){
            String answer="";//set string to blank to so it will start while loop
            
            while (!answer.equals("n") && !answer.equals("N")){// add while statement, set to run when not equal to n or N
            Scanner myScanner= new Scanner(System.in);//declare the scanner instance
            System.out.print("Enter first number in form of x.x: ");//ask user for input for first number
            double a= myScanner.nextDouble();//accepts user input for first number
            System.out.print("Enter second number in form of x.x: ");// ask user for input for second number
            double b= myScanner.nextDouble();//accepts user input for second number
            System.out.print("Choose operation: ");//asks user for operation input
            String operation= myScanner.next();//accepts user input operation
            //add switch statement which will loop
            switch (operation) {
                //what will run if user input for operation is +
                case "+":
                    System.out.println("a+b=");
                    System.out.println(a+b);
                    break;
                //what will run if user input for operation is -
                case "-":
                    System.out.println("a-b=");
                    System.out.println(a-b);
                    break;
                //what will run if user input for operation is *
                case "*":
                    System.out.println("a*b=");
                    System.out.println(a*b);
                    break;
                //what will run if user input for operation is /
                case "/":
                    System.out.println("a/b=");
                    System.out.println(a/b);
                    break;
                    
            
            
            }
            //asks user if they wish to continue calculator program
            System.out.print("Type n or N to stop:");
            answer=myScanner.next();//stores user input 
            }
        }
            
        }
    