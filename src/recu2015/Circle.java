package recu2015;

public class Circle extends Figure {
    private double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public void accept(FigureVisitor av) {
        av.visit(this);
    }

    public double getR(){
        return r;
    }
}
