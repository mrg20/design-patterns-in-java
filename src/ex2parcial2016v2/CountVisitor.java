package ex2parcial2016v2;

public class CountVisitor extends VisitorTemplate implements Visitor {
    private int leaf_number = 0;

    @Override
    public int visit(Leaf leaf) {
        if (leaf.hasBeenVisited()){
            leaf.isVisited();
            return 1;
        }
        return 0;
    }

    @Override
    public int visit(Composite composite) {
        return super.visit(composite);
    }
}
