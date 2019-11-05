package envelopes.domain;

public class Envelope extends Container {
    private double width;
    private double length;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Envelope(double width, double length) {
        super();
        this.width = Math.min(width, length);
        this.length = Math.max(width, length);
    }
}
