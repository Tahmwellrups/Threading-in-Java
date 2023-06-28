import java.util.Arrays;

public class SortNumbers extends Thread {
    @Override
    public synchronized void run()
    {
        int[] arr ={25,23,69,1337,420,21};
        System.out.print("\nThe sorted array is: ");
        Arrays.sort(arr);
        for (int no : arr)
        {
            System.out.print(no + " ");
        }
        System.out.println();
    }

}
