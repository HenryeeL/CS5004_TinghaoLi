/**
 * The {@code Coordinate} class represents a coordinate point in a 2D space.
 * This class is used to store and manage x and y positions.
 */
public class Coordinate {
  /**
   * Constructs a new {@code Coordinate} with specified x and y values.
   *
   * @param x the x-coordinate value
   * @param y the y-coordinate value
   */
  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  int x;
  int y;

  /**
   * Compares this {@code Coordinate} with the specified object for equality.
   * The result is {@code true} if and only if the argument is not {@code null}
   * and is a {@code Coordinate} object that has the same x and y values as this object.
   *
   * @param obj the object to compare this {@code Coordinate} against
   * @return {@code true} if the given object represents a {@code Coordinate}
   *         equivalent to this coordinate, {@code false} otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Coordinate) {
      Coordinate other = (Coordinate) obj;
      return other.x == this.x && other.y == this.y;
    }

    return false;
  }
}
