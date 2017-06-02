package recu2015;

public abstract class Figure{

    protected double x;
    protected double y;

    public Figure(double x, double y) {
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public abstract void accept(FigureVisitor av);
}
