package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

public class RainbowGame extends Game {
    @Override
    public void initialize() {
        final int WIDTH = 10;
        final int HEIGHT = 7;
        setScreenSize(WIDTH, HEIGHT);
        final Color[] rainbow = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                            Color.BLUE, Color.INDIGO, Color.VIOLET};
        for (int y = 0, color = 0; y < HEIGHT; y++, color++) {
            for (int x = 0; x < WIDTH; x++) {
                setCellColor(x, y, rainbow[color]);
            }

        }
    }
}
