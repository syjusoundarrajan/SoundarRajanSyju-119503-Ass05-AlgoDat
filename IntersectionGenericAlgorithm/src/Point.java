
public class Point {

 float x,y;
  Point(float x, float y) {
  this.x = x;
  this.y = y;
 }
  public String toString() {
      return String.format("{%f, %f}", x, y);
  }
}
