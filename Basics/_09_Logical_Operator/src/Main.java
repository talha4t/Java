public class Main {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        // && (AND)
        if (a < 50 && b < 50)
            System.out.println("Both less than 50");

        int c = 100, d = 10;
        // || (OR)
        if (c < 50 || d < 50)
            System.out.println("At least one less than 50");

        boolean x = false;
        // ! (NOT)
        if (!x)
            System.out.println("Its not false");

    }
}