/**
 * This Abstract Class provides fields/methods shared by all BookStoreItems
 */
public abstract class AbstractBookStoreItem implements BookStoreItem {

  // Fields shared by all BookStoreItems
  protected String title;
  protected Person author;
  protected int year;
  protected double price;

  public AbstractBookStoreItem(String title, Person author, int year, double price) {
    this.title = title;
    this.author = author;
    this.year = year;
    this.price = price;
  }

  /**
   * Gets the title of this BookStoreItem
   * <p>
   *
   * @return String, representing the title of this BookStoreItem
   */
  @Override
  public String getTitle() {
    return this.title;
  }

  /**
   * Gets the publication year of this BookStoreItem
   * <p>
   *
   * @return int, representing the year this was published
   */
  @Override
  public int getYear() {
    return this.year;
  }

  /**
   * Return the author of this BookStoreItem
   * <p>
   *
   * @return the author, a person
   */
  @Override
  public Person getAuthor() {
    return this.author;
  }

  /**
   * Return the price of this BookStoreItem
   *
   * @return double, representing the price of this BookStoreItem in US dollars
   */
  @Override
  public double getPrice() {
    return this.price;
  }

  //  FlawFound: The return type of the getPrice() does not match the interface's
  //  FlawFixToDo: Change the return type
  //  FlawFixed: Changed the return type from float to double


  /**
   * SHARED method for returning the kind of BookStoreItem as a String
   * <p>
   *
   * @return String, based on the name of the subClass Examples return values would include "Book"
   * or "Magazine
   * <p>
   * This method is inherited by all subclasses of AbstractBookStoreItem It is marked final since it
   * should not be overridden
   * <p>
   * (Students are not expected to be familiar with HOW this works)
   */
  @Override
  public final String kind() {
    return this.getClass().getName();
  }
}
