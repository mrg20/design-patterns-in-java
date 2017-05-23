package ex2parcial2016v2;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.List;


public class Composite extends Component {
    private boolean visited = false;
    private UnmodifiableArrayList<Component> components;

    public Composite(UnmodifiableArrayList<Component> components){
        this.components = components;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    public List<Component> getComponents(){
        return components;
    }

    public void isVisited(){
        visited = true;
    }

    public boolean hasBeenVisited(){
        return visited;
    }

}
