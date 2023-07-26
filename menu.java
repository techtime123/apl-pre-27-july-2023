import javax.swing.*;

public class menu {
    public static void  main(String[] args) {
        JFrame frame = new MenuFrame();
        frame.setTitle("MenuFrameTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame = new FontFrame();
        frame.setTitle("FontFrameTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame = new CircleLayoutFrame();
        frame.setTitle("CircleLayout.java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);    }
}
