class Vehicle {
  
    // Complete this implementation
     int id;
     String model;
    
    public Vehicle(String model, int id) { // Setter Function
       this.model = model;
       this.id=id;
   }
   
 }
 
 class Driver {
   
    // Complete this implementation
    String driverName;
    Vehicle vehicle;
    
    public Driver(String name, Vehicle v) { // Setter Function
       this.driverName = name;
       vehicle=v;
   }
   
 }
 
 class Main {
   
    public static void main(String args[]) {
       Vehicle vehicle = new Vehicle("Volvo S60", 4453); 
       // Creating a Driver object having name: "John" and passing the 
       // vehicle in its constructor
         Driver driver = new Driver("John", vehicle);
         System.out.println(driver.driverName + 
                          " is a driver of car Id: " + driver.vehicle.id);
 
         // Write your code here
    }
   
 }