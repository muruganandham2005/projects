package BusReservation;

public class Bus {
    private int Busnumber;
    private boolean AC;
    private  int Capacity;

    Bus(int BusNo,boolean AC,int Cap){
        this.Busnumber = BusNo;
        this.AC = AC;
        this.Capacity = Cap;

    }
    public int getCapacity(){
        return Capacity;
    }
    public void setCapacity(int Cap){
        Capacity = Cap;
    }
    public  int getBusnumber(){
        return Busnumber;
    }
    public void setBusnumber(int BusNumset){
        Busnumber = BusNumset;
    }
    public void DispayBusInfo(){
        System.out.println("Bus Number: "+Busnumber + " AC: " + AC + " TotalCapacity: " + Capacity );
    }



}
