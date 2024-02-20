/**
 * Represents a shoe with attributes: type, color, brand, and size.
 */
public class Shoe {

  private String type;
  private String color;
  private String brand;
  private double size;

  /**
   * Constructor for Shoe.
   *
   * @param type  Shoe type (e.g., "sneakers", "boots")
   * @param color Shoe color
   * @param brand Shoe brand
   * @param size  Shoe size
   */
  public Shoe(String type, String color, String brand, double size) {
    this.type = type;
    this.color = color;
    this.brand = brand;
    this.size = size;
  }

  // Getters
  public String getType() {
    return type;
  }

  public String getColor() {
    return color;
  }

  public String getBrand() {
    return brand;
  }

  public double getSize() {
    return size;
  }

  /**
   * Returns string representation of Shoe.
   *
   * @return Shoe as string
   */
  @Override
  public String toString() {
    return "Shoe{" +
        "type='" + type + '\'' +
        ", color='" + color + '\'' +
        ", brand='" + brand + '\'' +
        ", size=" + size +
        '}';
  }
}
