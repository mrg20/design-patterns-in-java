package ex2parcial2016v2;

public class CountVisitor extends VisitorTemplate implements Visitor {

    @Override
    protected void doVisit(Leaf l) {
        leaf_number += 1;
    }
}
