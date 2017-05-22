package ex3parcial2016v2;

/**
 * Created by noki on 22/05/17.
 */
public class main {
    public static void main(String[] args) {
        Rectangle rect = (Rectangle) Figure.create()
                .at(3, 4)
                .withDimensions(2,2)
                .execute();
        Circle circle = (Circle) Figure.create()
                .at(3, 4)
                .withDimensions(2,2)
                .execute();
    }
}
