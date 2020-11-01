public class Tester{
  public static void main(String[] args){
    Point[] points = new Point[5];

    //construct points
    System.out.println("points being tested:");
    for(int i=0; i<4;i++){
      points[i]= new Point(Math.random()*10, Math.random()*5);
      System.out.println(points[i]);
    }
    points[4]=points[3];
    System.out.println(points[4]);

    //distanceTo() tester
    for(int i=0; i<4;i++){
      System.out.println("the distance between point "+i+" and point "+(i+1)+" is "+points[i].distanceTo(points[i+1]));
    }

    //equals() tester
    for(int i=0; i<4;i++){
      if(points[i].equals(points[i+1])){
      System.out.println("Point "+i+" and point "+(i+1)+" is equal.");
      }
      else{
      System.out.println("Point "+i+" and point "+(i+1)+" is not equal.");
      }
    }

    //Triangle constructor test
    System.out.println("triangles being tested:");
    Triangle[] triangles = new Triangle[5];
    for (int i=0; i<3;i++){
      triangles[i]=new Triangle(Math.random()*10, Math.random()*5, Math.random()*2, Math.random()*-2, Math.random()*-4, Math.random()*3);
      System.out.println(triangles[i]);
    }
    for(int i=3; i<5;i++){
      triangles[i] = new Triangle(points[i-3],points[i-2], points[i-1]);
      System.out.println(triangles[i]);
    }

    //accesors test
    for(int i=0;i<5;i++){
      System.out.println("the perimeter of triangle "+i+" is "+triangles[i].getPerimeter());
      System.out.println("the area of triangle "+i+" is "+triangles[i].getArea());
      System.out.println("Triangle "+i+" is "+triangles[i].classify());
    }

    //setVertex() test
    for(int i=0;i<5;i++){
      System.out.println(triangles[i]);
      triangles[i].setVertex(i,points[i]);
      System.out.println(triangles[i]+"\n");
    }



  }
}
