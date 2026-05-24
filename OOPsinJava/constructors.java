package OOPsinJava;

public class constructors {
    private int roll;
    private String name;
    private float cgpa;

    // Default constructor
    public constructors() {
    }

    // Parameterized constructor - FIXED
    // 1. Constructor name now matches the class name ("constructors").
    // 2. Used correct parameter variables ("name", "cgpa") instead of "n" and "c".
    public constructors(int r, String name, float cgpa) {
        roll = r;
        this.name = name; // "this." is used to refer to the class field
        this.cgpa = cgpa;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("CGPA: " + cgpa);
        System.out.println("--------------------");
    }

    // Copy constructor - FIXED
    // 1. Parameter type is now the correct class name ("constructors").
    public constructors(constructors s) {
        roll = s.roll;
        name = s.name;
        cgpa = s.cgpa;
    }
}

class construb {
    public static void main(String arg[]) {
        constructors s1 = new constructors();
        
        
        s1.show();
        
        // These lines now work because the constructors are defined correctly.
        constructors s3 = new constructors(309, "Adhiraj", 9.99f);
        constructors s4 = new constructors(s3);
        
        s3.show();
        s4.show();
        
        constructors s5 = s4;
    }
}
