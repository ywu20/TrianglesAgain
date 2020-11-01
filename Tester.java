public class Tester{
  public static void main(String[] args){
    Point[] points = new Point[5];

    //construct points
    System.out.println("points being tested");
    for(int i=0; i<4;i++){
      points[i]= new Point(Math.random()*10, Math.random()*5);
      System.out.println(points[i]);
    }
    points[4]=points[3];

    //distanceTo() tester
    for(int i=0; i<4;i++){
      System.out.println("the distance between point "+i+" and point "+(i+1)+" is "+points[i].distanceTo(points[i+1]));
    }

    //
  }
}
