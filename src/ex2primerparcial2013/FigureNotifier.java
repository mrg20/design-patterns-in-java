package ex2primerparcial2013;

import java.util.Observable;

public class FigureNotifier extends Observable{
    public void notifier() {
        setChanged();
        notifyObservers();
    }
}
