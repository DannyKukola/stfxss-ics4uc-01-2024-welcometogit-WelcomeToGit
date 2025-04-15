import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        // Creat a scanner to read
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello "+name);
        sc.close();   

        // Simple shortform example
        int num = 4;
        System.out.println(num);
        System.out.println(num++);
        System.out.println(++num);
        System.out.println(num);
    }
}
