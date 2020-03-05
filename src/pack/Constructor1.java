package pack;

public class Constructor1 {
	void display() {
		System.out.println("This is a method");
	}

	Constructor1() {
		System.out.println("Default constructor");
	}

	Constructor1(String s, int i) {
		System.out.println("This is a parameterized constructor");
	}

	public static void main(String[] args) {
		new Constructor1();
		new Constructor1();
		new Constructor1("java", 8);

	}
}
