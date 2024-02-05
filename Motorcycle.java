package VehicleManagementSystem;

public class Motorcycle extends Vehicle {
    private double cubicCapacity;
    public Motorcycle(String make,String model,int year,String fuelType, double fuelEfficiency,double cubicCapacity){
        super(make, model, year, fuelType, fuelEfficiency);
        this.cubicCapacity=cubicCapacity;
    }
    public double calculateFuelEfficiency(){
        return (getFuelEfficiency()*(1.0/(1.0+cubicCapacity))*100.0);
    }
    public double calculateDistanceTraveled(){
        return(getFuelEfficiency()*calculateFuelEfficiency());
    }
    public double calculateMaxSpeed(){
        return 150.0;
    }
}
