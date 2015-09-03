//Fung Yeung
//Lab02
//9/3/2015
//CSE 002
//Create a program that can print number of minutes trip
//Print number of counts per trip
//Print distance in miles for each trip
//Priint distance for both trips combined
    //Class required for Java
    public class Cyclometer{
        //Main method for program
        public static void main(String[] args) {
            int secsTrip1=480;  //how many seconds first trip was
            int secsTrip2=3220; // how many seconds the second trip was
            int countsTrip1=1561; // how many counts the first trip was
            int countsTrip2=9037; // how many counts the second trip was 
            double wheelDiameter=27.0, //a constant, diamter of wheel
            PI=3.14159, // a constant, what pi is equal to
            feetPermile=5280, //a conversion, how many feet in a mile
            inchesPerFoot=12, //a conversion, how many inches in a foot
            secondsPerMinute=60; //a conversion, how many seconds in a minute
            double distanceTrip1,distanceTrip2,totalDistance; //establishing distance for trip with double
            System.out.println("Trip1 took "+
            (secsTrip1/secondsPerMinute) +" minutes and had "+ 
            countsTrip1+" counts.");
            System.out.println("Trip 2 took"+
            ( secsTrip2/secondsPerMinute) +"minutes and had "+
            countsTrip2+" counts. ");
            //run calculations and store values
            //Calculating for distance of trip 1
            distanceTrip1=countsTrip1* wheelDiameter* PI;
            //distance is given in iches
            //each count is a rotation of the wheel travels
            //diameter in inches times pi
            distanceTrip1/=inchesPerFoot * feetPermile; //converts distance to miles
            // calculate distance for trip and convert to miles
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/ feetPermile ;
            totalDistance=distanceTrip1+ distanceTrip2;
            //print the output data
            System.out.println("Trip 1 was "+distanceTrip1 +" miles") ;
            System.out.println("Trip 2 was "+distanceTrip2 +" miles") ;
            System.out.println("The total distance was "+ totalDistance +" miles");
            
            
    }   //end of method
}   //end of class