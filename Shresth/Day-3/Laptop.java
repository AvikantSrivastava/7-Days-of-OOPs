class Laptop {
    private String name;

    //Default Constructor
    public Laptop()
    {
        name = " ";
    }
    public Laptop(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
class HP extends Laptop{
    //Default Constructor
    public HP(){

    }
    //Parameterized Constructor
    public HP(String name)
    {
        super(name);
    }
    public String getDetails(){
        return getName();
    }
    public static void main(String args[]){
        HP hp = new HP("HP Omen");
        System.out.println(hp.getDetails());
    }


}
