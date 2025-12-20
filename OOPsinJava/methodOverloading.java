package OOPsinJava;

public class methodOverloading {
    
    static void add(int x, long y) {
        int d = (int) (x+y);
        System.out.println("addition of two integers" +d);
        
    }
    static void add(long x, int y) {
        int d = (int)x+y;
        System.out.println("addition is "  +d);

    }
    static void add(float x, float y){
        float d= x+y;
        System.out.println("addition of two float "  +d);

    }
    public static void main(String arg[]){
      //  methodOverloading p1 = new methodOverloading();
        methodOverloading.add(10l,20);
        methodOverloading.add(20.4f,54.5f);


    }
    
}
