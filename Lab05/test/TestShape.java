
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestShape {
  Shape circle = new Circle(0.0, 0.0, 5.0);
  Shape rectangle = new Rectangle(1.0, 1.0 , 4.0, 5.0);
  Shape triangle = new Triangle(0.0, 0.0, 0.0, 3.0, 4.0, 0.0);

  /**
   * test the area of circle
   */
  @Test
  public void testAreaOfCircle() {
    assertEquals(78.53981, circle.getArea(), 0.001);
  }

  /**
   * test the area of rectangle
   */
  @Test
  public void testAreaOfRectangle() {
    assertEquals(20.0, rectangle.getArea(), 0.001);

  }

  /**
   * test the area of triangle
   */
  @Test
  public void testAreaOfTriangle() {
    assertEquals(6.0, triangle.getArea(),0.001);
  }

  /**
   * test the perimeter of circle
   */
  @Test
  public void testPerimeterOfCircle() {
    assertEquals(31.4159, circle.getPerimeter(), 0.001);
  }

  /**
   * test the perimeter of rectangle
   */
  @Test
  public void testPerimeterOfRectangle() {
    assertEquals(18.0, rectangle.getPerimeter(), 0.001);
  }

  /**
   * test the perimeter of triangle
   */
  @Test
  public void testPerimeterOfTriangle() {
    assertEquals(12.0, triangle.getPerimeter(), 0.001);
  }

  /**
   * test if the new triangle is legal
   */
  @Test(expected = IllegalArgumentException.class)
  public void testTriangleIsLegal() {
    Shape triangle2 = new Triangle(0.0, 0.0, 0.0, 0.0, 1.0, 1.0);
  }

}
