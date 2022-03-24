package plane;

public class Passengers {
     String name;
     String surname;
     int seat;
     String privilege;

     public Passengers(String name, String surname, int seat, String privilege){
     this.name = name;
     this.surname = surname;
     this.seat = seat;
     this.privilege = privilege;
     }
     public void printInformation(){
          System.out.println(name + " " + surname + " " + seat + " " + privilege);
     }
}
