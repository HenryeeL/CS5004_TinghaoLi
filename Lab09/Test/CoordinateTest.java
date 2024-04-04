import static org.junit.Assert.*;
import org.junit.Test;

public class CoordinateTest {

  @Test
  public void testCoordinateConstructor() {
    Coordinate coordinate = new Coordinate(5, 10);
    assertEquals(5, coordinate.x);
    assertEquals(10, coordinate.y);
  }

  @Test
  public void testEquals() {
    Coordinate coord1 = new Coordinate(5, 10);
    Coordinate coord2 = new Coordinate(5, 10);
    Coordinate coord3 = new Coordinate(10, 5);

    assertTrue(coord1.equals(coord2));
    assertFalse(coord1.equals(coord3));
  }
}
