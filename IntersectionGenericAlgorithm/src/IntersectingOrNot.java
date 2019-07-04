
public class IntersectingOrNot {
 
	public static void main(String[] args) {
		   
		//My main method which is Testing with different line inputs made by the below points 
		 IntersectingOrNot inputpointforlines = new IntersectingOrNot(4, 3, 2, 1, 1, 4, 5, 2);
	  boolean yesrno = inputpointforlines.Intersects();
	  System.out.println("The lines made by the above points intersects = " + yesrno);
	  if(yesrno==true){
		  System.out.println("The lines made by the above points are intersecting");
	  }
	  else {
		  System.out.println("The lines made by the above points are not intersecting");
	  }
	 }
	
 LineSegment Line1, Line2;
 Boolean Intersects;
  
IntersectingOrNot(LineSegment Line1, LineSegment Line2){
  this.Line1 = Line1;
  this.Line2 = Line2;
 }
  
IntersectingOrNot(float x1, float y1, float x2, float y2,
  float x3, float y3, float x4, float y4){
  Point first1 = new Point(x1, y1), last1 = new Point(x2, y2);
  this.Line1 = new LineSegment(first1, last1);
  Point first2 = new Point(x3, y3), last2 = new Point(x4, y4); 
  this.Line2 = new LineSegment(first2, last2);
 }
  
//All the required boolean condition for the implementation of my algorithm
 public boolean Intersects(){
  if (Intersects != null) {
   return Intersects;}
   
  if (Line1.VerLine){
   if ( (Line2.first.x - Line1.first.x)*(Line2.last.x - Line1.first.x) > 0 ) {
	   Intersects = false;}
   else {
    float Line1start = Line1.m * Line1.first.x + Line1.c;
    float klein, gross;
    if (Line1.first.x < Line1.last.x ){
    	klein = Line1.first.x;gross = Line1.last.x; 
    }
    else {
    	gross = Line1.first.x;klein = Line1.last.x;
    }
    //Took ref from http://moderntone.blogspot.com/ for understanding some these inplementations
    if (klein <= Line1start && Line1start <= gross) {
    	Intersects = true;}
    else {
    	Intersects = false;}
   }
  }
  else if (Line2.VerLine){
	  Intersects = new IntersectingOrNot(Line2, Line1).Intersects();
  }
  else { 
   if (Line1.m == Line2.m) {
	   Intersects = false;}
   else {
    float x1 = Line1.first.x, y1 = Line1.first.y, x2 = Line1.last.x,y2 = Line1.last.y,x3 = Line2.first.x,y3 = Line2.first.y,x4 = Line2.last.x,y4 = Line2.last.y;
   //Formula calculates the value using which we can find whether the lines intersects or not by the help of if-else conditions
    float x = ((x4*y3-y4*x3)/(x4-x3) - (x2*y1-y2*x1)/(x2-x1))
      /( (y2-y1)/(x2-x1) - (y4-y3)/(x4-x3));
     
    float klein, gross;
    if (x1 < x2){
    	klein = x1; gross = x2;
    }
    else {
    	klein = x2; gross = x1;
    }
    if (klein <= x && x <= gross) {
    	Intersects = true;}
    else {
    	Intersects = false; }
   } 
  }
  return Intersects;
 }
   
  
 
}
