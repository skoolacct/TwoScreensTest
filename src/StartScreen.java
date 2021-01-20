import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreen extends JFrame{;
    private JPanel JPanel2;
    private JButton startButton;
    private JButton scoreboardButton;

    public StartScreen(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(JPanel2);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed the start button");
                control.goGame();
                control.switchScreen();
            }
        });

        scoreboardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed the scoreboard button");
                control.goScore();
                control.switchScreen();
            }
        });
    }
}
