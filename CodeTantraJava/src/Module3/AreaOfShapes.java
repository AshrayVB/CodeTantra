package Module3;
import java.util.*;
interface Shape {

	void getData();
	void Display();
}

class AreaOfShape {
  public static void main(String arg[]) {
    Circle c = new Circle();
    c.getData();
    c.Display();
    Rectangle r = new Rectangle();
    r.getData();
    r.Display();
  }
}

class Rectangle implements Shape {
		double length,width,area;
		public void getData() {
			Scanner sc=new Scanner(System.in);
			length=sc.nextDouble();
			width=sc.nextDouble();
		}
		public void Display()
		{
			area=length*width;
			System.out.println("Area of Rectangle: " + area);
		}
	}
class Circle implements Shape
	{
		double radius,area;
		public void getData()
		{
			Scanner sc=new Scanner(System.in);
			radius=sc.nextDouble();
		}
		public void Display()
		{
			area=3.14*radius*radius;
			System.out.println("Area of Circle: " +area);
		}
	}