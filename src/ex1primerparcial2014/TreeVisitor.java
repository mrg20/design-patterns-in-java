package ex1primerparcial2014;


public interface TreeVisitor {
    void visit(LeafNode leaf);
    void visit(CompositeNode composite);
}
