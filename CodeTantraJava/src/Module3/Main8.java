package Module3;

import java.util.*;

//Here define interface drawable with draw method
interface Drawable{
	void draw();
}

class Square implements Drawable {
 // Here define draw method
	@Override
	public void draw()
	{
		System.out.println("Drawing a square.");
	}
}
//replace Main8 to Main
public class Main8 {
 public static void main(String[] args) {
     // Create an array of drawable objects
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     Drawable[] squares = new Square[n];

		for(int i=0;i<n;i++)
			{
				squares[i]=new Square();
				squares[i].draw();
			}
		s.close();
 }
}
