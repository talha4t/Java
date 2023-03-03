public class Main {
    public static void main(String[] args) {
        // Concatenate

        String name1 = "Talha ";
        String name2 = "Mahmud";

        String name = name1 + name2;

        System.out.println(name);

        // Character in any position

        System.out.println(name.charAt(0));

        // replace
        String org = "melodies";

        String orgReplaced =  org.replace('e', 'a');

        System.out.println(orgReplaced);

        //Substring

        String alpha = "aquickbrownfoxjumpoverthelazydog";

        System.out.println(alpha.substring(11, 14));

    }
}