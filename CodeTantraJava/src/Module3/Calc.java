package Module3;

import java.util.Scanner;
interface Calculator{
		double add(double a,double b);
		double subtract(double a,double b);
		double multiply(double a,double b);
		double divide(double a,double b);
	}

// Define interface Calculator
class BasicCalculator implements Calculator {
  public double add(double a,double b){
		return a+b;
	}
	public double subtract(double a,double b){
		return a-b;
	}
	public double multiply(double a,double b){
		return a*b;
	}
	public double divide(double a,double b){
		if(b==0){
			System.out.println("Cannot divide by zero");
			return 0;
		}else{
			return a/b;
		}
	}
}
public class Calc {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
		double a, b;

		Calculator calc = new BasicCalculator();

		
		a = sc.nextDouble();
		b = sc.nextDouble();

        System.out.println("Addition: " + calc.add(a,b));
		System.out.println("Subtraction: " + calc.subtract(a,b));
		System.out.println("Multiplication: " + calc.multiply(a,b));
		System.out.println("Division: " + calc.divide(a,b));
    }
}
