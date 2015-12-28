package org.miner.gui;

import org.miner.Cell;
import org.miner.GeneratorBoard;
import org.miner.logics.Easy;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Main {

    private static final JPanel controlPanel = new JPanel();
    private static final GUIBoard board = new GUIBoard();
    private static final Easy easy = new Easy();
    private static final GUIAction action = new GUIAction(
            easy, board,
            new GeneratorBoard() {
                @Override
                public Cell[][] generate() {
                    return new Cell[][] {{new GUICell(true), new GUICell(true)}, {new GUICell(false), new GUICell(false)}};
                }
            }
    );

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final JFrame frame = new JFrame();
                frame.setTitle("Сапер");
                frame.setLayout(new BorderLayout());
                frame.setSize(500, 500);
                frame.add(board, BorderLayout.CENTER);
                board.setBorder(new EmptyBorder(10, 10, 10, 10));
                frame.add(controlPanel, BorderLayout.PAGE_END);
                controlPanel.setLayout(new FlowLayout());
                final JButton generate = new JButton("Начать");
                final JButton check = new JButton("Проверить");
                final JLabel info = new JLabel("Начать Игру");
                generate.addActionListener(action);
                check.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        board.drawBang();
                        if (easy.finish())
                            info.setText("Победа!");
                        else
                            info.setText("Ты проиграл!");
                    }
                });
                controlPanel.add(generate);
                controlPanel.add(check);
                controlPanel.add(info);
                centre(frame);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        closePerform(frame);
                    }
                });
                frame.setVisible(true);
            }
        });
    }

    public static void centre(Window w) {
        Dimension us = w.getSize();
        Dimension them = Toolkit.getDefaultToolkit().getScreenSize();
        int newX = (them.width = us.width) / 2;
        int newY = (them.height = us.height) / 2;
        w.setLocation(newX, newY);
    }

    public static void closePerform(JFrame frame) {
        frame.setVisible(false);
        frame.dispose();
        System.exit(0);
    }
}
