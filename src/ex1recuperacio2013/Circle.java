package ex1recuperacio2013;

public class Circle extends Figure {
    private float r;

    public void setRadius(float r){
        this.r = r;
        notifier();
    }

    public float getRadius(){
        return r;
    }
}
