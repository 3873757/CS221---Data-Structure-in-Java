
import java.util.TreeSet;

public class VehichelImp {

    public static void main(String[] args) {
        TreeSet<Vehichel> priceComp = new TreeSet<Vehichel>(new MypriceComp());
        priceComp.add(new Vehichel("BMW", 3425, "MSX"));
        priceComp.add(new Vehichel("RAngeRover", 34256, "ASx"));
        priceComp.add(new Vehichel("Toyota", 2345, "Camry"));
        priceComp.add(new Vehichel("Ford", 2354, "Mustung"));
        for (Vehichel Veh : priceComp) {
            System.out.println(Veh.getVehicleprice());
        }
        TreeSet<Vehichel> ModComp = new TreeSet<Vehichel>(new MyModelComp());
        ModComp.add(new Vehichel("BMW", 3425, "MSX"));
        ModComp.add(new Vehichel("RAngeRover", 34256, "ASx"));
        ModComp.add(new Vehichel("Toyota", 2345, "Camry"));
        ModComp.add(new Vehichel("Ford", 2354, "Mustung"));
        System.out.println("************************************");
        for (Vehichel Veh1 : ModComp) {
            System.out.println(Veh1.getModel());
        }

        TreeSet<Vehichel> NameComp = new TreeSet<Vehichel>(new myNameComp());
        NameComp.add(new Vehichel("BMW", 3425, "MSX"));
        NameComp.add(new Vehichel("RAngeRover", 34256, "ASx"));
        NameComp.add(new Vehichel("Toyota", 2345, "Camry"));
        NameComp.add(new Vehichel("Ford", 2354, "Mustung"));
        System.out.println("************************************");
        for (Vehichel Veh2 : NameComp) {
            System.out.println(Veh2.getVehiclename());
        }

    }
}
/****2345.0
*****2354.0
*****3425.0
*****34256.0
************************************
*****ASx
*****Camry
*****MSX
*****Mustung
************************************
*****BMW
*****Ford
*****RAngeRover
*****Toyota
 
 */