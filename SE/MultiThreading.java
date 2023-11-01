class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c );
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.print("\t" + i );
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        AlphabetThread alphabetThread = new AlphabetThread();
        NumberThread numberThread = new NumberThread();

        alphabetThread.start();
        numberThread.start();
    }
}