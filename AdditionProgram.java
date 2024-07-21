package javaprograms;

public class AdditionProgram 
{
	static void add()
	{
		int a = 100;
		int b = 200;
		int Sum = a+b;//
		System.out.println(a+b);
	}
	static void Sub()
	{
		int a = 100;
		int b = 200;
		int Diff = a-b;//
		//System.out.println(Diff);
		System.out.println(a-b);
	}
	static void mul()
	{
		int a = 100;
		int b = 200;
		int mul = a*b;//
		System.out.println(mul);
	}
	static void div()
	{
		int a = 400;
		int b = 200;
		int div = a/b;//
		System.out.println(a/b);//quotient
	}
	static void mod()
	{
		int a = 4;
		int b = 2;
		int mod = a%b;//reminder can be anything need not be 0/1
		System.out.println(mod);
	}
	

	public static void main(String[] args) {
		add();
		Sub();
		mul();
		div();
		mod();
		

	}

}
