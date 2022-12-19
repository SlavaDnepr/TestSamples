public class Rectangle {
    private double sideA;

    private double sideB;

    public Rectangle(double sideA, double sideB) {
        if (sideA <= 0 || sideB <= 0)
            throw new IllegalArgumentException();

        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double side) {
        if (side <= 0)
            throw new IllegalArgumentException();

        this.sideA = side;
        this.sideB = side;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    public double area() {
        return this.sideA * this.sideB;
    }

    public double perimeter() {
        return this.sideA * 2 + this.sideB * 2;
    }

    public boolean isSquare() {
        return this.sideA == this.sideB;
    }

    public void replaceSides() {
        double tmp = this.sideA;
        this.sideA = this.sideB;
        this.sideB = tmp;
    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(o instanceof Rectangle))
            return false;

        Rectangle other = (Rectangle)o;

        return this.sideA == other.getSideA() && this.sideB == other.getSideB();
    }

    @Override
    public final int hashCode() {
        int result = 17;
        if (this.sideA != 0) {
            result = (int)(31 * result + this.sideA);
        }

        if (this.sideB != 0) {
            result = (int)(31 * result + this.sideB);
        }

        return result;
    }

    @Override
    public final String toString() {
        return "SideA: " + this.sideA + ";SideB: " + this.sideB;
    }
}
