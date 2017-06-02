package recu2014;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

public abstract class Expression extends Observable {
    public abstract Set<Cell> references();

    public abstract MaybeValue evaluate();
}
