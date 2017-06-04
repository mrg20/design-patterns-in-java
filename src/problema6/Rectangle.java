package problema6;

public class Rectangle extends Figure {
    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }


    @Override
    public Circle copy() {
        return null;
    }
}
