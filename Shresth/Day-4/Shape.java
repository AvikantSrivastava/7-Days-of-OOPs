class Shape {
    private String name;
    public Shape()
    {
        name = "Shape";
    }
    public String getName()
    {
        return this.name;
    }
}

class shapeless extends Shape
{
    private String name;
    public shapeless(String name)
    {
        this.name = name;
    }
    //overridden method
    public String getName()
    {
        return super.getName() + "," + this.name;
    }
    public static void main(String args[])
    {
        shapeless sape = new shapeless("Square");
        System.out.println(sape.getName());
    }
}
