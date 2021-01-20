import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreen extends JFrame{
    private JButton exitButton;
    private JPanel panel1;

    public GameScreen(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed exit button");
                control.goMenu();
                control.switchScreen();
            }
        });
    }
}
