import java.util.Arrays;


public class SortNumbers extends Thread {
    @Override
    public synchronized void run()
    {

        int[] arr ={25,23,69,1337,420,21};

        long t = ProcessHandle.current().pid();
        System.out.println( "\n\nPID: " + t + ", Thread ID: 3");

        System.out.print("The unsorted array is: ");
        for (int no : arr)
        {
            System.out.print(no + " ");
        }
        System.out.print("\nThe sorted array is: ");
        Arrays.sort(arr);
        for (int no : arr)
        {
            System.out.print(no + " ");
        }
    }
}
