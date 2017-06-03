package ex2primerparcial2013;


import java.util.Observable;

//v1
public abstract class Figure extends Observable{
    protected float x;
    protected float y;

    public void setX(float x){
        this.x = x;
        notifier(this.x);
    }

    public void setY(float y){
        this.y = y;
        notifier(this.y);
    }

    public void notifier(Object item){
        setChanged();
        notifyObservers(item);
    }

}
