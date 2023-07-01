import java.util.Random;
public class Square extends Thread {
    @Override
    public synchronized void run()
    {
        Random random = new Random();
        // Generate random integer between 0 and 9
        int no = random.nextInt(10);

        long t = ProcessHandle.current().pid();
        System.out.println( "\n\nPID: " + t + ", Thread ID: 2");

        System.out.print("Square of " + no + ": ");
        System.out.print(no * no);
    }

}