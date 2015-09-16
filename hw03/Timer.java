//9/15/2015
//Fung Yeung
//Hw03
//CSE02
//create a program to calculte amount of time until dinner
    //import java scanner
    import java.util.Scanner;
    //add class
    public class Timer{
        //add main method
        public static void main(String[] args){
            
            Scanner myScanner= new Scanner(System.in);//declare scanner instance
            System.out.print("Enter current time in the form of xxxx: "); //prompt user for current time input
            int currentTime = myScanner.nextInt(); // accept user input for current time
            System.out.print("Enter time you will be eating diner in form of xxxx: ");//prompt user for dinner time input
            int dinnerTime = myScanner.nextInt();// accept user input for dinner time
            int convertcth= (int)(currentTime/100)*60;//current time hours into minutes
            float convertctm = ((float)currentTime/100-(int)currentTime/100)*100;// given minutes calculation
            int convertct= convertcth+(int)Math.round(convertctm);//current time into minutes
            int convertdth= (int)(dinnerTime/100)*60;// dinner time hours into minutes
            float convertdtm= ((float)dinnerTime/100-(int)dinnerTime/100)*100;// diner time minutes calucation
            int convertdt=convertdth+(int)Math.round(convertdtm);// diner time into minute
            int totalTimeinmin= convertdt-convertct;// total time in minutes before dinner
            int hours=(int)totalTimeinmin/60;// contains hours 
            int minutes=totalTimeinmin%60;// contains minutes
            System.out.println("You have " +hours+ " hours and " +(int)minutes+ " minutes before dinner");// sentence telling you how much time before dinner
            
        }
            
    }