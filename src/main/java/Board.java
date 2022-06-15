import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Board extends JFrame {
    private JButton buttonOneRow;
    private JButton buttonTowRow;
    private JButton buttonThreeRow;
    private JButton buttonFourRow;
    private JButton buttonFiveRow;
    private JButton buttonSixRow;
    private JButton buttonSevenRow;
    private int X = 1;
    private int Y = 1;
    private int one = 1;
    private int tow = 2;
    private int three = 3;
    private int four = 4;
    private int five = 5;
    private int six = 6;
    private int seven = 7;


    private final JButton[][] squares = new JButton[7][];

    public Board() {

        for (int i = 0; i < Constant.BOARD_WIDTH; ++i) {
            this.squares[i] = new JButton[Constant.BOARD_WIDTH];

            for (int j = 0; j < Constant.BOARD_WIDTH; ++j) {
                JButton square = new JButton();
                if (i == 0) {
                    square.setText(String.valueOf(j + 1));
                    square.setBackground(Color.WHITE);
                    square.setFont(new Font(Constant.FONT_NAME, 1, Constant.FONT_SIZE));
                        square.addActionListener((e) -> {
                            if (square.getText().equals("1")) {
                                if (getPlayerInSquare(one, X) == 0)
                                    placeSquare(one, Y, 2);
                                else {
                                    Y++;
                                    placeSquare(one, Y , 2);
                                }
                            }
                            if (square.getText().equals("2")) {
                                if (getPlayerInSquare(tow, Y) == 0)
                                    placeSquare(tow, Y, 2);
                                else {
                                    placeSquare(tow, Y, 2);
                                }
                            }
                            if (square.getText().equals("3")) {
                                if (getPlayerInSquare(three, Y) == 0)
                                    placeSquare(three, Y, 2);
                                else {
                                    placeSquare(three, Y , 2);
                                }
                            }
                            if (square.getText().equals("4")) {
                                if (getPlayerInSquare(four, X) == 0)
                                    placeSquare(four, Y, 2);
                                else {
                                    placeSquare(four, Y, 2);
                                }
                            }
                            if (square.getText().equals("5")) {
                                if (getPlayerInSquare(five, X) == 0)
                                    placeSquare(five, Y, 2);
                                else {
                                    placeSquare(five, Y, 2);
                                }
                            }
                            if (square.getText().equals("6")) {
                                if (getPlayerInSquare(six, X) == 0)
                                    placeSquare(six, Y, 2);
                                else {
                                    placeSquare(six, Y , 2);
                                }
                            }
                            if (square.getText().equals("7")) {
                                if (getPlayerInSquare(seven, X) == 0)
                                    placeSquare(seven, Y, 2);
                                else {
                                    placeSquare(seven, Y , 2);
                                }
                            }
                        });
                } else {
                    square.setEnabled(false);
                }

                this.squares[i][j] = square;
                this.add(square);
            }
        }

        this.setLocationRelativeTo((Component) null);
        GridLayout gridLayout = new GridLayout(Constant.BOARD_WIDTH, Constant.BOARD_HEIGHT);
        this.setLayout(gridLayout);
        this.setSize(Constant.BOARD_HEIGHT * Constant.SQUARE_SIZE, Constant.BOARD_HEIGHT * Constant.SQUARE_SIZE);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void placeSquare(int x, int y, int player) {
        this.squares[Constant.BOARD_WIDTH - y][x - 1].setBackground(player == 1 ? Color.RED : Color.YELLOW);
    }

    public int getPlayerInSquare(int x, int y) {
        byte player = 0;

        try {
            Color backgroundColor = this.squares[Constant.BOARD_WIDTH - y][x - 1].getBackground();
            if (backgroundColor.equals(Color.RED)) {
                player = 1;
            } else if (backgroundColor.equals(Color.YELLOW)) {
                player = 2;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return player;
    }
}


