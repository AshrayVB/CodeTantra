package Module2;

public class Staff {
	public int id;
	public String name;

	public Staff(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void show() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
	}

	public static void main(String[] args) {
		int id = Integer.parseInt(args[0]);
		String name = args[1];
		Staff staff = new Staff(id, name);
		staff.show();
	}
}