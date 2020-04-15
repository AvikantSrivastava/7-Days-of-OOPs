class Calculator {
    // write class fields here
    private double num1;
    private double num2;
    public Calculator() {
        //write definition here
        this.num1 = 0;
        this.num2 = 0;
    }

    double add(double n1, double n2) {
        //write definition here
        double sum = 0;
        sum = n1 + n2;
        return sum;
    }

    double subtract(double n1, double n2) {
        //write definition here
        double sub = 0;
        sub = n2 - n1;
        return sub;
    }

    double multiply(double n1, double n2) {
        //write definition here
        double mul = 0;
        mul = n1 * n2;
        return mul;
    }

    double divide(double n1, double n2) {
        //write definition here
        double div = 0;
        if (n1 > n2)
        {
            div = n1 / n2;
        }
        else{
            div = n2 / n1;
        }
        return div;
    }

}

class Demo3 {

    public static void main(String args[]) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(10, 94));
        System.out.println(obj.subtract(10, 94));
        System.out.println(obj.multiply(10, 94));
        System.out.println(obj.divide(10, 94));
    }

}