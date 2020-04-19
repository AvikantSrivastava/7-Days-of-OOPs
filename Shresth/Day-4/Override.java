class Override {
    private double area;

    public Override(){
        area = 0;
    }
    public double getArea(){
        return area;
    }
}

class circle extends Override{
    private double radius;
    public circle(double radius){
        this.radius = radius;
    }
    public double getArea()
    {
        return 3.14 * this.radius * this.radius;
    }
    public static void main(String args[]){
        circle cir = new circle(2);
        System.out.println("Area of the circle is " + cir.getArea() + " metre squared.");
    }
}
