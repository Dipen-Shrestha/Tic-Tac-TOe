/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Dipen
 */
public class Tic_Tac_Toe extends JFrame implements ActionListener {

    JButton r01, r02, r03;
    JButton r11, r12, r13;
    JButton r21, r22, r23;
    int i = 0;
    JLabel lturn;
    JPanel head, body;
    String xo = "";

    Tic_Tac_Toe() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Tic-Tac-Toe");
        setResizable(false);

        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        setBackground(new Color(0.407f, 0.601f, 0.909f, 0.95f));
//        setBackground(new Color(0.518f, 0.565f, 0.612f, 0.9f));

        r01 = new JButton();
        
        r02 = new JButton();
        r03 = new JButton();

        r11 = new JButton();
        r12 = new JButton();
        r13 = new JButton();

        r21 = new JButton();
        r22 = new JButton();
        r23 = new JButton();

        lturn = new JLabel();

        head = new JPanel();
        head.setBounds(0, 0, 290, 50);
        head.setLayout(null);
        head.setOpaque(false);

        body = new JPanel();
        body.setBounds(0, 50, 293, 221);
        body.setBackground(Color.LIGHT_GRAY);
        body.setLayout(new GridLayout(3, 3));
        head.add(lturn);

        body.add(r01);
        body.add(r02);
        body.add(r03);

        body.add(r11);
        body.add(r12);
        body.add(r13);

        body.add(r21);
        body.add(r22);
        body.add(r23);

        add(head);
        add(body);

        lturn.setText("X's Trun");
        lturn.setBounds(125, 0, 50, 50);

        r01.addActionListener(this);
        r02.addActionListener(this);
        r03.addActionListener(this);

        r11.addActionListener(this);
        r12.addActionListener(this);
        r13.addActionListener(this);

        r21.addActionListener(this);
        r22.addActionListener(this);
        r23.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == r01) {
            process(r01);            
        } 
        else if (e.getSource() == r02) {
            process(r02);
        } 
        else if (e.getSource() == r03) {
            process(r03);
        }
        else if (e.getSource() == r11) {
            process(r11);
        } 
        else if (e.getSource() == r12) {
            process(r12);
        }
        else if (e.getSource() == r13) {
           process(r13);
        }
        else if (e.getSource() == r21) {
            process(r21);
        }
        else if (e.getSource() == r22) {
            process(r22);
        }
        else if (e.getSource() == r23) {
            process(r23);
        }
        check();

    }

    public void check() {
        System.out.println(" i " + i);
        boolean retVal = false;

        String rc01 = r01.getText();
        String rc02 = r02.getText();
        String rc03 = r03.getText();

        String rc11 = r11.getText();
        String rc12 = r12.getText();
        String rc13 = r13.getText();

        String rc21 = r21.getText();
        String rc22 = r22.getText();
        String rc23 = r23.getText();
//        String[][] res = {{rc01,rc02,rc03},{rc11,rc12,rc13},{rc21,rc22,rc23}};

        if (rc01.equalsIgnoreCase("x")) {
            if (rc01.equalsIgnoreCase(rc02) && rc01.equalsIgnoreCase(rc03)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'X' won!\nWant to play again?", "X won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }

            }
            if (rc01.equalsIgnoreCase(rc12) && rc01.equalsIgnoreCase(rc23)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'X' won!\nWant to play again?", "X won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
            if (rc01.equalsIgnoreCase(rc11) && rc01.equalsIgnoreCase(rc21)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'X' won!\nWant to play again?", "X won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
        } else if (rc01.equalsIgnoreCase("o")) {
            if (rc01.equalsIgnoreCase(rc02) && rc01.equalsIgnoreCase(rc03)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'O' won!\nWant to play again?", "O won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }

            }
            if (rc01.equalsIgnoreCase(rc12) && rc01.equalsIgnoreCase(rc23)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'O' won!\nWant to play again?", "O won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
            if (rc01.equalsIgnoreCase(rc11) && rc01.equalsIgnoreCase(rc21)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'O' won!\nWant to play again?", "O won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
        }
        // / diagonal
        if (rc03.equalsIgnoreCase("x")) {
            if (rc03.equalsIgnoreCase(rc12) && rc03.equalsIgnoreCase(rc21)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'X' won!\nWant to play again?", "X won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
        } else if (rc03.equalsIgnoreCase("o")) {
            if (rc03.equalsIgnoreCase(rc12) && rc03.equalsIgnoreCase(rc21)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'O' won!\nWant to play again?", "O won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
        }

        // - mid
        if (rc11.equalsIgnoreCase("x")) {
            if (rc11.equalsIgnoreCase(rc12) && rc11.equalsIgnoreCase(rc13)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'X' won!\nWant to play again?", "X won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
        } else if (rc11.equalsIgnoreCase("o")) {
            if (rc11.equalsIgnoreCase(rc12) && rc11.equalsIgnoreCase(rc13)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'O' won!\nWant to play again?", "O won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
        }

        // | mid
        if (rc02.equalsIgnoreCase("x")) {
            if (rc02.equalsIgnoreCase(rc12) && rc02.equalsIgnoreCase(rc22)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'X' won!\nWant to play again?", "X won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
        } else if (rc02.equalsIgnoreCase("o")) {
            if (rc02.equalsIgnoreCase(rc12) && rc02.equalsIgnoreCase(rc22)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'O' won!\nWant to play again?", "O won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
        }

        // _| 
        if (rc23.equalsIgnoreCase("x")) {
            if (rc23.equalsIgnoreCase(rc13) && rc23.equalsIgnoreCase(rc03)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'X' won!\nWant to play again?", "X won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
            if (rc23.equalsIgnoreCase(rc22) && rc23.equalsIgnoreCase(rc21)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'X' won!\nWant to play again?", "X won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
        } else if (rc23.equalsIgnoreCase("o")) {
            if (rc23.equalsIgnoreCase(rc13) && rc23.equalsIgnoreCase(rc03)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'O' won!\nWant to play again?", "O won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
            if (rc23.equalsIgnoreCase(rc22) && rc23.equalsIgnoreCase(rc21)) {
                retVal = true;
                int yn = JOptionPane.showConfirmDialog(null, "Hurray! 'O' won!\nWant to play again?", "O won!", JOptionPane.YES_NO_OPTION);
                if (yn == 0) {
                    dispose();
                    new Tic_Tac_Toe();
                } else {
                    System.exit(0);
                }
            }
        }

        if (i == 9 && retVal == false) {
            int yn = JOptionPane.showConfirmDialog(null, "The game was draw.\nWant to play again?", "Draw", JOptionPane.YES_NO_OPTION);
            if (yn == 0) {
                dispose();
                new Tic_Tac_Toe();
            } else {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new Tic_Tac_Toe();
    }
    
    private void process(JButton button){
        if (button.isEnabled() && "".equals(xo)) {
                lturn.setText("O's Trun");
                button.setText("X");
                button.setEnabled(false);
                xo = "X";
                
                i++;
            }
            if (button.isEnabled() && "X".equals(xo)) {
                lturn.setText("X's Trun");
                button.setText("O");
                button.setEnabled(false);
                xo = "O";
                
                i++;
            }
            if (button.isEnabled() && "O".equals(xo)) {
                lturn.setText("O's Trun");
                button.setText("X");
                button.setEnabled(false);
                xo = "X";
                
                i++;
            }
    }
}
