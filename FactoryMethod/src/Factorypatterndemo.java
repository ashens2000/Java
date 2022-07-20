public class Factorypatterndemo {

    public static void main(String[] args) {
        vehicleFactory vehicleFactory = new vehicleFactory();

        //get an object of car and call its drive method.
        vehicle car = vehicleFactory.getVehicle("CAR");

        //call drive method of car
        car.drive();

        //get an object of van and call its drive method.
        vehicle van = vehicleFactory.getVehicle("VAN");

        //call drive method of van
        van.drive();

        //get an object of suv and call its drive method.
        vehicle suv = vehicleFactory.getVehicle("SUV");

        //call drive method of suv
        suv.drive();
    }

}
