package plane;

import java.util.ArrayList;
import java.util.List;

public class Plane {
     int flightNumber;
     int time;
     String pointOfArrival;
     List<Passengers> passengerslist = new ArrayList<>();

     public Plane(int flightNumber, int time, String pointOfArrival) {
          this.flightNumber = flightNumber;
          this.time = time;
          this.pointOfArrival = pointOfArrival;
     }

     public void addPassengers(String name, String surname, int seat, String privilege) {
          Passengers passengers = new Passengers(name, surname, seat, privilege);
          passengerslist.add(passengers);
     }

     public void printAllPassengers() {
          for (int i = 0; i < passengerslist.size(); i++) {
               Passengers result = passengerslist.get(i);
               result.printInformation();
          }
     }

     public void infoFirst() {
          System.out.println(flightNumber + " " + time + " " + pointOfArrival);
     }

     public void infoSecond(){
          System.out.println(flightNumber + " " + time + " " + pointOfArrival); }

        public static void main(String[] args) {
               Plane a = new Plane(365, 9, "Berlin");
               a.addPassengers("Ivan", "Gorshkov", 5, "Business");
               a.addPassengers("Svetlana","Alekseeva",10, "Economy");
               a.infoFirst();
               a.printAllPassengers();
             System.out.println();
               Plane b = new Plane(125, 11, "Oslo");
               b.addPassengers("Igor", "Stepanov", 14, "Economy");
               b.addPassengers("Aleksei", "Ivanov", 2, "Business");
               b.infoSecond();
               b.printAllPassengers();
             }
     }

