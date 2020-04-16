public class Constructor_car {
    private String carName;
    private String carModel;
    private String carCapacity;

    // Default Constructor
    public Constructor_car() {
        this.carName = "";
        this.carModel = "";
        this.carCapacity = "";
    }

    // Parameterized Constructor 1
    public Constructor_car(String name, String model) {
        this.carName = name;
        this.carModel = model;
    }

    // Parameterized Constructor 2
    public Constructor_car(String name, String model, String capacity) {
        this(name, model); // calling parameterized Constructor
        this.carCapacity = capacity; // Assigning capacity
    }

    // Method to return car details
    public String getDetails() {
        return this.carName + ", " + this.carModel + ", " + this.carCapacity;
    }

}
class Demo1 {

    public static void main(String args[]) {
        Constructor_car car = new Constructor_car("Ferrari", "F8", "100");
        System.out.println(car.getDetails());
    }
}
