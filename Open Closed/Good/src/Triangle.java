public class Triangle implements IShape {
  private int base;
  private int height;

  public Triangle(int base, int height) {
    setBase(base);
    setHeight(height);
  }

  public void setBase(int base) {
    this.base = base;
  }
    
  public int getBase() {
    return base;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  @Override 
  public float getArea() {
    return 0.5f * getBase() * getHeight();
  }
}
