package inheritance;
class Amazon_Application
{
	private String Un="contact@grotechminds";//5////updated to mkt@gmail.com//variable which as sensitive info as made private
	
	public String getUn()////6 //8//getUn - first letter u to be caps
	//to access the private var we are making use of getter and setter, get followed by ref var
	{
		return Un;//7such things which are present and you want to call that we use return keyword and data type can't be void
		//so public string getun(); as un data type is string//since the value is already present in getun, we just returned it
		//if just want to access private string var..just write get method with return stmt and call within main method
	}
	
	public void setUn(String Un)//3//setter mean setting the values which happens over parameterization
	{
		this.Un =Un;//4//using this keyword to update value of local var to global var i.e..mkt@gmail.com is pushed to un which as contact@grotechminds
	}

}
public class Encapsulation 
{
	public static void main(String[] args) 
	{
		Amazon_Application ap = new Amazon_Application();//1
		ap.setUn("mkt@gmail.com");//2
		System.out.println(ap.getUn());//9//when ever we have return in method better to call in sop
	}

}
