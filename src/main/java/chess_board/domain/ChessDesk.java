package chess_board.domain;

public class ChessDesk {
    private int width;
    private int length;

    public ChessDesk(int length, int width) {
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
