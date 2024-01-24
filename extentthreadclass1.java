class function1 extends Thread
{
    public void run()
    {
        int i=0;
        for(i=0;i<5;i++)
        {
            System.out.println("Thread1 "+i);
        }
    }
}
class function2 extends Thread
{
    public void run()
    {
        int i=6;
        for(i=6;i<11;i++)
        {
            System.out.println("Thread2 "+i);
        }
    }
}
public class extentthreadclass1 {
    public static void main(String ars[])
    {
        function1 ob=new function1();
        Thread t1=new Thread(ob);
        t1.setPriority(1);
        t1.start();
        function2 ob1=new function2();
        Thread t2=new Thread(ob1);
        t2.setPriority(10);
        t2.start();
    }

}
