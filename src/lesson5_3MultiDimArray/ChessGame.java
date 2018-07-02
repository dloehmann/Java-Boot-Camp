package lesson5_3MultiDimArray;

/**
 * @Author Dennis Löhmann (Holisticon AG) 20.06.18
 **/
public class ChessGame {
    private static int SIZE = 8;
    private ChessFigure[][] game = new ChessFigure[SIZE][SIZE];

    public ChessGame() {
    }

    public ChessFigure getFigure(int x, int y) {
        return game[y][x];
    }

    public void setFigure(int x, int y, ChessFigure f) {
        game[y][x] = f;
    }

    public void printGame() {
        boolean black = true;
        for (ChessFigure[] y : game) {
            for (ChessFigure c : y) {
                if (black) {
                    if (c == null) {
                        System.out.print("| ||| |");
                    } else {
                        System.out.print("| " + c.getName() + " |");
                    }
                } else {
                    if (c == null) {
                        System.out.print("|     |");
                    } else {
                        System.out.print("| " + c.getName() + " |");
                    }
                }
                black = !black;
            }
            black = !black;
            System.out.println();
        }
        System.out.println();
    }
}