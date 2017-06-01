package recu2015;

import java.util.ArrayList;
import java.util.List;

public class DrawingBuilder {
    private double x;
    private double y;
    private List<Figure> components = new ArrayList<>();

    public DrawingBuilder(double x, double y){
        this.x = x;
        this.y = y;
    }

    public DrawingBuilder addFigure(Figure figure){
        components.add(figure);
        return this;
    }

    public Drawing create(){
        return new Drawing(x, y, components);
    }

}
