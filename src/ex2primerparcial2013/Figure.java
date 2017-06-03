package ex2primerparcial2013;


/*import java.util.Observable;

//v1
public abstract class Figure extends Observable{
    protected float x;
    protected float y;

    public void setX(float x){
        this.x = x;
        notifier();
    }

    public void setY(float y){
        this.y = y;
        notifier();
    }

    public void notifier(Object item){
        setChanged();
        notifyObservers();
    }

}
*/


//v2
public abstract class Figure{
    protected float x;
    protected float y;
    private FigureNotifier notifier;

    public void setX(float x){
        this.x = x;
        notifier();
    }

    public void setY(float y){
        this.y = y;
        notifier();
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public void setNotifier(FigureNotifier notifier){
        this.notifier = notifier;
    }

    public void notifier(){
        notifier.notifier();
    }
}

