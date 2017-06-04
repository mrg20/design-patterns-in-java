package problema6;

public abstract class Figure {
 protected float x;
 protected float y;

 public Figure(float x, float y){
    this.x = x;
    this.y = y;
 }

    public Figure(Figure figure) {
        this.x = figure.x;
        this.y = figure.y;
    }

    public abstract Circle copy();//profunda. Superficial es copiar refencia.
}
