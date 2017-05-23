package ex3parcial2016v2;

public class main {
    public static void main(String[] args) {
        Rectangle rect = (Rectangle) Figure
                .create()
                .at(3, 4)
                .withDimensions(2,2)
                .execute();
        Circle circle = (Circle) Figure
                .create()
                .at(3, 4)
                .withRadius(2)
                .execute();
        System.out.println(rect);
        System.out.println(circle);
    }
}
