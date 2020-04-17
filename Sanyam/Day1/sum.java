class SquareSum {

  // Method to sum the squares of three numbers
  double squareSum(double num1, double num2, double num3) {
    double sum = 0;
    sum = num1*num1 + num2*num2 + num3*num3;

    return sum;
  }
}

class LOL {

  public static void main(String args[]) {
    SquareSum sum = new SquareSum();
    System.out.println(sum.squareSum(5, 4, 6));
  }
}
