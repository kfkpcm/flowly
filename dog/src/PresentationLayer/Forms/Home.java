package PresentationLayer.Forms;

import BussnessLayer.Dog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Home extends JDialog {
    //Buttons
    private JButton giveFoodButton;
    private JButton playButton;
    private JButton giveWaterButton;
    private JButton walkButton;
    //Text
    private JLabel HungerText;
    private JLabel ThirstText;
    private JLabel HappinessText;
    private JLabel WalkText;
    private JPanel Home;

    Dog dog = new Dog();

    private void setHungerText(){
        HungerText.setText(dog.HungerToString());
    }
    private void setThirstText(){
        ThirstText.setText(dog.ThirstToString());
    }
    private void setHappinessText(){
        HappinessText.setText(dog.HappinessToString());
    }
    private void setWalkText(){
        WalkText.setText(dog.WalkToString());
    }

    public void update(){
        setHungerText();
        setThirstText();
        setHappinessText();
        setWalkText();
    }
    public Home() {
        setTitle("Sign Up");
        setContentPane(Home);
        //setLocationRelativeTo(parent);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        pack();
        setMinimumSize(new Dimension(1440,900));
        setVisible(true);

        //ResultSet set;


        giveFoodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dog.setHunger(dog.getHunger() + 30);
            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dog.setHunger(dog.getHunger() + 35);
            }
        });

        giveWaterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dog.setThirst(dog.getThirst() + 40);
            }
        });

        walkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dog.setWalk(dog.getWalk() + 40);
            }
        });
    }

}
