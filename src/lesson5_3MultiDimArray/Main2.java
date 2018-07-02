package lesson5_3MultiDimArray;

public class Main2 {

    public static void main(String[] args) {
        ChessFigure queen = new ChessFigure("QUE");
        ChessGame game = new ChessGame();
        game.setFigure(3, 4, queen);
        game.printGame();
    }
}
