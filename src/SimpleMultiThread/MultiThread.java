package SimpleMultiThread;

/**
 * Created by MR on 11/5/14.
 */
public class MultiThread
{
    public static void main(String[] args)
    {
        try
        {
            Thread first = new Numbers();
            Thread second = new Names();
            first.start();
            second.start();
        }catch(IllegalThreadStateException e){
            System.err.println("fatal!");
        }
    }
}
