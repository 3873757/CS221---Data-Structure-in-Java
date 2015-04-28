
public class TestDriveDigitalCamera {
    public static void main(String[] args) {
        DigitalCamera dc = new DigitalCamera("Canon", 12);
        DigitalCamera dc1 = new DigitalCamera("Fujifielm", 8.4);
        DigitalCamera dc2 = new DigitalCamera("Samsung", 12.9);
        DigitalCamera dc3 = new DigitalCamera("Nikon", 5.3);
        System.out.println(dc1.display());
        System.out.println(dc2.display());
        System.out.println(dc3.display());
        System.out.println(dc.display());      
/*
 **************************OUTPUT****************
 *******  Fujifielm ,8.4 ,129.0   ***********
 * ** *** Samsung ,10.0 ,129.0    **********
 ** *****  Nikon ,5.3 ,99.0       *********
  *******  Canon ,10.0 ,129.0     *********
 ***************************************
  */  
        
}
}