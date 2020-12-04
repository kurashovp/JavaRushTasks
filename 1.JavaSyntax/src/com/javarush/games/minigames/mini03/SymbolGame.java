package com.javarush.games.minigames.mini03;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

public class SymbolGame extends Game {
    @Override
    public void initialize() {
        final String javaRush = "JAVARUSH";
        setScreenSize(8, 3);
        for (int i = 0; i < 8; i++) {
            setCellValueEx(i, 1, Color.ORANGE, javaRush.substring(i,i+1));
        }

    }
}
