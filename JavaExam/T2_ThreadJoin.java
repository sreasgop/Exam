class ThreadJoin extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(currentThread().getName() + "=" + i);
                sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class T2_ThreadJoin{
    public static void main(String args[]) {

        ThreadJoin t1 = new ThreadJoin();
        t1.setName("RED");
        
        ThreadJoin t2 = new ThreadJoin();
        t2.setName("BLUE");
        
        ThreadJoin t3 = new ThreadJoin();
        t3.setName("GREEN");
        
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println("The problem is = " + e);
        }
        
        t2.start();
        t3.start();

    }
}
