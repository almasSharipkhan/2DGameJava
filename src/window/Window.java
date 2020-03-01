package window;

import javax.swing.JFrame;
import java.awt.Dimension;

public class Window {
    public Window(int width, int height, String title, Game game) {
        JFrame jFrame = new JFrame(title);

        Dimension dimension = new Dimension(width, height);

        jFrame.setPreferredSize(dimension);
        jFrame.setMaximumSize(dimension);
        jFrame.setMinimumSize(dimension);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.add(game);
        jFrame.setVisible(true);
    }
}
