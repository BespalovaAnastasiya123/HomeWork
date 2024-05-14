package HomeWorkThreadGuard;

public class Main {
    public static void main(String[] args) {
            Watch watch = new Watch();
            Guard guard1 = new Guard("Guard 1", watch);
            Guard guard2 = new Guard("Guard 2", watch);

            Thread thread1 = new Thread(guard1::standOnPost);
            Thread thread2 = new Thread(guard2::standOnPost);

            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

