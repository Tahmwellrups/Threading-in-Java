import java.util.Random;
public class Square extends Thread {
    @Override
    public synchronized void run()
    {
        Random random = new Random();
        // Generate random integer between 0 and 9
        int no = random.nextInt(10);

        System.out.print("\nSquare of " + no + ": ");
        System.out.print(no * no);
        System.out.println();
        long t = ProcessHandle.current().pid();
        System.out.println(t + " PID");
    }

}