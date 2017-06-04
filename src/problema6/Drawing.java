package problema6;

import java.util.ArrayList;
import java.util.List;

public class Drawing extends Figure{
    private List<Figure> components = new ArrayList<>();

    public Drawing(float x, float y) {
        super(x, y);
    }

    public void addComponent(Figure component){
        components.add(component);
    }
}
