import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n = ((double)Math.random() * 100);
        int number = (int)n;

        int userNumber = 0, guessSteps = 0;
        do {
            System.out.println("Guess my Number(1 to 100) : ");
            userNumber = sc.nextInt();

            guessSteps++;
            if (userNumber == number) {
                System.out.println("Yay!!!....You guess the correct One");
                break;
            }
            else if (userNumber > number)
                System.out.println("Your number is too large");
            else
                System.out.println("Your number is too small");
        } while(userNumber >= 0);

        System.out.print("The Number was : " + number);
        if (guessSteps > 1)
            System.out.print(" And you Took : " + guessSteps + " move to find it.");
        else
            System.out.println(" And you Took : " + guessSteps + " moves to find it.");
    }
}