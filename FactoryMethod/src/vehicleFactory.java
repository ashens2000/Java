public class vehicleFactory
{
    public vehicle getVehicle(String vehicleType){
        if(vehicleType == null){
            return null;
        }
        if(vehicleType.equalsIgnoreCase("CAR")){
            return new car();

        } else if(vehicleType.equalsIgnoreCase("VAN")){
            return new van();

        } else if(vehicleType.equalsIgnoreCase("SUV")){
            return new suv();
        }

        return null;
    }
}
