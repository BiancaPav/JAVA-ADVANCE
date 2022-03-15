package ro.sda.bianca.abstractclass.ex2;

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height * width) / 2;
    }

    @Override
    public double getPerimeter() {
        return 3 * width;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
