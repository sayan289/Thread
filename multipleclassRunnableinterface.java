import java.lang.Thread;
class multhread1 implements Runnable
{
    Thread t;
    String s;
    int p;
    multhread1(String s,int p)
    {
        this.s=s;
        this.p=p;
        t=new Thread(this);
        t.setName(s);
        t.setPriority(p);
        t.start();
    }
    public void run()//throws InterruptedException
    {
        int i=0;
        for(i=0;i<10;i++)
        {
            System.out.println("Class 1, Thread name "+t.getName());

        }
    }
}

public class multipleclassRunnableinterface
{
    public static void main(String ars[])
    {
        multhread1 ob=new multhread1("Sayan",3);
        multhread1 ob1=new multhread1("sanglap",5);
        for(int i=0;i<10;i++)
        {
            System.out.println("Main");
            try{
                Thread.sleep(500);
            }
            catch (Exception e)
            {

            }
        }
    }
}
