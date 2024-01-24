class function implements Runnable
{
    Thread t;
    String name;
    int p;
    function(String name,int p)
    {
        this.name=name;
        this.p=p;
        t=new Thread(this);
        t.setName(name);
        t.setPriority(p);
        t.start();
    }
    public void run()
    {
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("Thread ="+t.getName());
        }
    }
}
public class Main {
    public static void main(String[] args)
    {
            function ob=new function("sayan",3);
            function ob1=new function("sanglap",1);
            int i=0;
            for(i=0;i<10;i++)
            {
                System.out.println("Thread main");
            }
    }
}