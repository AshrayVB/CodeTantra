package Module3;
import java.util.Scanner;

interface	Shape{
	void getData();
	void display();
	
}
class Rectangle implements Shape{
		double length,width,area;
		public void getData(){
			Scanner sc=new Scanner(System.in);
			length=sc.nextDouble();
			width=sc.nextDouble();
		}
		public void display(){
			area=length*width;
			System.out.println("Area of Rectangle is " + String.format("%.1f", area));
		}
	}

class Circle implements Shape {
	double radius, area;

	public void getData() {
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
	}

	public void display() {
		area = 3.14 * radius * radius;
		System.out.println("Area of Circle is " + String.format("%.1f" , area));
	}
}

//Driver code
class Area {
 public static void main(String arg[]) {
     Circle c = new Circle();
     c.getData();
     c.display();

     Rectangle r = new Rectangle();
     r.getData();
     r.display();
 }
}
