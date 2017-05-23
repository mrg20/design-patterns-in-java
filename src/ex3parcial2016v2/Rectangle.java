package ex3parcial2016v2;

/**
 * Created by noki on 22/05/17.
 */
public class Rectangle extends Figure {

    private final int width;
    private final int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return Integer.toString(x) + Integer.toString(y) + Integer.toString(width) + Integer.toString(height);
    }

}
