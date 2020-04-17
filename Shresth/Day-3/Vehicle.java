class Vehicle {
    private String speed;
    private String model;

    public Vehicle()
    {
        speed = "100";
        model = "Tesla";
    }
    public String getModel()
    {
        return model;
    }
    public String getSpeed()
    {
        return speed;
    }
}
class Car extends Vehicle{
    public String name;
    public Car()
    {
        name = "";
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDetails(String name)
    {
        String details = name + "," + getModel() + "," + getSpeed();
        return details;
    }
    public static void main(String args[]) {
        Car car = new Car();
        System.out.println(car.getDetails("Musk"));
    }
}