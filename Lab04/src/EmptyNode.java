public class EmptyNode implements ListOfInts {

  /**
   * Constructor for an empty node. Represents the end of the list.
   */
  public EmptyNode() {
  }

  /**
   * Adds data to the front of the list.
   *
   * @param data the data to add to the front
   * @return a new list with the data added
   */
  @Override
  public ListOfInts prepend(int data) {
    return new ElementNode(data, this);
  }

  /**
   * Adds data to the back of the list. For an empty node, this is equivalent to prepend.
   *
   * @param data the data to add to the back
   * @return a new list with the data added
   */
  @Override
  public ListOfInts append(int data) {
    return new ElementNode(data, this);
  }

  /**
   * Inserts data at the specified index in the list. For an empty node, only index 0 is valid.
   *
   * @param data  the data to be inserted
   * @param index the position at which to insert the data
   * @return a new list with the data inserted
   * @throws IndexOutOfBoundsException if the index is not 0
   */
  @Override
  public ListOfInts insertAtIndex(int data, int index) {
    if (index != 0) {
      throw new IndexOutOfBoundsException("Index out of bounds.");
    }
    return new ElementNode(data, this);
  }

  /**
   * Attempts to get data at a specified index. Always throws an exception as there is no data in an empty node.
   *
   * @param index the index of the data
   * @return nothing as it always throws an exception
   * @throws IndexOutOfBoundsException to indicate that the index is out of bounds
   */
  @Override
  public int getDataAtIndex(int index) {
    throw new IndexOutOfBoundsException("Index out of bounds.");
  }

  /**
   * Returns the rest of the list after this node. Always throws an exception as there is no rest in an empty node.
   *
   * @return nothing as it always throws an exception
   * @throws IllegalStateException to indicate that there is no rest of the list
   */
  @Override
  public ListOfInts getRest() {
    throw new IllegalStateException("No rest of the list.");
  }

  /**
   * Returns the length of the list, which is 0 for an empty node.
   *
   * @return the length of the list, 0 for this implementation
   */
  @Override
  public int getCount() {
    return 0;
  }

  /**
   * Returns the sum of the elements in the list, which is 0 for an empty node.
   *
   * @return the sum of the elements in the list, 0 for this implementation
   */
  @Override
  public int getSum() {
    return 0;
  }

  /**
   * Provides a string representation of the empty node.
   *
   * @return a string representation of the empty node
   */
  @Override
  public String toString() {
    return "EmptyNode{}";
  }
}
