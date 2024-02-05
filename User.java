package VehicleManagementSystem;

public class User {
    public static void main(String[] args){
        Truck trk = new Truck("Tata", "407", 2018, "Diesel", 8.112, 4.5);
        Car car = new Car("Mahindra", "Xylo", 2022, "Diesel", 6.123, 8);
        Motorcycle bike = new Motorcycle("Bajaj", "Pulsar 180", 2015, "Gasoline", 7.786, 180);
 
        System.out.println("Truck - "+trk.getMake()+" "+trk.getModel()+" , "+trk.getYear()+"\n Fuel Type : "+trk.getFuelType()+" with Fuel Efficiency of "+trk.calculateFuelEfficiency()+"% \n Distance Travelled : "+trk.calculateDistanceTraveled()+" kms \n Max. Speed : "+trk.calculateMaxSpeed()+" MPh \n");
        System.out.println("Car - "+car.getMake()+" "+car.getModel()+" , "+  car.getYear()+"\n Fuel Type : "+car.getFuelType()+" with Fuel Efficiency of "+car.calculateFuelEfficiency()+"% \n Distance Travelled : "+car.calculateDistanceTraveled()+" kms \n Max. Speed : "+car.calculateMaxSpeed()+" MPh \n");
        System.out.println("Motorcycle - "+bike.getMake()+" "+bike.getModel()+" , "+bike.getYear()+"\n Fuel Type : "+bike.getFuelType()+" with Fuel Efficiency of "+bike.calculateFuelEfficiency()+"% \n Distance Travelled : "+bike.calculateDistanceTraveled()+" kms \n Max. Speed : "+bike.calculateMaxSpeed()+" MPh \n");
 
     }
}
