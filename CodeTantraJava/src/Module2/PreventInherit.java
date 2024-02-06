package Module2;

import java.util.*;
final class Figure{}
class Square{
	int side;
	Square(int side)
	{
		this.side=side;
	}
	double area()
	{
		return side*side;
	}
}
class PreventInherit{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of Square: ");
		int side=sc.nextInt();
		Square square=new Square(side);
		double area=square.area();
		System.out.println("Inside Area of Square");
		System.out.println("Area of Square is " + area);
	}
}