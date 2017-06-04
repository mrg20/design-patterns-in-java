package problema6;

public class Circle extends Figure {
    private float r;

    public Circle(float x, float y, float r) {
        super(x, y);
        this.r = r;
    }

    public Circle(Circle circle) {
        super(circle);
        this.r = circle.r;
    }

    @Override
    public Circle copy() {
        return new Circle(this);
    }
}
