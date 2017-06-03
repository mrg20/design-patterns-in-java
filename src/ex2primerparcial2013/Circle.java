package ex2primerparcial2013;

public class Circle extends Figure{
    private float r;

    public void setRadius(float r){
        this.r = r;
        notifier();
    }

    public float getRadiues(){
        return r;
    }
}
