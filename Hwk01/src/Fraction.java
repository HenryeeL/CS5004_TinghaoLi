/**
 * Interface to represent a fraction with a numerator and a positive integer denominator.
 */
public interface Fraction {

  /**
   * Returns the numerator of this fraction.
   * @return the numerator.
   */
  int getNumerator();

  /**
   * Sets the numerator of this fraction.
   * @param numerator the numerator to set.
   */
  void setNumerator(int numerator);

  /**
   * Returns the denominator of this fraction.
   * @return the denominator.
   */
  int getDenominator();

  /**
   * Sets the denominator of this fraction.
   * @param denominator the positive denominator to set.
   * @throws IllegalArgumentException if the denominator is not positive.
   */
  void setDenominator(int denominator) throws IllegalArgumentException;

  /**
   * Returns the decimal/scientific value of this fraction.
   * @return the double representation of this fraction.
   */
  double toDouble();

  /**
   * Returns the reciprocal of this fraction.
   * @return the reciprocal fraction.
   * @throws ArithmeticException if the numerator is zero.
   */
  Fraction reciprocal() throws ArithmeticException;

  /**
   * Adds another fraction to this fraction and returns the result.
   * @param other the fraction to add.
   * @return the sum of this fraction and the other.
   */
  Fraction add(Fraction other);

  /**
   * Compares this fraction with another fraction.
   * @param other the fraction to compare with.
   * @return a negative integer, zero, or a positive integer as this fraction
   * is less than, equal to, or greater than the specified fraction.
   */
  int compareTo(Fraction other);
}
