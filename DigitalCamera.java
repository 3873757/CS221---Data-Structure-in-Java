/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class DigitalCamera {
    private String brand;
    private double price;
    private double pixel;
     
    public DigitalCamera(){
    }
    
     DigitalCamera(String brand,double pixel){
        if(pixel>10){
            this.pixel=10;
        }
        else {
            this.pixel=pixel;
        }
        if(pixel<=6){
        this.price = 99;        
    }
        else{
            this.price=129;
        }
        this.brand=brand;
}

    public double getPixel() {
        return pixel;
    }

    
    public void setPixel(double pixel) {
        this.pixel = pixel;
    }

   
    public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        
        }    
       public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String display(){
        return    brand + " ," + pixel + " ," + price ;
                
    }
            
}
