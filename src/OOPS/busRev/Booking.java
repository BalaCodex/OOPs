package OOPS.busRev;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
public class Booking {
    String passengerName;
    int busNo;
    Date date;
    String destination;
    int departureTime;
    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your good name: ");
        passengerName= sc.next();
        System.out.println("Enter the Bus no: ");
        busNo=sc.nextInt();
        System.out.println("Enter the date in dd-mm-yyyy");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Enter the Destination: ");
        destination=sc.next();

    }
    public static void destinationInfo(String city,ArrayList<Bus> buses){
       for(Bus b:buses){
            if(Objects.equals(city, b.getDestination())){
               b.displayBusInfo();
            }
        }
    }

    public boolean isAvailable(ArrayList<Booking> book ,ArrayList<Bus> buses){
        int capacity=0;
        for (Bus b:buses){
            if(b.getBusNo()==busNo){
                capacity= b.getCapacity();
            }
        }
        int booked=0;
        for(Booking b:book){
            if(b.busNo==busNo&& b.date.equals(date)){
                booked++;
            }
        }
        return booked < capacity;
    }


}
