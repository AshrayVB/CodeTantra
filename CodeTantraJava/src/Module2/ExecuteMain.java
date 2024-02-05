package Module2;
import java.util.Scanner;
import java.lang.Math;

interface GeometricShape {
	void area();
	void perimeter();
}

class Triangle implements GeometricShape {
	private double a, b, c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void area() {
		double s = (a+b+c)/2;
		double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		System.out.println("Area of Triangle:" + area);
	}

	public void perimeter() {
		double perimeter = a+b+c;
		System.out.println("Perimeter of Triangle:" + perimeter);
	}
}

class Rectangle implements GeometricShape {
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void area() {
		double area = length * width;
		System.out.println("Area of Rectangle:" + area);
	}

	public void perimeter() {
		double perimeter = 2 * (length + width);
		System.out.println("Perimeter of Rectangle:" + perimeter);
	}
}

class Circle implements GeometricShape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void area() {
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle:" + area);
	}

	public void perimeter() {
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Circumference of Circle:" + perimeter);
	}
}

public class ExecuteMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		{
			System.out.println("Choose a geometric shape:");
			System.out.println("1.Triangle");
			System.out.println("2.Rectangle");
			System.out.println("3.Circle");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			if(choice == 1) {
					System.out.println("Enter lengths of the three sides of Triangle:");
					double a = sc.nextDouble();
					double b = sc.nextDouble();
					double c = sc.nextDouble();
					Triangle t = new Triangle(a, b, c);
					t.area();
					t.perimeter();
			}
				else if(choice == 2)
				{
					System.out.println("Enter length and breadth of Rectangle:");
					double length = sc.nextDouble();
					double width = sc.nextDouble();
					Rectangle r = new Rectangle(length, width);
					r.area();
					r.perimeter();
				}
				else if(choice == 3)
				{
					System.out.println("Enter radius of Circle:");
					double radius = sc.nextDouble();
					Circle circle = new Circle(radius);
					circle.area();
					circle.perimeter();
				}
				else
				{
					System.out.println("Invalid choice");
				}
			}
		}
	}