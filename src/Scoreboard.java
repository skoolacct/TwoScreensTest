import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scoreboard extends JFrame{

    private JButton menuButton;
    private JPanel scorePanel;

    public Scoreboard(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(scorePanel);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed the menu button");
                control.goMenu();
                control.switchScreen();
            }
        });
    }
}
