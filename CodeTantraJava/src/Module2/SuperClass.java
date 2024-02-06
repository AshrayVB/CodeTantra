package Module2;

import java.util.Scanner;

class Figure {
	double dimension1;
	double dimension2;

	Figure(double dimension1, double dimension2) {
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
	}

	double area() {
		System.out.println("Area of the figure");
		return 0;
	}
}

class Rectangle extends Figure {
	Rectangle(double length, double width) {
		super(length, width);
	}

	double area() {
		double area = dimension1 * dimension2;
		return area;
	}
}
class Triangle extends Figure {
	Triangle(double base, double height) {
		super(base, height);
	}

	double area() {
		double area = 0.5 * dimension1 * dimension2;
		return area;
	}
}
class SuperClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Rectangle length: ");
		double length = scanner.nextDouble();

		System.out.print("Rectangle width: ");
		double width = scanner.nextDouble();

		System.out.print("Triangle base: ");
		double base = scanner.nextDouble();
		
		System.out.print("Triangle height: ");
		double height = scanner.nextDouble();

		Rectangle rectangle = new Rectangle(length, width);
		double rectangleArea = rectangle.area();

		Triangle triangle = new Triangle(base, height);
		double triangleArea = triangle.area();

		System.out.println("Area of rectangle: " + rectangleArea);
		System.out.println("Area of triangle: " + triangleArea);
	}
}