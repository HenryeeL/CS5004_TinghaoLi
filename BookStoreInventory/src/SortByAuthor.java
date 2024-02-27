import java.util.Comparator;

/**
 * A functional class that can be passed as a parameter to list.sort()
 * <p>
 * Uses Comparable<T> built-in interface and return value conventions
 */
public class SortByAuthor implements Comparator<BookStoreItem> {

  /**
   * Implements Comparator for BookStoreItem as alphabetical by author last name
   * <p>
   * @param pub1 the first BookStoreItem to be compared
   * @return int: -1 if pub1 < pub2, 0 if equals, +1 if pub1 > pub2
   * Relies on natural (lexicographic) built-in order for String
   */
  @Override
  public int compare(BookStoreItem pub1, BookStoreItem pub2) {
    Person author1 = pub1.getAuthor();
    Person author2 = pub2.getAuthor();
    if (author1 == null && author2 == null) return 0; // Both are null, treat as equal
    if (author1 == null) return -1; // Treat null as less than any non-null value
    if (author2 == null) return 1;  // Treat non-null as greater than null

    String lastName1 = author1.getLastName();
    String lastName2 = author2.getLastName();
    if (lastName1 == null && lastName2 == null) return 0; // Both last names are null, treat as equal
    if (lastName1 == null) return -1; // Treat null as less than any non-null value
    if (lastName2 == null) return 1;  // Treat non-null as greater than null

    return lastName1.compareTo(lastName2);
  }
    //  FlawFound: compare method does not handle null cases for authors
    //  FlawFixToDo: Add null checks for authors before comparing
    //  FlawFixed: Added null checks for authors before comparing
  }
