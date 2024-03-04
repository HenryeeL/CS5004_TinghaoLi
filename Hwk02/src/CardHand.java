import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Represents a generic hand of cards or other items.
 * This class allows manipulation of items such as adding, removing, and sorting.
 * @param <C> the type of items in this hand
 */
public class CardHand<C> implements Hand<C> {

  List<C> list = new ArrayList<>();

  /**
   * Creates and returns a new, empty instance of CardHand.
   * @return a new empty CardHand.
   */
  public Hand<C> CreateHand() {
    return new CardHand<C>();
  }

  /**
   * Adds an item to the front of the hand.
   * @param c the item to add to the hand
   */
  @Override
  public void add(C c) {
    List<C> tmp = new ArrayList<>();
    tmp.add(c); // Add new item to the temporary list
    tmp.addAll(list); // Add all current items in the hand to the temporary list
    list.clear(); // Clear the current list
    list.addAll(tmp); // Add all items from temporary list back into the current list
  }

  /**
   * Removes the item at the specified index from the hand.
   * @param index the index of the item to remove
   * @throws IndexOutOfBoundsException if the index is out of range
   */
  @Override
  public void discard(int index) {
    if (index >= list.size()) {
      throw new IndexOutOfBoundsException("Index out of range");
    } else {
      list.remove(index);
    }
  }

  /**
   * Retrieves the item at the specified index from the hand.
   * @param index the index of the item to retrieve
   * @return the item at the specified index
   * @throws IndexOutOfBoundsException if the index is out of range
   */
  @Override
  public C get(int index) {
    if (index >= list.size()) {
      throw new IndexOutOfBoundsException("Index out of range");
    } else {
      return list.get(index);
    }
  }

  /**
   * Returns the number of items currently in the hand.
   * @return the number of items in the hand
   */
  @Override
  public int getSize() {
    return list.size();
  }

  /**
   * Checks if the hand is empty.
   * @return true if the hand is empty; false otherwise
   */
  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  /**
   * Finds the index of the first item in the hand that is equal to the specified item.
   * @param c the item to find in the hand
   * @return the index of the first item equal to the specified item, or -1 if not found
   */
  @Override
  public int find(C c) {
    return list.indexOf(c);
  }

  /**
   * Sorts the hand according to the order induced by the specified comparator.
   * @param comparator the comparator to determine the order of the items
   */
  @Override
  public void sortHand(Comparator<C> comparator) {
    Collections.sort(list, comparator);
  }

  /**
   * Returns a subset of the hand that matches the given predicate.
   * @param predicate the condition to test the items
   * @return a new hand containing only the items that match the predicate
   */
  @Override
  public Hand<C> getHand(Predicate<C> predicate) {
    Hand<C> newCardSet = CreateHand();
    for (C c : list) {
      if (predicate.test(c)) {
        newCardSet.add(c);
      }
    }
    return newCardSet;
  }

  /**
   * Returns the sum of the ranks of the items in the hand, assuming the items are of type Card.
   * @return the sum of the ranks of the items in the hand
   */
  @Override
  public int rankSum() {
    int sum = 0;
    for (C c : list) {
      if (c instanceof Card) {
        sum += ((Card) c).getRank();
      }
    }
    return sum;
  }

  /**
   * Applies a specified function to each item in the hand and returns a new hand with the results.
   * @param function the function to apply to each item
   * @param <T> the type of items in the resulting hand
   * @return a new hand containing the results of applying the function to each item in the original hand
   */
  @Override
  public <T> Hand<T> getMap(Function<C, T> function) {
    Hand<T> handMap = new CardHand<T>();
    for (C c : list) {
      handMap.add(function.apply(c));
    }
    return handMap;
  }
}
