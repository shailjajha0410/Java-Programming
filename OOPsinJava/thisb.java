package OOPsinJava;

// uses of this keyword
class student
{
private String name;
private int roll;
private String city;
private String college;
private int number;
private int result;
 public student()
 {
	 this(101,"Karan");
	  System.out.println("i am dafault Constructor");
 }
  public student(int x, String y)
 {
	 number=x;
	 college=y;
	  System.out.println("i am two parameter Constructor");
 }
 public student(String name,int roll,String city,String college,int number, int result)
 {
	 this();  // constructor call
	 this.name=name;
	  this.roll=roll;
	 this. city=city;
	  this.college=college;
	 this.number=number;
	 this.result=result;
 }
 public void show()
 {
	 this.demo();
	 System.out.println("Name="+this.name);
	  System.out.println("object inside show="+this);
 }
 
 public void demo()
 {
	  System.out.println("i am inside Demo Method");
 }
}
class thisb
{
	public static void main(String arg[])
	{
		student s1=new student("Ajay",101,"Jaipur","Manipal",83654,55);
		s1.show();
	System.out.println("object inside main="+s1);
		
		//s1.name="Ajay";
	}	 
 }