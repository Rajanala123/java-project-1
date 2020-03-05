package pack;

public class Staticvariable {
	int a = 10;
	static int i = 0;

	Staticvariable() {
		i++;
		System.out.println(i);
	}

	static void dispaly() {
		Staticvariable obj = new Staticvariable();
		System.out.println("Instance variable" + obj.a);
		System.out.println("Static varibale" + i);

	}

	public static void main(String[] args)

	{
		Staticvariable b1 = new Staticvariable();
		Staticvariable b2 = new Staticvariable();
		System.out.println(i);
	}

}
