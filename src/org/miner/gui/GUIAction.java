package org.miner.gui;

import org.miner.BaseAction;
import org.miner.GeneratorBoard;
import org.miner.SaperLogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUIAction extends BaseAction implements ActionListener, MouseListener {

    private GUIBoard board;

    public GUIAction(SaperLogic logic, GUIBoard board, GeneratorBoard generator) {
        super(logic, board, generator);
        this.board = board;
        this.board.addMouseListener(this);

    }


    public void actionPerformed(ActionEvent e) {
        this.initGame();
    }

    public void mouseClicked(MouseEvent e) {
        int state = e.getButton();
        int x = e.getX();
        int y = e.getY();
        board.drawCell(x, y, state);
        board.repaint();
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
