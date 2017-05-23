package ex3parcial2016v2;

public class Figure {
    protected int x;
    protected int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static FigureBuilder create() {
        return new FigureBuilder();
    }
}
