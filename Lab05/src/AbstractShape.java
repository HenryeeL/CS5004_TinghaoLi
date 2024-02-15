public abstract class AbstractShape implements Shape {
  private final Point referencePoint = new Point(0,0);

  /**
   * Compare the shape by area
   * @param other the object to be compared.
   * @return
   */
  @Override
  public int compareTo(Shape other) {
    return Double.compare(this.getArea(), other.getArea());
  }
}
