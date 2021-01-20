import javax.swing.*;

public class control {
    static boolean varA = false;
    static boolean varB = true;

    static JFrame a = new formOne();
    static JFrame b = new formTwo();

    public static void main(String[] args) {
        a.setSize(500, 200);
        b.setSize(500, 200);
        a.setVisible(varA);
        b.setVisible(varB);
    }

    public static void changeVar(){
        if (varA == true){
            varB = true;
            varA = false;
        }else{
            varB = false;
            varA = true;
        }
    }

    public static void switchScreen(){
        a.setVisible(varA);
        b.setVisible(varB);
    }
}
