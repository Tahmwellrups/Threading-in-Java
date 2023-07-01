import java.util.Random;

public class Fibonacci extends Thread {
    @Override
    public synchronized void run()
    {
        Random random = new Random();
        int no = random.nextInt(10);
        int first = 0;
        int second = 1;

        long t = ProcessHandle.current().pid();
        System.out.println( "\nPID: " + t + ", Thread ID: 1");

        System.out.print("Fibonacci: ");
        for (int i = 0; i < no; i++)
        {
            System.out.print(first + " ");
            int sum = first + second;
            first = second;
            second = sum;

        }
    }
}
