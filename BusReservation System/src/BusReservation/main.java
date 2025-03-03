package BusReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> Bookings = new ArrayList<Booking>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,60));
        buses.add(new Bus(3,true,90));
        buses.add(new Bus(4,false,50));

        int UserOpt = 1;
        Scanner in = new Scanner(System.in);
        for (Bus b :buses){
            b.DispayBusInfo();
        }
        while (UserOpt==1){
            System.out.println("Enter 1 For Booking And 2 For Exit");
            UserOpt = in.nextInt();
            if (UserOpt==1){
                Booking booking = new Booking();
                if(booking.isAvailable(Bookings,buses)){
                    Bookings.add(booking);
                    System.out.println("Your Booking Is Confirmed.Thank you!");
                }
                else {
                    System.out.println("Sorry Bus Is Full.Try Another Bus or Date.");
                }

            }

        }
    }
}
