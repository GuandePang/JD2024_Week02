package Practice15;

public class OddEven
{
    private final Object lock = new Object();
    private boolean oddTurn = true;
    private void odd(){
        for (int i = 1; i < 100; i = i + 2) {
            synchronized (lock){
                while (! oddTurn){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd: " + i);
                oddTurn = false;
                lock.notify();
            }
        }
    }

    private void even(){
        for (int i = 2; i < 100; i = i + 2) {
            synchronized (lock){
                while (oddTurn){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even: " + i);
                oddTurn = true;
                lock.notify();
            }
        }
    }

    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        Thread oddThread = new Thread(oddEven::odd);
        Thread evenThread = new Thread(oddEven::even);
        oddThread.start();
        evenThread.start();
    }
}
