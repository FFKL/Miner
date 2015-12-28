package org.miner.gui;

import org.miner.Cell;

import java.awt.*;

public class GUICell implements Cell<Graphics> {

    private boolean bomb;
    private boolean suggestBomb = false;
    private boolean suggestEmpty = false;

    GUICell(boolean bomb) {
        this.bomb = bomb;
    }

    @Override
    public boolean isBomb() {
        return this.bomb;
    }

    @Override
    public boolean isSuggestBomb() {
        return this.suggestBomb;
    }

    @Override
    public boolean isSuggestEmpty() {
        return this.suggestEmpty;
    }

    @Override
    public void suggestEmpty() {
        this.suggestEmpty = true;
    }

    @Override
    public void suggestBomb() {
        this.suggestBomb = true;
    }

    @Override
    public void draw(Graphics paint, boolean real, int x, int y) {
        if (real) {
            if (this.isBomb()) {
                paint.drawString("*", x, y);
            } else {
                paint.drawString(" ", x, y);
            }
        } else {
            if (this.suggestBomb) {
                paint.drawString("?", x, y);
            } else if (this.suggestEmpty) {
                paint.drawString("-", x, y);
            } else {
                paint.drawString("X", x, y);
            }
        }
    }
}
