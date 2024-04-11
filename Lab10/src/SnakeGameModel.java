// Concrete implementation of the Model interface for the Snake game.
// This class encapsulates the game's state, including the board, the snake, and the game over status.
public class SnakeGameModel implements Model {
  // The game board containing the cells on which the snake moves.
  private Board board;
  // The snake controlled by the player.
  private Snake snake;
  // Flag indicating whether the game is over.
  private boolean gameOver;

  // Initializes a new Snake game model with a specified board size.
  // @param width the width of the game board
  // @param height the height of the game board
  public SnakeGameModel(int width, int height) {
    this.board = new Board(width, height);
    this.snake = new Snake();
    this.gameOver = false;
  }

  // Moves the snake in the specified direction and updates the game state.
  // This method handles the logic for snake movement, collision detection, and game over conditions.
  // @param direction the direction to move the snake
  @Override
  public void moveSnake(Direction direction) {
    // Implementation of snake movement logic
    // Check for collision with walls or itself
    // Update the gameOver flag if necessary
  }

  // Checks if the game is over.
  // @return true if the game is over, otherwise false
  @Override
  public boolean isGameOver() {
    return gameOver;
  }

  // Gets the current state of the game board.
  // @return the game board
  @Override
  public Board getBoard() {
    return board;
  }
}
