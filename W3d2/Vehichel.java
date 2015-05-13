
import java.util.Comparator;

 class Vehichel  {
    private String Vehiclename;

    public String getVehiclename() {
        return Vehiclename;
    }

    public void setVehiclename(String Vehiclename) {
        this.Vehiclename = Vehiclename;
    }

    public double getVehicleprice() {
        return Vehicleprice;
    }

    public void setVehicleprice(double Vehicleprice) {
        this.Vehicleprice = Vehicleprice;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }
    private double Vehicleprice;
    private String  Model;
    
    public Vehichel(String Vehiclename,double Vehicleprice,String  Model){
        this.Model=Model;
        this.Vehiclename=Vehiclename;
        this.Vehicleprice=Vehicleprice;
        }    
}
class MypriceComp implements Comparator<Vehichel> {

    @Override
    public int compare(Vehichel t, Vehichel t1) {
        if (t.getVehicleprice() > t1.getVehicleprice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
class MyModelComp implements Comparator<Vehichel> {

    @Override
    public int compare(Vehichel t, Vehichel t1) {
        return t.getModel().compareTo(t1.getModel());
    }
}
class myNameComp implements Comparator<Vehichel>
{

    @Override
    public int compare(Vehichel t, Vehichel t1) {
        return t.getVehiclename().compareTo(t1.getVehiclename());
    }
}
