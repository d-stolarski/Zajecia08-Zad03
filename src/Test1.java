public class Test1 {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Line2D line2D = new Line2D(1,2,2,-1);
        System.out.printf("Długość odcinka %s wynosi %.2f", line2D, shapeCalculator.lineLength(line2D));

        Circle circle = new Circle(3);
        System.out.printf("\nPole koła %s wynosi %.2f", circle, shapeCalculator.circleArea(circle));

        Rectangle rectangle = new Rectangle(3.5, 4.2);
        System.out.printf("\nPole prostokąta %s wynosi %.2f", rectangle, shapeCalculator.rectangleArea(rectangle));

        Ball ball = new Ball(2.3);
        System.out.printf("\nObjętość kuli %s wynosi %.2f", ball, shapeCalculator.ballVolume(ball));

        Cube cube = new Cube(4.1);
        System.out.printf("\nObjętość sześcianu %s wynosi %.2f", cube, shapeCalculator.cubeVolume(cube));
    }
}
