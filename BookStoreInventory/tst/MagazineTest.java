import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 test Class for Magazine
 */
public class MagazineTest {
  private Person pat;
  private Person john;
  private Magazine mag1;
  private Magazine mag2;
  private Magazine mag3;

  /**
   * Set up examples of  Persons and Magazines to use in testing
   */
  @Before
  public void setUp() {
    pat = new Person("Pat", "Conroy", 1948);
    john = new Person("John", "Steinbeck", 1902);
    mag1 = new Magazine("Beaches Issue", pat, 2020,
        Month.MARCH, 5.0);
    mag2 = new Magazine("Sunsets Issue", pat, 2021,
        Month.SEPTEMBER, 2.50);
    mag3 = new Magazine("The Grapes of July", john, 1939,
        Month.JULY, 2.00);
  }

  @Test
  public void testToString() {
    String expected;
    expected = "Kind: Magazine\n" +
        "Title: Beaches Issue\n" +
        "Author: Pat Conroy\n" +
        "Year: 2020\n" +
        "Month: MARCH\n" +
        "Price: 5.00";

    //  FlawFound: Incorrect string format in expected value causing test failure
    //  FlawToDo: Align the expected string format with the toString output
    //  FlawFixed: Aligned the expected string format with the toString() method output

    assertEquals(expected, mag1.toString());
    assertNotEquals(expected, mag2.toString());
  }
}