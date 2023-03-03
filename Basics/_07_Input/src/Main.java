import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.next(); // next take single token or word

        System.out.println(name);

        System.out.print("Write something : ");
        String something = sc.nextLine();

        System.out.println(something);

        System.out.print("Input your age : ");
        int age = sc.nextInt();

        System.out.println(age);

        System.out.print("Input your C.G.P.A : ");
        float cg = sc.nextFloat();

        System.out.println(cg);

    }
}