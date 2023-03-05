public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Talha", "Male");
        teacher2.displayInfo();

        Teacher teacher3 = new Teacher("Tanha", "Female", 010100100);
        teacher3.displayInfo();
    }
}
class Teacher {
    String name, gender;
    int phone;

    Teacher() {
        System.out.println("No Info");
    }

    Teacher(String n, String g) {
        name = n;
        gender = g;
    }

    Teacher(String n, String g, int p) {
        name = n;
        gender = g;
        phone = p;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone : " + phone);
    }
}