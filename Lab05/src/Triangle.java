public class Triangle extends AbstractShape{
  private Point point1, point2, point3;
  public Triangle (double x1, double y1, double x2, double y2, double x3, double y3) throws IllegalArgumentException{
    this.point1 = new Point(x1, y1);
    this.point2 = new Point(x2, y2);
    this.point3 = new Point(x3, y3);

    if ((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x2 == x3) || (y2 ==y3)) {
      throw new IllegalArgumentException();
    }
  }

  /**
   *
   * @return the triangle's area
   */
  @Override
  public double getArea() {
    // Calculate every side of a triangle
    double a = point1.getX() - point3.getX();
    double b = point1.getY() - point3.getY();
    double c = point2.getX() - point3.getX();
    double d = point2.getY() - point3.getY();
    double e = point1.getX() - point2.getX();
    double f = point1.getY() - point2.getY();

    double side1 = Math.sqrt(a * a + b * b);
    double side2 = Math.sqrt(c * c + d * d);
    double side3 = Math.sqrt(e * e + f * f);

    // Use Herson's formula to calculate the area
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  /**
   *
   * @return the circle's perimeter
   */
  @Override
  public double getPerimeter() {
    double side1 = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
    double side2 = Math.sqrt(Math.pow(point2.getX() - point3.getX(), 2) + Math.pow(point2.getY() - point3.getY(), 2));
    double side3 = Math.sqrt(Math.pow(point3.getX() - point1.getX(), 2) + Math.pow(point3.getY() - point1.getY(), 2));

    return side1 + side2 + side3;
  }
}
