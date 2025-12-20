package OOPsinJava;

public class namelessObject {
    // Nameless Object
	String name;
	static String College=null;
	public namelessObject()
	{
		
	}
	public namelessObject(String name)
	{
		this.name=name;
	}
	public void show()
	{
		System.out.println(" I am show method"+name);
	}
}
class namelessb
{
	public static void main(String arg[])
	{
		namelessObject s1= new namelessObject();
		s1.show();
		new namelessObject("Ajay").show();  // Nameless object
		new namelessObject().show();
		
	}
}
    

