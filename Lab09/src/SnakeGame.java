import java.awt.Dimension;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The {@code SnakeGame} class is the entry point for a simple snake game application.
 * This class sets up the game window and starts the game by initializing the game's panel.
 */
public class SnakeGame {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JPanel panel = new MyPanel();
    panel.setPreferredSize(new Dimension(400, 400));
    frame.add(panel);
    frame.pack();
    // by default, everything is invisible. Make it visible
    frame.setVisible(true);
  }
}
// TEST:
//SnakeGame primarily contains the main method for starting the game and doesn't have much
// logic that can be tested in isolation. If there were more complex methods within SnakeGame,
// those could be unit tested.

//Some improvements:
//1.Enhance Game Features
//Such as adding levels of difficulty, Introduce different levels that increase the speed of the snake
// or add more obstacles as the player progresses. This can make the game more challenging and
// engaging.
//2.Detect Boundary Collisions
// Add detection in the snake's movement logic to determine if the snake's
// head touches the boundaries of the game area.
//3.Responsive Design
// Ensure the game scales correctly on different screen sizes and resolutions, providing
// a consistent experience across devices.

