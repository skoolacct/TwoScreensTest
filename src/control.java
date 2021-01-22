import javax.swing.*;

public class control {
    static boolean runGameScreen = false;
    static boolean startingScreen = true;
    static boolean scoreboardScreen = false;

    static GameScreen GS = new GameScreen(); // GS = Game Screen
    static StartScreen StS = new StartScreen(); // StS = Start Screen
    static Scoreboard ScS = new Scoreboard(); // ScS = Scoreboard Screen

    public static void main(String[] args) {
        GS.setSize(500, 360);
        StS.setSize(500, 360);
        ScS.setSize(500, 360);
        GS.setVisible(runGameScreen);
        StS.setVisible(startingScreen);
        ScS.setVisible(scoreboardScreen);
    }

    public static void goMenu(){
        startingScreen = true;
        runGameScreen = false;
        scoreboardScreen = false;
    }

    public static void goGame(){
        startingScreen = false;
        runGameScreen = true;
        scoreboardScreen = false;
    }

    public static void goScore(){
        startingScreen = false;
        runGameScreen = false;
        scoreboardScreen = true;
    }

    public static void switchScreen(){
        GS.setVisible(runGameScreen);
        StS.setVisible(startingScreen);
        ScS.setVisible(scoreboardScreen);
    }

    public static void switchImage(){
        GS.imgChange();
    }
}
