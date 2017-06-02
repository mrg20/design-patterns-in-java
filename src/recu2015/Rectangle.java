package recu2015;

public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void accept(FigureVisitor av) {
        av.visit(this);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight(){
        return height;
    }

}
