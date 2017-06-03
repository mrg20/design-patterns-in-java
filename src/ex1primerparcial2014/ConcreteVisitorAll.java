package ex1primerparcial2014;

import java.util.ArrayList;
import java.util.List;

//Composite
public class ConcreteVisitorAll implements TreeVisitor{
    List<TreeVisitor> components = new ArrayList<>();

    public void addComponent(TreeVisitor component){
        components.add(component);
    }

    @Override
    public void visit(LeafNode leaf) {
        for (TreeVisitor component :
                components) {
            component.visit(leaf);
        }
    }

    @Override
    public void visit(CompositeNode composite) {
        for (TreeVisitor component :
                components) {
            component.visit(composite);
        }
    }
}
