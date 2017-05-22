package ex2parcial2016v2;


public class SumVisitor extends VisitorTemplate implements Visitor {
    private int leaf_info = 0;

    @Override
    public int visit(Leaf leaf) {
        if (leaf.hasBeenVisited()){
            leaf.isVisited();
            return leaf.getInfo();
        }
        return 0;
    }

    @Override
    public int visit(Composite composite) {
        return super.visit(composite);
    }
}
