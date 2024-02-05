package Module2;
import java.util.Scanner;

class Rectangle {
	int lenght,width;
	Rectangle(int lenght,int width)
	{
		this.lenght=lenght;
		this.width=width;
	}
	int area()
	{
		return lenght*width;
	}
	
}

class Square extends Rectangle {
	
	Square(int side)
	{
		super(side,side);
	}
	
}

class Triangle extends Rectangle {
	int base,height;
	Triangle(int base,int height)
	{
		super(base,height);
		this.base=base;
		this.height=height;
	}
	int area()
	{
		return (base*height)/2;
	}
	
	
}

class Calculation {
    public static void main(String args[]) {
    	
    	Scanner sc = new Scanner(System.in);

		System.out.println("Enter length and width of Rectangle:");
		int length = sc.nextInt();
		int width = sc.nextInt();
		Rectangle r = new Rectangle(length, width);
		System.out.println("Area of rectangle:"+ r.area());

		System.out.println("Enter side of square:");
		int side = sc.nextInt();
		Square s = new Square(side);
		System.out.println("Area of square:" + s.area());

		System.out.println("Enter base and height of Traingle:");
		int base=sc.nextInt();
		int height=sc.nextInt();
		Triangle t=new Triangle(base,height);
		System.out.println("Area of triangle:" + t.area());
	}
}