package recu2014;

import java.util.Set;

public class MaybeValue extends Expression {


    @Override
    public Set<Cell> references() {
        setChanged();
        notifyObservers();
        return null;
    }

    @Override
    public MaybeValue evaluate() {
        return null;
    }
}
