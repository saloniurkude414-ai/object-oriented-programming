class Demo
{
    static int x = 10;
    final int y = 20;

    public static void main(String args[])
    {
        Demo d = new Demo();
        System.out.println("Static value: " + x);
        System.out.println("Final value: " + d.y);
    }
}