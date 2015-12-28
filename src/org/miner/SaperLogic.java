package org.miner;

/**
 * Created by Admin on 23.12.2015.
 */
public interface SaperLogic {
    void loadBoard(Cell[][] cells);
    boolean shouldBang(int x, int y);
    boolean finish();
    void suggest(int x, int y, boolean bomb);

}
