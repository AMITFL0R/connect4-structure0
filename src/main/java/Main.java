import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    private JButton buttonOneRow;
    private JButton buttonTowRow;
    private JButton buttonThreeRow;
    private JButton buttonFourRow;
    private JButton buttonFiveRow;
    private JButton buttonSixRow;
    private JButton buttonSevenRow;

    public static void main(String[] args) {
        Board board = new Board();

        board.placeSquare(2, 1, 2);
        board.placeSquare(6, 2, 1);
        int player = board.getPlayerInSquare(3, 5);
        System.out.println("the player is " + player);
    }


}


