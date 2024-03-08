package BussnessLayer;

import PresentationLayer.Forms.Home;

public class Flower extends Thread{

    Home home = null;
    //@Override
    public String HungerToString() {

        return "Hunger: " + Hunger;
    }
    public String ThirstToString() {
        return "Thirst: " + Hunger;
    }
    public String HappinessToString() {
        return "Happiness: " + Hunger;
    }
    public String WalkToString() {
        return "Walk: " + Hunger;
    }

    int Hunger = 100;
    int Thirst = 100;
    int Happiness = 100;
    int Walk = 100;

    public int getHunger() {
        return Hunger;
    }

    public void setHunger(int hunger) {
        Hunger = hunger;
    }

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

    public int getWalk() {
        return Walk;
    }

    public void setWalk(int walk) {
        Walk = walk;
    }

    @Override
    public void run() {
        if(Hunger > 0 ||Walk > 0 ||Thirst > 0 ||Happiness > 0 ){
            Hunger--;
            Walk--;
            Thirst--;
            Happiness--;
            //home.update();
        }
        //wait one 3 secons
    }

    public String barking(){
        return "Bark Bark";
    }
}
