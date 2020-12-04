package com.javarush.games.minigames.mini07;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class PaintGame extends Game {

    @Override
    public void initialize() {
        final int WIDTH = 5;
        final int HEIGHT = 5;
        setScreenSize(WIDTH, HEIGHT);
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        setCellColor(x, y, Color.GREEN);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        setCellColor(x, y, Color.ORANGE);
    }
}
