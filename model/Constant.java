package model;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public enum Constant {
    //默认赋值为8，且不可更改
    CHESSBOARD_ROW_SIZE(8),CHESSBOARD_COL_SIZE(8);

    private final int num;
    Constant(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    //Map可以理解为一个映射，例如“钻石”映射到代码中就是Color.blue,同理Color.blue就代表钻石
    static Map<String, Color> colorMap = new HashMap<>(){{
        put("💎",Color.blue);
        put("⚪",Color.white);
        put("▲",Color.green);
        put("🔶",Color.orange);
    }};

}
