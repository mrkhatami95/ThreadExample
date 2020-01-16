package SimpleMultiThread;

/**
 * Created by MR on 11/5/14.
 */
public class Names extends Thread
{
    private String[] names;

    Names()
    {
        names = new String[]{"Ali","Reza","gholi","hushang","amir","hassan","Reza","gholi","hushang","amir","hassan","Reza","gholi","hushang","amir","hassan","Reza","gholi","hushang","amir","hassan","Reza","gholi","hushang","amir","hassan","Reza","gholi","hushang","amir","hassan","Reza","gholi","hushang","amir","hassan"};
    }
    public void run()
    {
        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}
