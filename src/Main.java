
public class Main {

    public  static void main(String[] args) throws InterruptedException{
        // Create instances of each class
        Fibonacci fibonacciThread = new Fibonacci();
        Square squareThread = new Square();
        SortNumbers sortThread = new SortNumbers();

        // Start each thread
        fibonacciThread.start();
        fibonacciThread.join(3000);
        squareThread.start();
        squareThread.join(3000);
        sortThread.start();
        sortThread.join();

        System.out.println("\n\nAll threads have completed.");

    }
}

