import java.util.Scanner;

public class Main {

    public  static void main(String[] args) throws InterruptedException{
        // Create instances of each class
        Fibonacci fibonacciThread = new Fibonacci();
        Square squareThread = new Square();
        SortNumbers sortThread = new SortNumbers();

        // Start each thread
        // Use join method to wait for all threads to complete
        fibonacciThread.start();
        fibonacciThread.join();
        squareThread.start();
        squareThread.join();
        sortThread.start();
        sortThread.join();






        System.out.println("All threads have completed.");

    }
}

