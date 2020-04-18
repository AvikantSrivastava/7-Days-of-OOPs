// Derived Class
class Car extends Vehicle{ // This line needs to be changed.
  
    public String name; //  Name of a Car
    
    public Car() { // Default Constructor
      name = "";
    }
    
    // This function sets the name of the car
    public void setDetails(String name) { // Setter Function
      this.name = name;
    }
    
    // This function calls the Base class functions and appends the input to the result
    public String getDetails(String carName) { 
      String details = "";
      details = carName +  ", " + super.getModel() + ", " + super.getSpeed() ;    
      return details;
    }
    
  }