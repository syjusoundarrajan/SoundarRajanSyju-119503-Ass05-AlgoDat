
public class LineSegment {
	float m, c;
Point first, last;
boolean VerLine; 
 
  
 public LineSegment(Point first, Point last) {
  this.first = first;
  this.last = last;
  //set isVertical, which indicates whether this Line 
  //is vertical or not on the coordinate plane
  if (first.x == last.x) {
	  VerLine = true;}
  else {
	  VerLine = false;}
   
  //set slope and intercept
  if (!VerLine){
   m = (first.y - last.y) / (first.x - last.x);
   c = (last.x * first.y - first.x * last.y ) /(first.x - last.x); 
  }
  else {
   m = Float.MAX_VALUE;
   c = - Float.MAX_VALUE;
  }
 }
}
