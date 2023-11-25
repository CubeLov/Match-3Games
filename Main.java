import controller.GameController;
import model.Chessboard;
import view.ChessGameFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChessGameFrame mainFrame = new ChessGameFrame(1100, 810);
            GameController gameController = new GameController(mainFrame.getChessboardComponent(), new Chessboard(0));
            mainFrame.setVisible(true);
        });
    }
    public String toString(){
        return String.format("He is Xiaoming");
    }
  
    // Today is 2023/11/25
    void print(){
        System.out.println("Hello World");
    }

    void print(int a){
        System.out.println(a);
    }
}
