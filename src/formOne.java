import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formOne extends JFrame{
    private JButton button1Button;
    private JPanel panel1;

    public formOne(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        button1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed button 1");
                control.changeVar();
                control.switchScreen();
            }
        });
    }
}
