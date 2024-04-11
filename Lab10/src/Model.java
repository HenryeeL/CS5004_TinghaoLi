// Defines the contract for the game's model in a Model-View-Controller (MVC) architecture.
// This interface specifies the essential behaviors that the game model must implement,
// such as moving the snake, checking the game status, and retrieving the game board.
public interface Model {
  // Moves the snake in the specified direction.
  // @param direction the direction to move the snake
  void moveSnake(Direction direction);

  // Determines whether the game is over (e.g., the snake has collided with itself or a wall).
  // @return true if the game is over, false otherwise
  boolean isGameOver();

  // Retrieves the current state of the game board.
  // @return the current game board
  Board getBoard();
}
