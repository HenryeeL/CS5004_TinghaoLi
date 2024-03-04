import java.util.Objects;

/**
 * Represents a playing card with a suit and a numerical rank.
 */
public class Card implements Comparable<Card> {
  private Suit suit; // The suit of the card, e.g., hearts, diamonds, spades, or clubs.
  private int rank; // The rank of the card, from 1 (Ace) to 13 (King).

  /**
   * Constructs a Card instance with the specified suit and rank.
   *
   * @param suit the suit of the card, cannot be null.
   * @param rank the rank of the card, must be between 1 and 13 inclusive.
   * @throws IndexOutOfBoundsException if the rank is not within the valid range.
   */
  public Card(Suit suit, int rank) {
    if (rank < 1 || rank > 13) {
      throw new IndexOutOfBoundsException("Rank must be between 1 and 13.");
    }
    this.suit = suit;
    this.rank = rank;
  }

  /**
   * Returns the suit of this card.
   *
   * @return the suit of this card.
   */
  public Suit getSuit() {
    return suit;
  }

  /**
   * Returns the rank of this card.
   *
   * @return the rank of this card.
   */
  public int getRank() {
    return rank;
  }

  /**
   * Returns the color associated with this card's suit.
   *
   * @return the color of this card, either BLACK or RED.
   */
  public Color getColor() {
    return (suit == Suit.CLUBS || suit == Suit.SPADES) ? Color.BLACK : Color.RED;
  }

  /**
   * Compares this card with another card for equality based on suit and rank.
   *
   * @param o the object to compare with this card.
   * @return true if the specified object is a card with the same rank and suit, false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Card card)) return false;
    return rank == card.rank && suit == card.suit;
  }

  /**
   * Returns a hash code value for this card based on its suit and rank.
   *
   * @return a hash code value for this card.
   */
  @Override
  public int hashCode() {
    return Objects.hash(suit, rank);
  }

  /**
   * Returns a string representation of this card, including its suit and rank.
   *
   * @return a string representation of this card.
   */
  @Override
  public String toString() {
    return "Card{" + "suit=" + suit + ", rank=" + rank + '}';
  }

  /**
   * Compares this card with another card for order based on rank.
   *
   * @param o the card to be compared.
   * @return a negative integer, zero, or a positive integer as this card is less than, equal to, or greater than the specified card.
   */
  @Override
  public int compareTo(Card o) {
    return Integer.compare(rank, o.getRank());
  }
}
