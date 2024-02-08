public class ElementNode implements ListOfInts {
  private int data;
  private ListOfInts rest;

  /**
   * Constructs a new element node with the specified data and rest of the list.
   *
   * @param data the data for this node
   * @param rest the rest of the list after this node
   */
  public ElementNode(int data, ListOfInts rest) {
    this.data = data;
    this.rest = rest;
  }

  /**
   * Prepends the specified data to the front of the list.
   *
   * @param data the data to prepend
   * @return a new list with the data added to the front
   */
  @Override
  public ListOfInts prepend(int data) {
    return new ElementNode(data, this);
  }

  /**
   * Appends the specified data to the back of the list.
   *
   * @param data the data to append
   * @return the original list with the data added to the back
   */
  @Override
  public ListOfInts append(int data) {
    this.rest = this.rest.append(data);
    return this;
  }

  /**
   * Inserts the specified data at the given index in the list. If the index
   * is 0, the data is inserted before the current first element.
   *
   * @param data  the data to insert
   * @param index the position at which to insert the data
   * @return the original list with the data inserted
   */
  @Override
  public ListOfInts insertAtIndex(int data, int index) {
    if (index == 0) {
      return new ElementNode(data, this);
    } else {
      this.rest = this.rest.insertAtIndex(data, index - 1);
      return this;
    }
  }

  /**
   * Returns the data at the specified index in the list.
   *
   * @param index the index of the data to return
   * @return the data at the specified index
   * @throws IndexOutOfBoundsException if the index is out of bounds
   */
  @Override
  public int getDataAtIndex(int index) {
    if (index == 0) {
      return this.data;
    } else {
      return this.rest.getDataAtIndex(index - 1);
    }
  }

  /**
   * Returns a list of all elements except the first.
   *
   * @return the rest of the list excluding the first element
   */
  @Override
  public ListOfInts getRest() {
    return this.rest;
  }

  /**
   * Returns the number of elements in the list.
   *
   * @return the count of elements in the list
   */
  @Override
  public int getCount() {
    return 1 + this.rest.getCount();
  }

  /**
   * Returns the sum of all elements in the list.
   *
   * @return the sum of elements in the list
   */
  @Override
  public int getSum() {
    return this.data + this.rest.getSum();
  }

  /**
   * Returns a string representation of the list.
   *
   * @return a string representation of the list
   */
  @Override
  public String toString() {
    return "ElementNode{" +
        "data=" + data +
        ", rest=" + rest +
        '}';
  }
}
