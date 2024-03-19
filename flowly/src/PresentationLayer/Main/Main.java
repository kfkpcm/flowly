package PresentationLayer.Main;
import PresentationLayer.Forms.Home;

public class Main {
    public static void main(String[] args) {
        Home home = new Home();
        home.StartThread();

     while (true) {
         home.update();
         //System.out.println("Updated");
     }
    }
}