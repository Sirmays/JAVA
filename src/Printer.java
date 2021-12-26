public class Printer implements Runnable {
    private char nextletter = 'A';

    public synchronized void PrintA() {
        for (int i = 0; i <= 5; i++) {
            while (nextletter != 'A') {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("A");
            nextletter = 'B';
            notifyAll();
        }
    }

    public synchronized void PrintB() {
        for (int i = 0; i <= 5; i++) {
            while (nextletter != 'B') {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("B");
            nextletter = 'C';
            notifyAll();
        }
    }

    public synchronized void PrintC() {
        for (int i = 0; i <= 5; i++) {
            while (nextletter != 'C') {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("C ");
            nextletter = 'A';
            notifyAll();
        }
    }


    @Override
    public void run() {

    }
}
