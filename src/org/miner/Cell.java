package org.miner;

public interface Cell<T> {

    boolean isBomb();

    boolean isSuggestBomb();

    boolean isSuggestEmpty();

    void suggestEmpty();

    void suggestBomb();

    void draw(T paint, boolean real, int x, int y);
}
