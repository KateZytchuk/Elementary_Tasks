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

    public static Envelope[] orderTwoEnvelopes(Envelope first, Envelope second){
        Envelope [] orderedEnvelopes = new Envelope[2];
        double firstDifference = Math.abs(first.getWidth() - first.getLength());
        double secondDifference = Math.abs(second.getWidth() - second.getLength());
        if(firstDifference  > secondDifference){
            orderedEnvelopes[0] = second;
            orderedEnvelopes[1] = first;
        }else {
            orderedEnvelopes[0] = first;
            orderedEnvelopes[1] = second;
        }
        return orderedEnvelopes;
    }
}
