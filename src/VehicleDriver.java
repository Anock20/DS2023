import java.util.ArrayList;
import java.util.List;


public class VehicleDriver implements Driver {
    public String name;
    addVehicle vehicle_list = new addVehicle();
    public VehicleDriver(String name){
        setName(name);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void addVehicle(Vehicle vehicle){
        vehicle_list.add(vehicle);
    }
    public void printVehicle() {
        System.out.println(getName());
        System.out.println(vehicle_list);
    }
    private class addVehicle{
        List list = new ArrayList();
        void add(Vehicle vehicle) {
            list.add(vehicle);
        }
        public String toString() {
            return list.toString();
        }
    }
}
