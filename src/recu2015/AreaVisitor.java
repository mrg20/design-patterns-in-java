package recu2015;

import java.util.List;

public class AreaVisitor implements FigureVisitor {
    private List<Double> drawArea;
    private double rectangleArea;
    private double circleArea;

    @Override
    public void visit(Drawing draw) {

    }

    @Override
    public void visit(Rectangle rectangle) {

    }

    @Override
    public void visit(Circle circle){

    }

    public double getArea(Circle circle){
        return circleArea;
    }

    public double getArea(Rectangle rectangle){
        return rectangleArea;
    }

    public List<Double> getArea(Drawing draw){
        return drawArea;
    }

}
