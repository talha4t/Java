public class Main {

    public static void main(String[] args) {

        // Created a object name s1
        Student s1 = new Student();

        s1.rno = 550785;
        s1.name = "Talha";
        s1.marks = 78.0f;

        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

    }
}
class Student {
    int rno;
    String name;
    float marks;
}


