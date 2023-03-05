package solid.ocp;

public class Krug implements Shape{
    private double radius;

    public Krug(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI* Math.pow(radius,2);
    }
}
