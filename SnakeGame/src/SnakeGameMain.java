import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SnakeGameMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple snake Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            SnakeGame game = new SnakeGame();
            frame.add(game);

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
