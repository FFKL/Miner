package org.miner.gui;

import org.miner.Board;
import org.miner.Cell;

import javax.swing.*;
import java.awt.*;

public class GUIBoard extends JPanel implements Board {

    public static final int PADDING = 50;

    public Cell<Graphics>[][] cells;

    private boolean real = false;

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if (this.cells != null) {
            for (int x = 0; x != cells.length; x++) {
                for (int y = 0; y != cells.length; y++) {
                    graphics.setColor(Color.black);
                    cells[x][y].draw(graphics, real, 25 + (PADDING * x), 25 + (PADDING * y));
                    graphics.drawRect(x * PADDING, y * PADDING, PADDING, PADDING);
                }
            }
        }
    }

    @Override
    public void drawBoard(Cell[][] cells) {
        this.cells = cells;
        this.repaint();
    }

    @Override
    public void drawCell(int cellX, int cellY) {
        this.repaint();
    }

    public void drawCell(int cellX, int cellY, int state) {
        int x = cellX / PADDING;
        int y = cellY / PADDING;
        if (state == 1) {
            cells[x][y].suggestEmpty();
        }
        else if (state == 3) {
            cells[x][y].suggestBomb();
        }
    }

    @Override
    public void drawBang() {
        real = true;
        this.repaint();
    }

    @Override
    public void drawCongratulate() {
        real = true;
        this.repaint();
    }
}
