import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreen extends JFrame{
    private JButton exitButton;
    private JPanel panel1;
    private JLabel Image;
    private JButton switchImageButton;

    private boolean arnold = true;

    public GameScreen(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);

        Image.setIcon(new ImageIcon("BArnold.jpg"));

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed exit button");
                control.goMenu();
                control.switchScreen();
            }
        });

        switchImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imgChange();
            }
        });
    }

    public void imgChange(){
        if(arnold == true){
            Image.setIcon(new ImageIcon("TBechtel.jpg"));
            arnold = false;
        }else{
            Image.setIcon(new ImageIcon("BArnold.jpg"));
            arnold = true;
        }
    }
}
