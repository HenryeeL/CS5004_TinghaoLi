// Manages the interaction between the game's model and view.
// This class acts as an intermediary, processing user input and updating the game state and display.
public class Controller {
  // The game's model, containing the business logic and state.
  private Model model;
  // The game's view, responsible for displaying the game state to the user.
  private View view;

  // Constructs a Controller with the specified model and view.
  // @param model the game's model, handling the logic and state
  // @param view the game's view, responsible for display
  public Controller(Model model, View view) {
    this.model = model;
    this.view = view;
  }

  // Processes user input and updates the game state and view accordingly.
  // @param direction the direction in which the snake should move
  public void handleInput(Direction direction) {
    // Update the model based on the user input
    model.moveSnake(direction);
    // Redraw the board to reflect the current game state
    view.drawBoard(model.getBoard());
    // Check if the game is over and handle the game over scenario
    if (model.isGameOver()) {
      // Handle game over logic here (e.g., display game over screen)
    }
  }
}
