import javax.swing.JFrame;
import Frame.Frame;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame("bai1");
        f.setSize(640, 480);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
