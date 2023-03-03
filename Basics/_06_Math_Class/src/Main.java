public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20;
        //Max
        int mx = Math.max(a, b);
        //Min
        int mn = Math.min(a, b);

        System.out.println(mx);
        System.out.println(mn);

        // Random values from 0.0 to 1.0
        System.out.println(Math.random());

        // random double
        System.out.println((double) Math.random() * 100);
    }
}