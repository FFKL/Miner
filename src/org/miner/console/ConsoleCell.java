package org.miner.console;

import org.miner.Cell;

import java.io.PrintStream;

/*public class ConsoleCell implements Cell<PrintStream> {
    private boolean bomb;
    private boolean suggestBomb = false;
    private boolean suggestEmpty = false;

    public ConsoleCell(boolean bomb) {
        this.bomb = bomb;
    }

    public boolean isBomb() {
        return this.bomb;
    }

    public boolean isSuggestBomb() {
        return this.suggestBomb;
    }

    public boolean isSuggestEmpty() {
        return this.suggestEmpty;
    }

    public void suggestEmpty() {
        this.suggestEmpty = true;
    }

    public void suggestBomb() {
        this.suggestBomb = true;
    }

    @Override
    public void draw(PrintStream paint, boolean real) {
        if (real) {
            if (this.isBomb()) {
                paint.print("[*] ");
            } else {
                paint.print("[ ] ");
            }
        } else {
            if (this.suggestBomb) {
                paint.print("[?] ");
            } else if (this.suggestEmpty) {
                paint.print("[ ] ");
            } else {
                paint.print("[X] ");
            }
        }
    }
}*/
