package pack;

public class Defaultvalues {
	static int i;
	byte b;
	short s;
	long l;
	float f;
	double d;
	char c;
	boolean x;

	void display() {
		System.out.println("The default value int" + i);
		System.out.println("The default value byte" + b);
		System.out.println("The default value short" + s);
		System.out.println("The default value long" + l);
		System.out.println("The default value float" + f);
		System.out.println("The default value double" + d);
		System.out.println("The default value char" + c);
		System.out.println("The default value boolean" + x);
	}

	public static void main(String[] args) {
		Defaultvalues d = new Defaultvalues();
		d.display();

	}

}
