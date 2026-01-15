//Inheritance and constructor
//extends is the keyword used for the inheritance

//Single Inheritance
class Vehicle{
    public int year;
    public String ownername;
    public int id;
    
    //Constructor
    public Vehicle(){
        System.out.println("This is a base class");
        year=2022;
        ownername="Aarti";
        id=90012;
    }
    public String setname(){
        ownername="Khushi";
        return ownername;
    }
    public void getname(){
        System.out.println("The name of the owner is:"+ownername);
    }
    public void getid(){
        System.out.println("The id of the vehicle is:"+id);
    }
    public void getyear(){
        System.out.println("The year at which the car bought is:"+year);
    }    
}

class Car extends Vehicle{
    public String brand;
    
    public Car(){
        System.out.println("This is a derived class");
        brand = "Toyota Car";
    }
    
    public void getbrand(){
        System.out.println("The brand of the car is:"+brand);
    }
}
class Main {
    public static void main(String[] args) {    
    Car c = new Car();
    c.setname();
    c.getname();
    c.getid();
    c.getyear();
    c.getbrand();
        
    }

}
