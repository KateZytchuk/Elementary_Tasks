package triangle_square;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 21.10.2019
 * TIME: 17:02
 */

public class Triangle {
    private String name;
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double square;

    public Triangle(String name, double firstSide, double secondSide, double thirdSide)
    {
        this.name = name;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
