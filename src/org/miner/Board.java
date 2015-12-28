package org.miner;

public interface Board {

    /**
     * Рисует сетку, исходящую из входящего массива ячеек
     * @param cells Массив ячеек
     */
    void drawBoard(Cell[][] cells);

    /**
     * Рисует ячейку
     * @param x позиция по горизонтали
     * @param y позиция по вертикали
     */
    void drawCell(int x, int y);

    /**
     * Рисует взрыв всех бомб
     */
    void drawBang();

    /**
     * Рисует поздравление, когда игра выиграна
     */
    void drawCongratulate();
}
