public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public double getX(){
   return x;
 }

 public double getY(){
   return y;
 }

public double distanceTo(Point p){
  return Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));
}

public boolean equals (Point p){
  return this.x==p.x && this.y==p.y;
}
}
