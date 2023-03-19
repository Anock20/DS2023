public class Main {
    public static void main(String[] args){
        Vehicle b1 = new Bus("bus", "gray");
        Vehicle c1 = new Car("car","orange");
        Driver d1 = new VehicleDriver("이성준");
        d1.addVehicle(b1);
        d1.addVehicle(c1);
        d1.printVehicle();
    }
}
