import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestListOfInts {

  @Test
  public void testPrepend() {
    // Test with EmptyNode
    ListOfInts emptyNode = new EmptyNode();
    ListOfInts listOfInts = emptyNode.prepend(10);
    assertEquals("ElementNode{data=10, rest=EmptyNode{}}", listOfInts.toString());

    // Test with ElementNode
    ListOfInts elementList = new ElementNode(10, new EmptyNode());
    elementList = elementList.prepend(5);
    assertEquals("ElementNode{data=5, rest=ElementNode{data=10, rest=EmptyNode{}}}", elementList.toString());
  }

  @Test
  public void testAppend() {
    // Test with EmptyNode
    ListOfInts emptyNode = new EmptyNode();
    ListOfInts listOfInts = emptyNode.append(10);
    assertEquals("ElementNode{data=10, rest=EmptyNode{}}", listOfInts.toString());

    // Test with ElementNode
    ListOfInts elementList = new ElementNode(10, new EmptyNode());
    elementList = elementList.append(5);
    assertEquals("ElementNode{data=10, rest=ElementNode{data=5, rest=EmptyNode{}}}", elementList.toString());
  }

  @Test
  public void testInsertAtIndex() {
    ListOfInts elementList = new ElementNode(10, new EmptyNode());
    elementList = elementList.insertAtIndex(5, 0);
    assertEquals("ElementNode{data=5, rest=ElementNode{data=10, rest=EmptyNode{}}}", elementList.toString());
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testInsertAtIndexWithException() {
    ListOfInts elementList = new ElementNode(10, new EmptyNode());
    // This should throw IndexOutOfBoundsException
    elementList.insertAtIndex(5, 5);
  }

  @Test
  public void testGetDataAtIndex() {
    ListOfInts elementList = new ElementNode(10, new EmptyNode());
    elementList = elementList.prepend(5);
    int data = elementList.getDataAtIndex(1);
    assertEquals(10, data);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testGetDataAtIndexWithException() {
    ListOfInts elementList = new ElementNode(10, new EmptyNode());
    // This should throw IndexOutOfBoundsException
    elementList.getDataAtIndex(5);
  }

  @Test
  public void testGetRest() {
    ListOfInts elementList = new ElementNode(10, new EmptyNode());
    elementList = elementList.prepend(5);
    assertEquals("ElementNode{data=10, rest=EmptyNode{}}", elementList.getRest().toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testGetRestWithException() {
    ListOfInts emptyNode = new EmptyNode();
    // This should throw IllegalStateException
    emptyNode.getRest();
  }

  @Test
  public void testGetCount() {
    ListOfInts elementList = new ElementNode(10, new EmptyNode());
    elementList = elementList.prepend(5);
    assertEquals(2, elementList.getCount());
  }

  @Test
  public void testGetSum() {
    ListOfInts elementList = new ElementNode(10, new EmptyNode());
    elementList = elementList.prepend(5);
    assertEquals(15, elementList.getSum());
  }
}
