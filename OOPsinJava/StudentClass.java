package OOPsinJava;

//OBJECT CREATION

public class StudentClass {
    public static class Student {  //creating our own datatype 
        String name;
        int rno;
        double percent;


    }
    public static void main(String[] args) {
        Student x = new Student();  //declaration, Objects(x) of Student class (x naam ka dabba banaya)
        x.name = "Shailja"; //x ke dabbe mein values store kar diya
        x.rno = 25;
        x.percent = 97.5;
        System.out.println(x.percent + 2.5);

        Student s = new Student();  //Objects of Student class
        s.name = "Adhiraj";
        s.rno = 26;
        s.percent = 100;
        System.out.println(s.percent);


    
    }
    
}
