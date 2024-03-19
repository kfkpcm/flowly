package BussnessLayer;

import PresentationLayer.Forms.Home;

public class Flower extends Thread{


    public String ThirstToString() {
        return "Thirst: " + Thirst;
    }
    public String HappinessToString() {
        return "Happiness: " + Happiness;
    }



    int Thirst = 100;
    int Happiness = 100;



    public int getThirst() {
        return Thirst;
    }

    public void setThirst(int thirst) {
        Thirst = thirst;
    }

    public int getHappiness() {
        return Happiness;
    }

    public void setHappiness(int happiness) {
        Happiness = happiness;
    }

    @Override
    public void run() {
        while(Thirst > 0 && Happiness > 0 ){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thirst--;
            Happiness--;
            //System.out.println("Updated");
        }
    }


}
