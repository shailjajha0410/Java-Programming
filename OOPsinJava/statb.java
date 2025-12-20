package OOPsinJava;

    //static+instance+local variable
class statb
{
	int x;               // creating an instance variable
	static int count;   // creating static variable
	void update()
	{
		x++;
		count++;
	}
	static void show()
	{
		System.out.println("count is="+count);
			//System.out.println("xis="+x);		
	}	
	public static void main(String arg[])
	{
		statb s1=new statb();
		s1.update();   //update count value to 1
		statb s2=new statb();
		s2.update();   //update count value to 2
		statb s3=new statb();
		s3.update();   //update count value to 3
		statb.show();    //display the value of count
		
	}
}
    
    

