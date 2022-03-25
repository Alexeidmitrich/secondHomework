package plane;

import java.util.ArrayList;
import java.util.List;

public class Plane {
     int flightNumber;
     int time;
     String pointOfArrival;
     List<Passenger> passengerlist = new ArrayList<>();

     public Plane(int flightNumber, int time, String pointOfArrival) {
          this.flightNumber = flightNumber;
          this.time = time;
          this.pointOfArrival = pointOfArrival;
     }

     public void addPassenger(String name, String surname, int seat, String privilege) {
          Passenger passenger = new Passenger(name, surname, seat, privilege);
          passengerlist.add(passenger);
     }

     public void printAllPassenger() {
          for (int i = 0; i < passengerlist.size(); i++) {
               Passenger result = passengerlist.get(i);
               result.printInformation();
          }
     }

     public void infoFirst() {
           System.out.println(flightNumber + " " + time + " " + pointOfArrival);
     }

     public void infoSecond(){
           System.out.println(flightNumber + " " + time + " " + pointOfArrival);
     }

     public static void main(String[] args) {
           Plane a = new Plane(365, 9, "Berlin");
           a.addPassenger("Ivan", "Gorshkov", 5, "Business");
           a.addPassenger("Svetlana","Alekseeva",10, "Economy");
           a.infoFirst();
           a.printAllPassenger();
           System.out.println();
           Plane b = new Plane(125, 11, "Oslo");
           b.addPassenger("Igor", "Stepanov", 14, "Economy");
           b.addPassenger("Aleksei", "Ivanov", 2, "Business");
           b.infoSecond();
           b.printAllPassenger();
     }
}

