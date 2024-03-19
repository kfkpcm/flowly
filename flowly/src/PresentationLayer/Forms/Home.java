package PresentationLayer.Forms;

import BussnessLayer.Flower;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Home extends JDialog {
    //Buttons
    private JButton giveFoodButton;
    private JButton loveButton;
    private JButton giveWaterButton;
    private JButton NewFlowerButton;
    //Text
    private JLabel HungerText;
    private JLabel ThirstText;
    private JLabel HappinessText;
    private JLabel WalkText;
    private JPanel Home;
    private JLabel fifthStageBad;
    private JLabel fifthStageGood;
    private JLabel fifthStageMid;
    private JLabel firstStage;
    private JLabel forthStageBad;
    private JLabel forthStageGood;
    private JLabel forthStageMid;
    private JLabel secondStageBad;
    private JLabel secondStageGood;
    private JLabel secondStageMid;
    private JLabel thirdStageBad;
    private JLabel thirdStageGood;
    private JLabel thirdStageMid;

    private Flower flower = new Flower();
    private Thread thread = new Thread(flower);


    public void StartThread()
    {
        thread.start();
    }


    private void setThirstText(){
        ThirstText.setText(flower.ThirstToString());
    }
    private void setHappinessText(){
        HappinessText.setText(flower.HappinessToString());
    }

    public void update(){
        setThirstText();
        setHappinessText();
    }

    public Home() {

        setTitle("TAKE CARE OF THE FLOWER!");
        setContentPane(Home);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        pack();
        setVisible(true);



        fifthStageBad.setVisible(false);
        fifthStageGood.setVisible(false);
        fifthStageMid.setVisible(false);
        firstStage.setVisible(true);
        forthStageBad.setVisible(false);
        forthStageGood.setVisible(false);
        forthStageMid.setVisible(false);
        secondStageBad.setVisible(false);
        secondStageGood.setVisible(false);
        secondStageMid.setVisible(false);
        thirdStageBad.setVisible(false);
        thirdStageGood.setVisible(false);
        thirdStageMid.setVisible(false);





        ThirstText.setText(flower.ThirstToString());
        HappinessText.setText(flower.HappinessToString());

        loveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flower.setHappiness(flower.getHappiness() + 35);
                update();
            }
        });

        giveWaterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flower.setThirst(flower.getThirst() + 40);
                update();
            }
        });

        NewFlowerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
            }
        });
    }

}
