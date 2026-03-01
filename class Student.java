class Student
{
    int rollno;
    String name;

    void getData(int r, String n)
    {
        rollno = r;
        name = n;
    }

    void display()
    {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.getData(1, "Rahul");
        s1.display();
    }
}