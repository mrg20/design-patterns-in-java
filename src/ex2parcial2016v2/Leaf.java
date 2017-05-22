package ex2parcial2016v2;

/**
 * Created by noki on 22/05/17.
 */
public class Leaf extends Component{
    private int info = 1;
    private boolean visited = false;

    public int getInfo(){
        return info;
    }

    public void isVisited() {
        visited = true;
    }

    public boolean hasBeenVisited() {
        return visited;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
