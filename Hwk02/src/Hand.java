import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Represents the interface for a hand of cards or other items.
 * This interface defines methods for manipulating and querying the hand.
 * @param <C> the type of elements in the hand
 */
public interface Hand<C> {

  /**
   * Creates and returns a new, empty hand.
   * @return a new instance of an empty hand
   */
  Hand<C> CreateHand();

  /**
   * Adds an element to the front of the hand.
   * @param c the element to be added to the hand
   */
  void add(C c);

  /**
   * Removes the element at the specified index from the hand.
   * @param index the index of the element to remove
   */
  void discard(int index);

  /**
   * Retrieves the element at the specified index from the hand.
   * @param index the index of the element to retrieve
   * @return the element at the specified index in the hand
   */
  C get(int index);

  /**
   * Returns the number of elements currently in the hand.
   * @return the number of elements in the hand
   */
  int getSize();

  /**
   * Checks if the hand is empty.
   * @return true if the hand is empty, otherwise false
   */
  boolean isEmpty();

  /**
   * Finds and returns the index of the first element in the hand that is equal to the specified element.
   * @param c the element to find in the hand
   * @return the index of the first occurrence of the element in the hand, or -1 if not found
   */
  int find(C c);

  /**
   * Sorts the elements of the hand according to the order induced by the specified comparator.
   * @param comparator the comparator to determine the order of the elements
   */
  void sortHand(Comparator<C> comparator);

  /**
   * Returns a new hand consisting of the elements that match the given predicate.
   * @param predicate the condition to apply to each element for inclusion in the new hand
   * @return a new hand containing only the elements that match the given predicate
   */
  Hand<C> getHand(Predicate<C> predicate);

  /**
   * Calculates and returns the sum of the ranks of the elements in the hand, assuming the elements have ranks.
   * @return the total sum of the ranks of the elements in the hand
   */
  int rankSum();

  /**
   * Applies a function to each element in the hand and returns a new hand containing the results.
   * @param function the function to apply to each element
   * @param <T> the type of the elements in the new hand
   * @return a new hand resulting from applying the specified function to each element in the original hand
   */
  <T> Hand<T> getMap(Function<C, T> function);
}
