import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formOne extends JFrame{
    private JButton exitButton;
    private JPanel panel1;

    public formOne(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed exit button");
                control.changeVar();
                control.switchScreen();
            }
        });
    }
}
