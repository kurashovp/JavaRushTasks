package com.javarush.task.task20.task2027;

public enum Direction {

    WN(-1, -1), NN(-1, 0), EN(-1, 1),
    /* ↖ ↑ ↗ */
    WW(0, -1), /* ←   → */  EE(0, 1),
    /* ↙ ↓ ↘ */
    WS(1, -1), SS(1, 0), ES(1, 1);

    private final int i;
    private final int j;

    Direction(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
