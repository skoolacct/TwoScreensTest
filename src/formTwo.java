import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formTwo extends JFrame{;
    private JPanel JPanel2;
    private JButton startButton;

    public formTwo(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(JPanel2);
        this.pack();

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed the start button");
                control.changeVar();
                control.switchScreen();
            }
        });
    }
}
