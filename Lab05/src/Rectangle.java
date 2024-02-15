public class Rectangle extends AbstractShape{
  private double x,y;
  private double width, length;

  public Rectangle(double x, double y, double width, double length) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.length = length;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getWidth() {
    return width;
  }

  public double getLength() {
    return length;
  }
  /**
   *
   * @return the rectangle's area
   */
  @Override
  public double getArea() {
    return width * length;
  }

  /**
   *
   * @return the circle's perimeter
   */
  @Override
  public double getPerimeter() {
    return 2 * (width + length);
  }
}
