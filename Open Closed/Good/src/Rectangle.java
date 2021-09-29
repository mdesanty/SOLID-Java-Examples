public class Rectangle implements IShape {
  private int width;
  private int length;

  public Rectangle(int width, int length) {
    setWidth(width);
    setLength(length);
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getWidth() {
    return width;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getLength() {
    return length;
  }
  
  @Override
  public float getArea() {
    return getWidth() * getLength();
  }
}
