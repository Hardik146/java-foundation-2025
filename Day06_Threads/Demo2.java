package Day06_Threads;

// class A1 implements Runnable {

//     public void run() {
//     for (int i = 1; i <= 10; i++) {
//     System.out.println("hiii");
//     try {
//     Thread.sleep(10); // to wait first thread for 10 miliseconds
//     } catch (InterruptedException e) {
//     e.printStackTrace();
//     }
//     }
//     }

// }

class B1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hellooo");
            try {
                Thread.sleep(10); // to wait first thread for 10 miliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        // Runnable obj1 = new A1();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("hiii");
                try {
                    Thread.sleep(10); // to wait first thread for 10 miliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("helloo");
                try {
                    Thread.sleep(10); // to wait first thread for 10 miliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }

}
