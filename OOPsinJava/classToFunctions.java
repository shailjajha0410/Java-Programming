package OOPsinJava;

public class classToFunctions {
     public static class Student {
        String name;
        int rno;
        double percent;
        // This class is now empty because we are moving the attributes
        // to be local variables inside the main function.
    }
    public static void fun(Student x) {
        System.out.println(x.rno);
        return;
    }
    public static void change(Student y) {
        y.name = "Adhiraj";   // class is always Call By Reference 
        
    }

    public static void main(String[] args) {
       

        // Creating a Student object
        Student s1 = new Student();
        // Since the attributes are not part of the Student class anymore,
        // we can no longer use the dot operator (x.name).
        // Instead, we will assign values to the local variables.
        s1.name = "Shailja";
        s1.rno = 25;
        s1.percent = 97.5;
        System.out.println(s1.name); // This will print 100.0
        change (s1);
        System.out.println(s1.name);

    }
}
