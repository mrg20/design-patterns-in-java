package ex2parcial2016v2;

import java.util.List;

/**
 * Created by noki on 22/05/17.
 */
public abstract class VisitorTemplate implements Visitor{
    private int leaf_number = 0;

    @Override
    public int visit(Composite composite) {
        List<Component> components = composite.getComponents();
        for (Component component : components) {
            if (composite.hasBeenVisited()) {
                leaf_number += component.accept(this);
                composite.isVisited();
            }
        }
        return leaf_number;
    }
}
