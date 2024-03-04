import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the CardHand class.
 */
public class TestHand {
  // Test cards setup
  Card card1 = new Card(Suit.DIAMONDS, 5);
  Card card2 = new Card(Suit.CLUBS, 10);
  Card card3; // Will be used for dynamic testing
  CardHand<Card> cardHand = new CardHand<>();
  CardHand<Card> cardHand2 = new CardHand<>();

  /**
   * Sets up the environment for testing: adds predefined cards to the card hand.
   */
  @Before
  public void init() {
    // Initialize the hand with two cards
    cardHand.add(card2);
    cardHand.add(card1);
  }

  /**
   * Tests the constructor for creating a new card without throwing an exception.
   */
  @Test
  public void testConstructor1() {
    card3 = new Card(Suit.HEARTS, 12); // Valid card creation
  }

  /**
   * Tests the constructor for exception handling when an invalid rank is provided.
   */
  @Test(expected = IndexOutOfBoundsException.class)
  public void testConstructor2() {
    card3 = new Card(Suit.HEARTS, 14); // Should throw IndexOutOfBoundsException
  }

  /**
   * Tests adding cards to the hand and ensures they are added in the correct order.
   */
  @Test
  public void testAdd() {
    // Add additional cards to the hand and check the order
    cardHand.add(card2);
    cardHand.add(card1);
    assertEquals(card1, cardHand.get(0));
    assertEquals(card2, cardHand.get(1));
  }

  /**
   * Tests the discard functionality by removing cards from the hand.
   */
  @Test
  public void testDiscard() {
    // Discard a card and check if the remaining card is correct
    cardHand.discard(0);
    assertEquals(card2, cardHand.get(0));
    cardHand.discard(0);
    assertTrue(cardHand.isEmpty()); // The hand should be empty after discarding all cards
  }

  /**
   * Tests the discard method's exception handling when an invalid index is used.
   */
  @Test(expected = IndexOutOfBoundsException.class)
  public void testDiscardWithException() {
    // Discarding non-existing indexes should throw IndexOutOfBoundsException
    cardHand.discard(3); // No third element exists
  }

  /**
   * Tests the get method for retrieving cards at specific indexes.
   */
  @Test
  public void testGet1() {
    assertEquals(card1, cardHand.get(0));
    assertEquals(card2, cardHand.get(1));
  }

  /**
   * Tests the get method's exception handling when an invalid index is used.
   */
  @Test(expected = IndexOutOfBoundsException.class)
  public void testGetWithException() {
    // Accessing non-existing indexes should throw IndexOutOfBoundsException
    cardHand.get(10); // No such element
  }

  /**
   * Tests the size method to ensure it returns the correct number of cards in the hand.
   */
  @Test
  public void testSize() {
    assertEquals(2, cardHand.getSize());
    cardHand.add(new Card(Suit.SPADES, 6)); // Add one more card
    assertEquals(3, cardHand.getSize());
  }

  /**
   * Tests whether the isEmpty method correctly identifies an empty or non-empty hand.
   */
  @Test
  public void testEmpty() {
    assertTrue(cardHand2.isEmpty()); // Initially empty
    assertFalse(cardHand.isEmpty()); // Should contain cards after initialization
  }

  /**
   * Tests the find method to locate the position of a card in the hand.
   */
  @Test
  public void testFind() {
    assertEquals(-1, cardHand.find(new Card(Suit.CLUBS, 5))); // Card not present
    assertEquals(-1, cardHand.find(new Card(Suit.DIAMONDS, 10))); // Card not present
  }

  /**
   * Tests sorting the hand by suit using a custom comparator.
   */
  @Test
  public void testSortHand() {
    CompareBySuit comparator = new CompareBySuit(); // Custom suit comparator
    cardHand.sortHand(comparator); // Sort the hand by suit
    assertEquals(card2, cardHand.get(0)); // Clubs should come before Diamonds
    assertEquals(card1, cardHand.get(1));
  }

  /**
   * Tests filtering the hand based on a predicate condition.
   */
  @Test
  public void testGetHand() {
    Predicate<Card> predicate = card -> card.getRank() > 6; // Condition for filtering
    Hand<Card> filteredHand = cardHand.getHand(predicate);
    assertEquals(card2, filteredHand.get(0)); // Only card2 satisfies the condition
  }

  /**
   * Tests the calculation of the total rank sum of the cards in the hand.
   */
  @Test
  public void testRankSum() {
    assertEquals(15, cardHand.rankSum()); // Initial sum of ranks
    cardHand.add(new Card(Suit.HEARTS, 6)); // Add another card
    assertEquals(21, cardHand.rankSum()); // Updated sum of ranks
  }

  /**
   * Tests mapping each card in the hand to another value using a function.
   */
  @Test
  public void testGetMap() {
    Function<Card, Suit> suitFunction = Card::getSuit; // Function to map card to its suit
    Hand<Suit> suitHand = cardHand.getMap(suitFunction);
    assertEquals(Suit.CLUBS, suitHand.get(0));
    assertEquals(Suit.DIAMONDS, suitHand.get(1));
  }

}
