package VehicleManagementSystem;

class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String make,String model,int year,String fuelType, double fuelEfficiency,double cargoCapacity){
        super(make, model, year, fuelType, fuelEfficiency);
        this.cargoCapacity=cargoCapacity;
    }
    public double calculateFuelEfficiency(){
        return (getFuelEfficiency()*(1.0/(1.0+cargoCapacity))*100.0);
    }
    public double calculateDistanceTraveled(){
        return(getFuelEfficiency()*calculateFuelEfficiency());
    }
    public double calculateMaxSpeed(){
        return 80.0;
    }
}
