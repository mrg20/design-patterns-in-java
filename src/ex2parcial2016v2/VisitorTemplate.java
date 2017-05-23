package ex2parcial2016v2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class VisitorTemplate implements Visitor{
    protected int leaf_number = 0;
    protected Set<Component> visited = new HashSet<>();

    protected abstract void doVisit(Leaf l);

    @Override
    public void visit(Leaf l){
        if(visited.add(l)){
            doVisit(l);
        }
    }

    @Override
    public void visit(Composite composite) {
        if (visited.add(composite)){
            for(Component sc : composite.getComponents()){
                sc.accept(this);
            }
        }
    }

    public int getAccum(){
        return leaf_number;
    }


}
