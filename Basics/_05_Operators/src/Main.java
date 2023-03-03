public class Main {
    public static void main(String[] args) {
        // arithmetic

        int a = 30;
        int b = 20;
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = (a / b);

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);

        // modulator

        int x = 125;
        int y = 25;

        int remainder = x % y;

        System.out.println("Remainder is " + remainder);

        // unary operator
        int numb = 1;
        // numb = numb + 1;
        numb++; // post increment
        ++numb; // pre increment
        System.out.println(numb);
    }
}