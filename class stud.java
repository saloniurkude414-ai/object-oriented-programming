class Student
{
    int id;

    Student(int id)
    {
        this.id = id;
    }

    void display()
    {
        System.out.println("ID = " + id);
    }

    public static void main(String args[])
    {
        Student s = new Student(101);
        s.display();
    }
}