import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formTwo extends JFrame{;
    private JButton button2Button;
    private JPanel JPanel2;

    public formTwo(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(JPanel2);
        this.pack();

        button2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed button 2");
                control.changeVar();
                control.switchScreen();
            }
        });
    }
}
