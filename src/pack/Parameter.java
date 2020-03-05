package pack;

public class Parameter 
{
	void display(int a,String s)
	{
		System.out.println("Enter the integer value"+a);
		System.out.println("Enter the string value"+s);
	}
	String iit(int rollnumber,String college)
	{
		return college;
	}
	public static void main(String[] args)
	{
		Parameter p=new Parameter();
		p.display(5,"ab");
		String s=p.iit(999,"lords");
		System.out.println("The value is"+s);
		
		
	}
}
