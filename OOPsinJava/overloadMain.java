public class overloadMain {

    public static void main() {
        System.out.println("I am main without argument");
    }

    public static void main(String arg) {
        System.out.println("I am main with one String argument");
    }

    public static void main(int x, int y) {
        System.out.println("I am main with two int arguments");
    }

    public static void main(float y) {
        System.out.println("I am main with one float argument");
    }

    public static void main(String[] args) {
        overloadMain.main();        // no-arg main()
        overloadMain.main(23.4f);   // float main()
        overloadMain.main("Ram");   // String main()
        overloadMain.main(23, 56);  // int,int main()
        System.out.println("I am main method with String array as argument");
    }
}
