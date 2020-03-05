package pack;

public class Method {
	void display() {
		System.out.println("HELLO WORLD");
		System.out.println("Today is tuesday");
	}

	void show(String day) {
		System.out.println("day");
	}

	void akhila(int a, String s) {
		System.out.println("The value of int" + a);
		System.out.println("The value of string" + s);
	}

	string iit(int rollnumber, string college) {
		return college;
	}

	public static void main(String args[]) {
		Method obj = new Method();
		obj.display();
		System.out.println("Display method completed");
		obj.akhila(20, "abc");
		System.out.println("Akhila method completed");
		obj.show("sunday");

	}
}
