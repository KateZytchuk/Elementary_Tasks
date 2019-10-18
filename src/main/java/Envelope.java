/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 18.10.2019
 * TIME: 16:04
 */
public class Envelope {
    private  double width;
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Envelope (double width, double length)
    {
        this.width = width;
        this.length = length;
    }
}
