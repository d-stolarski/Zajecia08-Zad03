public class Cube extends Shape3D {

    private double dimensionA;

    public Cube(double dimensionA) {
        this.dimensionA = dimensionA;
    }

    public double getDimensionA() {
        return dimensionA;
    }

    public void setDimensionA(double dimensionA) {
        this.dimensionA = dimensionA;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "bok A = " + dimensionA +
                '}';
    }
}
