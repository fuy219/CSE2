//Fung Yeung
//Lab 03
//9/10/2015
//CSE 02
//Create a program that utilizes the scanner class
//the program will determine amount each person in the group will have to pay
//first given the check amount, sales tax, and how many ways the check will be split
    //import command outside of class
    import java.util.Scanner;
    //add class
    public class Check{
        //add main method
        public static void main(String[] args){
            
            Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
            System.out.print("Enter the original cost of the check in the form xx.xx: "); // promt user input for check cost
            double checkcost = myScanner.nextDouble(); //accept user statement for check cost
            //user input for the tip percentage
            System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form of xx): ");
            double tipPercent = myScanner.nextDouble();//accept user statement for tip
            tipPercent /= 100; //convert the tip into a decimal
            System.out.print("Enter the number of people who went out to dinner: "); // prompt user for # of people
            int numPeople = myScanner.nextInt(); //accepts user statement for # of people
            //Variables needed
            double totalCost; //totalcost variable
            double costPerPerson; //how much one needs to pay variable
            int dollars, //dollar portion of cost
            dimes, pennies; //storing digits past decimal on right for the cost
            totalCost = checkcost* (1 + tipPercent);
            costPerPerson = totalCost/ numPeople;
            //gets whole amount, drops decimal fraction using casting (int)
            dollars= (int)costPerPerson;
            //get cents amount-dimes
            //rounds the amount
            //returns remainder taken by %(mod) operator after division
            dimes= (int) (costPerPerson * 10) % 10;
            pennies= (int)(costPerPerson * 100) % 10;
            //output the results to user
            System.out.println("Each person in the group owes $" + 
            dollars + '.' + dimes + pennies);
            
            
            
        }
    }