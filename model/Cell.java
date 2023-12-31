package model;

import java.io.Serializable;
/**
 * This class describe the slot for Chess in Chessboard
 * */
public class Cell implements Serializable {
    // the position for chess
    private ChessPiece piece;


    public ChessPiece getPiece() {
        return piece;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = piece;
    }

    public void removePiece() {
        this.piece = null;
    }

    public void print(){
        System.out.println("Sustech");
    }
    public String abc(){
        return String.format("HAVE A TRY");
    }
    public String abc2(){
        return String.format("TRY AGAIN");
    }
}
