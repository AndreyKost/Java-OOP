package Rectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point){
        if(point.getCoordinateX()>= this.bottomLeft.getCoordinateX() && point.getCoordinateX() <=this.topRight.getCoordinateX()){
           if(point.getGetCoordinateY()>=this.bottomLeft.getGetCoordinateY() && point.getGetCoordinateY()<=this.topRight.getGetCoordinateY()){
               return true;
           }
        }
        return false;
    }


}
