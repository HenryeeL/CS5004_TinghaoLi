import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shape> {

  /**
   * compare the shape by perimeter
   * @param o1 the first object to be compared.
   * @param o2 the second object to be compared.
   * @return
   */
  @Override
  public int compare(Shape o1, Shape o2) {
    return Double.compare(o1.getPerimeter(), o2.getPerimeter());
  }
}
