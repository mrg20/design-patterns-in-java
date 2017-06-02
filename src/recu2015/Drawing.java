package recu2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drawing extends Figure{
    private List<Figure> components;
    public Drawing(double x, double y, List<Figure> components) {
        super(x, y);
        this.components = components;
    }

    public List<Figure> getComponents(){
        return components;
    }

    @Override
    public void accept(FigureVisitor av) {
        av.visit(this);
    }
}
