public class Main {
    public static void main(String[] args) {

        // For loop
        for (int i = 1; i <= 100; i++)
            System.out.println(i);

        // 100 to 1
        for (int i = 100; i >= 1; i--)
            System.out.print(i + " ");

        System.out.println("");
        //While loop
        int i = 100;
        while(i >= 1) {
            System.out.print(i + " ");
            i--;
        }

        System.out.println("");
        // Do while
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while(j <= 100);
    }
}