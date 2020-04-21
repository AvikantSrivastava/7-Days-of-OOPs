class Vehicle {
    int id ;
    String model ;
    public Vehicle( String newModel , int newId){
        id = newId ;
        model = newModel ;
    }
   public void printDetails(){
    System.out.println("Vehicle's number is " + id);
    System.out.println("Vehicle's model is " + model);
   }
 }
 
 class Driver {
    private String driverName ;
    Vehicle vehicle ;

    public Driver(String newDriverName , Vehicle newVehicle){
        driverName = newDriverName ;
        vehicle = newVehicle ;
    }

    public void printDetails() {
        System.out.println("Driver's Name is " + driverName) ; 
        // System.out.print("Driver's Car is " + );
        vehicle.printDetails();
    }

 }
 
 class demo {
    public static void main(String args[]) {
         // Write your code here
         Vehicle car1 = new Vehicle("Volvo S60", 4453) ;
         Driver Avikant = new Driver("Avikant Srivastava", car1) ;

         Avikant.printDetails();
    }
}
   
 