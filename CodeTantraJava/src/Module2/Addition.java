package Module2;

public class Addition{
	public static void main(String[] args) {
		int int1 = Integer.parseInt(args[0]);
		int int2 = Integer.parseInt(args[1]);
		float float1 = Float.parseFloat(args[2]);
		float float2 = Float.parseFloat(args[3]);
		double double1 = Double.parseDouble(args[4]);
		double double2 = Double.parseDouble(args[5]);

		Addition addition = new Addition();
		System.out.println("Sum of " + int1 + " and " + int2 + " : " + addition.add(int1, int2));
		System.out.println("Sum of " + float1 + " and " + float2 + " : " + addition.add(float1, float2));
		System.out.println("Sum of " + int2 + " and " + float2 + " : " + addition.add(int2, float2));
		System.out.println("Sum of " + float1 + ", " + double1 + " and " + double2 + " : " + addition.add(float1, double1, double2));
	}
		public int add(int a, int b) {
			return a+b;
		}
		public float add(int a, float b) {
			return a+b;
		}
		public float add(float a, float b) {
			return a+b;
		}
		public double add(float a, double b, double c) {
			return a+b+c;
		}
}