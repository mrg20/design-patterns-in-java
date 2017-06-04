package problema6;

public class Line extends Figure{
    private float x2;
    private float y2;
    public Line(float x, float y, float x2, float y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public Circle copy() {
        return null;
    }
}
