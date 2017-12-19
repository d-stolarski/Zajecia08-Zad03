public class Line2D extends Shape2D{

    private double pointX1;
    private double pointX2;
    private double pointY1;
    private double pointY2;

    public Line2D(double pointX1, double pointX2, double pointY1, double pointY2) {
        this.pointX1 = pointX1;
        this.pointX2 = pointX2;
        this.pointY1 = pointY1;
        this.pointY2 = pointY2;
    }

    public double getPointX1() {
        return pointX1;
    }

    public void setPointX1(double pointX1) {
        this.pointX1 = pointX1;
    }

    public double getPointX2() {
        return pointX2;
    }

    public void setPointX2(double pointX2) {
        this.pointX2 = pointX2;
    }

    public double getPointY1() {
        return pointY1;
    }

    public void setPointY1(double pointY1) {
        this.pointY1 = pointY1;
    }

    public double getPointY2() {
        return pointY2;
    }

    public void setPointY2(double pointY2) {
        this.pointY2 = pointY2;
    }

    @Override
    public String toString() {
        return "Line2D{" +
                "punkt X1 = " + pointX1 +
                ", punkt X2 = " + pointX2 +
                ", punkt Y1 = " + pointY1 +
                ", punkt Y2 = " + pointY2 +
                '}';
    }
}
