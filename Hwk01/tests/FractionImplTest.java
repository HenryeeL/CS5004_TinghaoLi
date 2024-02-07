import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FractionImplTest {

  private Fraction fractionPositive;
  private Fraction fractionNegative;

  @Before
  public void setUp() {
    fractionPositive = new FractionImpl(3, 4); //
    fractionNegative = new FractionImpl(-3, 4); // 负分数
  }

  @Test
  public void constructorShouldHandlePositiveAndNegative() {
    assertEquals("Positive fraction not set correctly", "3 / 4", fractionPositive.toString());
    assertEquals("Negative fraction not set correctly", "-3 / 4", fractionNegative.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructorShouldThrowExceptionForZeroDenominator() {
    new FractionImpl(1, 0);
  }

  @Test
  public void setNumeratorShouldUpdateValue() {
    fractionPositive.setNumerator(5);
    assertEquals("Numerator not updated correctly", "5 / 4", fractionPositive.toString());
  }

  @Test
  public void setDenominatorShouldUpdateValueAndThrowExceptionForNonPositive() {
    fractionPositive.setDenominator(2);
    assertEquals("Denominator not updated correctly", "5 / 2", fractionPositive.toString());

    try {
      fractionPositive.setDenominator(0);
      fail("Setting denominator to zero should throw IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // Expected exception
    }
  }

  @Test
  public void toDoubleShouldReturnCorrectDecimal() {
    assertEquals("Decimal conversion not correct", 0.75, fractionPositive.toDouble(), 0.001);
    assertEquals("Decimal conversion not correct for negative", -0.75, fractionNegative.toDouble(), 0.001);
  }

  @Test
  public void reciprocalOfZeroNumeratorShouldThrowException() {
    Fraction zeroNumerator = new FractionImpl(0, 1);
    try {
      zeroNumerator.reciprocal();
      fail("Reciprocal of zero numerator should throw ArithmeticException");
    } catch (ArithmeticException e) {
      // Expected exception
    }
  }

  @Test
  public void addShouldCorrectlySumFractions() {
    Fraction sum = fractionPositive.add(fractionNegative);
    assertEquals("Fractions not added correctly", "0 / 1", sum.toString());
  }

  @Test
  public void compareToShouldCorrectlyCompareFractions() {
    Fraction smallerFraction = new FractionImpl(1, 2);
    assertTrue("CompareTo method failed", fractionPositive.compareTo(smallerFraction) > 0);
    assertTrue("CompareTo method failed", smallerFraction.compareTo(fractionPositive) < 0);
    assertEquals("CompareTo method failed for equal fractions", 0, fractionPositive.compareTo(new FractionImpl(3, 4)));
  }
}
