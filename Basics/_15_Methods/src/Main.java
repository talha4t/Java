public class Main {
    public static void printJava() {
        System.out.println("Print Java");
    }
    public static void printName(String name) {
        System.out.print(name);
    }
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        printJava();

        printName("Talha");
        printName(" Mahmud");
        System.out.println("");

        printSum(10, 20);
    }
}