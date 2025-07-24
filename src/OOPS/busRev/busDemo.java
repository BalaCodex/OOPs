package OOPS.busRev;

import java.util.ArrayList;
import java.util.Scanner;

import static OOPS.busRev.Booking.destinationInfo;

public class busDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> Bookings = new ArrayList<>();
        buses.add(new Bus(1,true,1,"Tirunelveli",7));
        buses.add(new Bus(2,false,3,"Tiruchirappalli",15));
        buses.add(new Bus(3,true,3,"Madurai",19));
        buses.add(new Bus(4,true,3,"Madurai",19));

        Scanner scan =new Scanner(System.in);
        int userOption=1;
        while (userOption==1){
            System.out.println("->Enter 1 to booking\n->Enter 2 to View Bus Info");
            userOption=scan.nextInt();

                switch (userOption){
                    case 1:
                        Booking booking = new Booking();
                        if(booking.isAvailable(Bookings,buses)){
                            Bookings.add(booking);
                            System.out.println("CONFIRMED<-3");
                        }else {
                            System.out.println("SORRY THE SLOTS ARE FULL");
                        }
                        break;
                    case 2:
                        for (Bus b:buses){
                            b.displayBusInfo();
                        }

                        System.out.println("Enter the destination from above cities: ");
                        String city = scan.next();
                        destinationInfo(city,buses);
                        break;
                    case 3:
                        for (Bus b:buses){
                            System.out.println(b.getDestination());
                        }
                    default:
                        System.out.println("Run the Program for Booking");
                }


        }
    }
}
