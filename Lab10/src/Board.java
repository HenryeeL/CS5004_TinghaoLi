// Represents the game board in a grid-based game.
// This class holds information about the size of the board.
public class Board {
  // Width of the game board in units (e.g., tiles or cells).
  int width;

  // Height of the game board in units (e.g., tiles or cells).
  int height;

  // Constructs a new game board with the specified dimensions.
  // @param width the width of the board in units, must be positive.
  // @param height the height of the board in units, must be positive.
  public Board(int width, int height) {
    this.width = width;
    this.height = height;
  }
}
