package recu2015;

public interface FigureVisitor {
    void visit(Drawing draw);
    void visit(Rectangle rectangle);
    void visit(Circle circle);
}
