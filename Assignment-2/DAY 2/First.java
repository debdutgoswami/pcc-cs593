public class First {
	int x;

	void show() {
		System.out.println("Printing");
	}

	public static void main(String[] args) {
		First obj = new First();
		System.out.println(obj.x);
		obj.show();
	}
}