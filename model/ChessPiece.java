package model;


import java.awt.*;

public class ChessPiece {
    // Diamond, Circle, ...
    private String name;

    private Color color;

    public ChessPiece(String name) {
        this.name = name;
        this.color = Constant.colorMap.get(name);
        //name代表图标，钻石、圆圈...
        //color则根据name由Map映射
    }

    public String getName() {
        return name;
    }

    public Color getColor(){return color;}

}
