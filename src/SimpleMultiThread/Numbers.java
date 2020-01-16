package SimpleMultiThread;

/**
 * Created by MR on 11/5/14.
 */
public class Numbers extends Thread
{
    private Integer[] numbers;
    Numbers()
    {
        numbers = new Integer[]{11,14,5,13,12,16,11,14,5,13,12,16,11,14,5,13,12,16,11,14,5,13,12,16,11,14,5,13,12,16,11,14,5,13,12,16,11,14,5,13,12,16,11,14,5,13,12,16,11,14,5,13,12,16,11,14,5,13,12,16,11,14,5,13,12,16,11,14,5,13,12,16};
    }
    public void run()
    {
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
