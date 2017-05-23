package ex2parcial2016v2;


public class SumVisitor extends VisitorTemplate implements Visitor {

    @Override
    protected void doVisit(Leaf l) {
        leaf_number += l.getInfo();
    }
}
