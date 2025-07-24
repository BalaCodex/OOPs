package busRev;

public class Bus {
   private int busNo;
    private boolean ac;
    private int capacity;
    private String destination;
    private int departureTime;
    Bus(int busNo,boolean ac,int capacity,String destination,int departureTime){
        this.busNo=busNo;
        this.ac=ac;
        this.destination=destination;
        this.departureTime=departureTime;
        this.capacity=capacity;
    }
    public String getDestination(){
       return destination;
    }
    public int getDepartureTime(){
        return departureTime;
    }
    public void setDestination(String destination){
        this.destination=destination;
    }
    public void setDepartureTime(int departureTime){
        this.departureTime=departureTime;
    }
    public int getBusNo(){
        return busNo;
    }
    public void setBusNo(int busNo){
        this.busNo=busNo;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public boolean isAc(){
        return ac;
    }
    public void setAc(boolean ac){
        this.ac=ac;
    }
    public void displayBusInfo(){
        System.out.println("Bus No:" +busNo+" AC: "+ac+" Total Capacity "+capacity+" Destination: "+destination+" DepartureTime: "+departureTime);
    }

}
