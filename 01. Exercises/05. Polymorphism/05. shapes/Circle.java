package shapes;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    public void calculatePerimeter() {
        Double result=(Math.PI*this.getRadius()*2);
        super.setPerimeter(result);
    }

    @Override
    public void calculateArea() {
        Double result= (Math.PI*(Math.pow(this.getRadius(),2.0)));
        super.setArea(result);
    }
}
