package solid;
/*убрали класс Square , заменив его на 2 класса
* SquareCount в котором вычисления и SquareView в котором рисование.
* Класс Point, в нашем случае оказался не нужен.
* */
import solid.srp.Point;
import solid.srp.Square;
import solid.srp.SquareCount;
import solid.srp.SquareView;

public class Main {
    public static void main(String[] args) {
        SquareCount squareCount = new SquareCount(5);
        System.out.printf("Площадь фигуры: %d \n", squareCount.getArea());

        SquareView squareView = new SquareView();
        squareView.draw(squareCount.getSide() * 2);

    }
}
