package chessBoard;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 19.10.2019
 * TIME: 13:19
 */

public class ChessDesk {
    private int width;
    private int length;

    public ChessDesk(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
