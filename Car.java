package VehicleManagementSystem;

public class Car extends Vehicle{
    private int seatCapacity;
    public Car(String make,String model,int year,String fuelType, double fuelEfficiency, int seatCapacity){
        super(make,model,year,fuelType,fuelEfficiency);
        this.seatCapacity=seatCapacity;
    }
    public double calculateFuelEfficiency(){
        return (getFuelEfficiency()*(1.0/(1.0+seatCapacity))*5.0);
    }
    public double calculateDistanceTraveled(){
        return(getFuelEfficiency()*calculateFuelEfficiency());
    }
    public double calculateMaxSpeed(){
        return 120.0;
    }
}
