import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        // Creat a scanner to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your favourite colour: ");
        String colour = sc.next();

        
        System.out.println("Hello "+name + ", your favourite colour is " + colour);
        sc.close();   

        // Simple shortform example
        int num = 10;
        System.out.println(num);
        System.out.println(num++);
        System.out.println(++num);
        System.out.println(num);
    }
}
