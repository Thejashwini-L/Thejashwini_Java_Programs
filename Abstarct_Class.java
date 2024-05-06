package inheritance;
abstract class Amazon_Auth
{//abstraction 100% is not possible
	//hiding 100% is not possible may be integration things need some logic
	abstract void un();//abs method
	abstract void un_mob();//abs method
	void login_button()//conc mthod
	{
		System.out.println("Login");
	}
	
}
abstract class Amazon_Login extends Amazon_Auth
{
	abstract void un_as_email();
	abstract void un_as_mobile();
	void registration_button()//concrete method, logic is visible in nature 
	{
		System.out.println("Login 1");
	}
}

public class Abstarct_Class extends Amazon_Login
{

	public static void main(String[] args) 
	{
		System.out.println("Login 1");
		//call all the methods using obj creation
	}

	@Override//from here we can hide logic from third party and all the methods belongs to child class
	void un_as_email() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void un_as_mobile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void un() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void un_mob() {
		// TODO Auto-generated method stub
		
	}
}
