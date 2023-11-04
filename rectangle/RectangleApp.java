package seminar6.rectangle;

// Open-closed principle
// Принцип открытости/закрытости
// Можно улучшать, но нельзя изменять
public class RectangleApp {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.calculateArea(rectangle));


    }
}

class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

class AreaCalculator {
    public double calculateArea(Rectangle rectangle) {
        return rectangle.width * rectangle.height;
    }
}
