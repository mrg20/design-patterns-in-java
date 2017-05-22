package ex2parcial2016v2;

public interface Visitor {
    int visit(Leaf leaf);
    int visit(Composite composite);
}
