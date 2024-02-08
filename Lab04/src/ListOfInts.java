public interface ListOfInts {

  /**
   * Adds data to the front of the list.
   *
   * @param data the data to add to the front
   * @return a new list instance with the data added at the front
   */
  ListOfInts prepend(int data);

  /**
   * Adds data to the back of the list.
   *
   * @param data the data to add to the back
   * @return a new list instance with the data added at the back
   */
  ListOfInts append(int data);

  /**
   * Inserts data to become the specified index's element, shifting subsequent elements one position.
   *
   * @param data  the data to be inserted
   * @param index the position at which to insert the data
   * @return a new list instance with the data inserted at the specified index
   */
  ListOfInts insertAtIndex(int data, int index);

  /**
   * Retrieves the data at the specified index.
   *
   * @param index the index of the data to retrieve
   * @return the data at the specified index
   * @throws IndexOutOfBoundsException if the index is out of bounds
   */
  int getDataAtIndex(int index);

  /**
   * Returns a list of all elements except the first.
   *
   * @return a new list instance containing all elements except the first
   * @throws IllegalStateException if the list is empty
   */
  ListOfInts getRest();

  /**
   * Returns the number of elements in the list.
   *
   * @return the length of the list
   */
  int getCount();

  /**
   * Calculates the sum of all elements in the list.
   *
   * @return the sum of the elements in the list
   */
  int getSum();
}
