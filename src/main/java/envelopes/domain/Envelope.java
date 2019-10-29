package envelopes.domain;

public class Envelope extends Container {
    private double width;
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

    public Envelope(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
}
