// The entry point of the Snake game application.
// This class initializes the game's components and starts the game loop.
public class Main {
  public static void main(String[] args) {
    // Initialize the model for the Snake game with a 10x10 board.
    Model model = new SnakeGameModel(10, 10);

    // Initialize the view for the Snake game, setting System.out as the output stream for drawing the board.
    View view = new SnakeGameView(System.out);

    // Initialize the controller, linking the model and view to handle the game logic and updates.
    Controller controller = new Controller(model, view);

    // Start the game loop or event handling here (not shown in the code snippet).
  }
}
