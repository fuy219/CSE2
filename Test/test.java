public class test{
    public static void main(String[]args) {
      int counter = 0;

    while (true) {
        System.out.println("Test");
        counter = counter + 2;

         if (counter % 5 == 0) {
             counter--;
         }

         if (counter % 7 == 0) {
             break;
         }
    }
}
} 
        
    
