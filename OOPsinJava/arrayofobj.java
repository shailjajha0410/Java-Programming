package OOPsinJava;

import java.util.Scanner;

class arrayOfObject {
    private String name;
    private int balance;
    private String city;

    arrayOfObject() {
    }
    
    arrayOfObject(String name, int balance, String city) {
        this.name = name;
        this.city = city;
        this.balance = balance;
    }

    public static void identify(int x, arrayOfObject b[]) {
        for (int i = 0; i < b.length; i++) {
            if (b[i].balance < x) {
                System.out.println("Name of the customer=" + b[i].name);
                System.out.println("City of the customer=" + b[i].city);
            }
        }
    }
}

public class arrayofobj {
    public static void main(String arg[]) {
        arrayOfObject b[] = new arrayOfObject[5];
        Scanner sc = new Scanner(System.in);
        String n, c;
        int b1;
        for (int i = 0; i < b.length; i++) {
            System.out.println("Enter the balance of " + (i + 1) + " customer");
            b1 = sc.nextInt();
            System.out.println("Enter the City of " + (i + 1) + " customer");
            c = sc.next();
            System.out.println("Enter the name of " + (i + 1) + " customer");
            n = sc.next();
            b[i] = new arrayOfObject(n, b1, c);
        }
        arrayOfObject.identify(5000, b);
        sc.close();
    }
}
