package pack;

public class ClassA {
	void display() {
		System.out.println("Hello world");
		System.out.println("Today is tuesday");
	}

	void show(String day) {
		System.out.println("monday");
	}

	void akhila(int a, String s) {
		System.out.println("The value of int  " + a);
		System.out.println("The value of string  " + s);
	}

	String iit(int rollnumber, String college) {
		return college;
	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.display();
		System.out.println("display method completed");
		obj.show("sunday");
		System.out.println("show method completed");
		obj.akhila(52, "abc");
		System.out.println("akhila method is completed");
		String s = obj.iit(999, "lords");
		System.out.println("The value is  " + s);
		System.out.println("iit method completed");

	}
}
