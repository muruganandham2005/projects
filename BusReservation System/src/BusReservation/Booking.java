package BusReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String PassangerName;
    int BusNum;
    Date date;

    public Booking(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name:");
        PassangerName = in.next();
        System.out.println("Enter BusNumber:");
        BusNum = in.nextInt();
        System.out.println("Enter Date dd-mm-yyyy");
        String dateinput = in.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isAvailable(ArrayList<Booking>Bookings,ArrayList<Bus>buses){
        int capacity = 0;
        for(Bus bus:buses){
            if(bus.getBusnumber() == BusNum){
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for (Booking b : Bookings){
            if(b.BusNum == BusNum&&b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;

    }


}


