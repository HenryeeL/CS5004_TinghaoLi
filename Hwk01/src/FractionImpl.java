public class FractionImpl implements Fraction, Comparable<Fraction> {

  private int numerator;
  private int denominator;

  /**
   * Constructor for a fraction.
   * @param numerator the numerator of the fraction.
   * @param denominator the denominator of the fraction; must be positive.
   * @throws IllegalArgumentException if the denominator is not positive.
   */
  public FractionImpl(int numerator, int denominator) throws IllegalArgumentException {
    if (denominator <= 0) {
      throw new IllegalArgumentException("Denominator must be positive.");
    }
    // Ensure the fraction is in its canonical form
    int gcd = gcd(numerator, denominator);
    this.numerator = numerator / gcd;
    this.denominator = denominator / gcd;

    // Handling negative fractions
    if (this.denominator < 0) {
      this.numerator = -this.numerator;
      this.denominator = -this.denominator;
    }
  }

  @Override
  public int getNumerator() {
    return numerator;
  }

  @Override
  public void setNumerator(int numerator) {
    this.numerator = numerator;
    simplify();
  }

  @Override
  public int getDenominator() {
    return denominator;
  }

  @Override
  public void setDenominator(int denominator) throws IllegalArgumentException {
    if (denominator <= 0) {
      throw new IllegalArgumentException("Denominator must be positive.");
    }
    this.denominator = denominator;
    simplify();
  }

  @Override
  public double toDouble() {
    return (double) numerator / denominator;
  }

  @Override
  public Fraction reciprocal() throws ArithmeticException {
    if (numerator == 0) {
      throw new ArithmeticException("Cannot find reciprocal of a fraction with numerator 0.");
    }
    return new FractionImpl(denominator, numerator);
  }

  @Override
  public Fraction add(Fraction other) {
    int commonDenominator = this.denominator * other.getDenominator();
    int numeratorSum = this.numerator * other.getDenominator() + other.getNumerator() * this.denominator;
    return new FractionImpl(numeratorSum, commonDenominator);
  }

  @Override
  public int compareTo(Fraction other) {
    int lhs = this.numerator * other.getDenominator();
    int rhs = other.getNumerator() * this.denominator;
    return Integer.compare(lhs, rhs);
  }

  @Override
  public String toString() {
    return numerator + " / " + denominator;
  }

  private void simplify() {
    int gcd = gcd(this.numerator, this.denominator);
    this.numerator /= gcd;
    this.denominator /= gcd;
  }

  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}
