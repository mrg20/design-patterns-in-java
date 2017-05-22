package ex3parcial2016v2;

public class FigureBuilder {
    private int x;
    private int y;
    private int width;
    private int height;
    private int radius;
    private boolean at = false;
    private boolean dimension = false;
    private boolean haveRadius = false;

    public FigureBuilder at(int x, int y) {
        if (!at){
            this.x = x;
            this.y = y;
            at = true;
        }
        return this;
    }

    public FigureBuilder withDimensions(int width, int height) {
        if (haveRadius){
            throw new UnsupportedOperationException();
        }
        this.width = width;
        this.height = height;
        dimension = true;
        return this;
    }

    public FigureBuilder withRadius(int radius){
        if(dimension){
            throw new UnsupportedOperationException();
        }
        this.radius = radius;
        haveRadius = true;
        return this;
    }


    public Figure execute() {
        if (!at) {
            throw new IllegalStateException();
        }
        if (haveRadius){
            return new Circle(x, y, radius);
        }else if(dimension){
            return new Rectangle(x, y, width, height);
        }
        return new Figure(x, y);
    }
}
