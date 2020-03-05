package pack;

public class ClassB {

	ClassB() {
		System.out.println("hai");
	}

	public ClassB(int i, String s) {
		System.out.println("The value of int\t" + i);
		System.out.println("The value of string\t" + s);
	}

	public static void main(String[] args) {
		new ClassB();
		new ClassB(50, "hello");
	}
}
