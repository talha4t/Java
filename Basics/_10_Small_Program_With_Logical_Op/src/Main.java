import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pen = 10, notebook = 40

        int cash = sc.nextInt();

        if (cash < 10) {
            System.out.println("Can't buy anything");
            System.out.println("Get more cash");
        }
        else if (cash > 10 && cash < 50)
            System.out.println("Can get one thing");
        else
            System.out.println("Can get both");



    }
}