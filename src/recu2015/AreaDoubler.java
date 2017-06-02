package recu2015;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

public class AreaDoubler implements FigureVisitor{
    private Drawing draw;
    private Circle circle;
    private Rectangle rect;

    @Override
    public void visit(Drawing draw) {
        AreaDoubler ad = new AreaDoubler();
        DrawingBuilder db = new DrawingBuilder(draw.getX(), draw.getY());
        for (Figure component :
                draw.getComponents()) {
            component.accept(ad);
            addDoubledComponent(ad, db, component);
        }
        draw = db.create();
    }

    //I must do something with this...
    private void addDoubledComponent(AreaDoubler ad, DrawingBuilder db, Figure component) {
        if(component instanceof Drawing){
            db.addFigure(ad.getDoubled((Drawing) component));
        }else if(component instanceof Circle){
            db.addFigure(ad.getDoubled((Circle) component));
        }else{
            db.addFigure(ad.getDoubled((Rectangle) component));
        }
    }

    @Override
    public void visit(Rectangle rectangle) {
        rect = new Rectangle(rectangle.getX(),
                rectangle.getY(),
                rectangle.getWidth()*Math.sqrt(2.0),
                rectangle.getHeight()*Math.sqrt(2.0));
    }

    @Override
    public void visit(Circle circle) {
        circle = new Circle(circle.getX(),
                circle.getY(),
                circle.getR()*Math.sqrt(2.0));
    }

    public Drawing getDoubled(Drawing draw){
        if(this.draw == null){
            throw new NullPointerException();
        }
        return this.draw;
    }

    public Circle getDoubled(Circle circle){
        if(this.circle == null){
            throw new NullPointerException();
        }
        return this.circle;
    }

    public Rectangle getDoubled(Rectangle rect){
        if(this.rect == null){
            throw new NullPointerException();
        }
        return this.rect;
    }


}
