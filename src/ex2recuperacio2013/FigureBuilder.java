package ex2recuperacio2013;

public class FigureBuilder {
    private float x;
    private float y;
    private float x2;
    private float y2;
    private boolean doLine = false;
    private float radius;
    private boolean doCircle = false;
    private float dimsX;
    private float dimsY;
    private boolean doRect = true;

    public FigureBuilder at(float x, float y){
        this.x = x;
        this.y = y;
        return this;
    }

    public FigureBuilder withRadius(float radius){
        this.radius = radius;
        this.doCircle = true;
        return this;
    }

    public FigureBuilder withDims(float dimsX, float dimsY){
        this.dimsX = dimsX;
        this.dimsY = dimsY;
        this.doRect = true;
        return this;
    }

    public FigureBuilder to(float x2, float y2){
        this.x2 = x2;
        this.y2 = y2;
        this.doLine = true;
        return this;
    }

    public Figure Do(){
        if(doCircle && doRect || doCircle && doLine|| doRect && doLine){
            return null;
        }else if(doCircle){
            //return new circle
        }else if(doRect){
            //return new rect
        }else if(doLine){
            //return new line
        }else{
            return null;
        }
        return new Figure();//IGNORE THIS
    }


}
