class Student {
    String name = "Rahul";
    int age = 20;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}