public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.greetings();
        
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

    }
}

class Student {
    int rno;
    String name;
    float marks;

    void greetings() {
        System.out.println("Hello! My name is " + name);
    }
    // Basically it replace with all objects name which is named with Student() Class

    // this. use for Constructor
    Student () {
        this.rno = 550785;
        this.name = "Talha Mahmud";
        this.marks = 99.0f;
    }

}