// Defines the contract for the game's view in a Model-View-Controller (MVC) architecture.
// The View interface is responsible for displaying the game state to the user.
// Implementations of this interface will render the game board and its components.
public interface View {
  // Draws the game board on the screen or other output device.
  // This method is responsible for visually representing the current state of the game,
  // including the placement of the snake, any obstacles, and other relevant elements.
  // @param board the game board to draw, containing all elements of the game's current state
  void drawBoard(Board board);
}
