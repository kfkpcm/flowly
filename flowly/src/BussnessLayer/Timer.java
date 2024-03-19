package BussnessLayer;

public class Timer  extends Thread{
    @Override
    public void run() {
        int time = 0;
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time ++;

            //System.out.println("Updated");
        }
    }
}
