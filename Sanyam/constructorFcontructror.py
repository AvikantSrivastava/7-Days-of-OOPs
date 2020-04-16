class Calculator {
  // write class fields here
   private double n1;
   private double n2;

  public Calculator() {
    //write definition here
    this.n1=0;
    this.n2=0;
  }

  double add(double n1, double n2) {
    return (n1+n2);
  }

  double subtract(double n1, double n2) {

    return (n1-n2);
  }

  double multiply(double n1, double n2) {

    return (n1*n2);
  }

  double divide(double n1, double n2) { 

    return (n1/n2);
  }
  
}

class Demo {

  public static void main(String args[]) {
    Calculator obj = new Calculator();

    System.out.println(obj.add(10, 94));
    System.out.println(obj.subtract(10, 94));
    System.out.println(obj.multiply(10, 94));
    System.out.println(obj.divide(10, 94));
  }

}
