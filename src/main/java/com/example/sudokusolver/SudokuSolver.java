package com.example.sudokusolver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SudokuSolver extends JFrame implements ActionListener {
        private String turn = "1";
        private boolean globalFlag = true;
        private String solvedBoard[][] = {
                {"2","9","8","5","1","6","7","3","4"},
                {"4","1","3","2","7","8","5","6","9"},
                {"7","5","6","3","4","9","1","2","8"},
                {"8","2","1","4","3","5","6","9","7"},
                {"5","3","4","6","9","7","2","8","1"},
                {"9","6","7","1","8","2","3","4","5"},
                {"1","4","2","8","5","3","9","7","6"},
                {"3","7","5","9","6","4","8","1","2"},
                {"6","8","9","7","2","1","4","5","3"}
        };
        public SudokuSolver(){
                r1c1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r1c1ActionPerformed(e);
                        }
                });
                r1c2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r1c2ActionPerformed(e);
                        }
                });
                r1c3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r1c3ActionPerformed(e);
                        }
                });
                r1c4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r1c4ActionPerformed(e);
                        }
                });
                r1c5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r1c5ActionPerformed(e);
                        }
                });
                r1c6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r1c6ActionPerformed(e);
                        }
                });
                r1c7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r1c7ActionPerformed(e);
                        }
                });
                r1c8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r1c8ActionPerformed(e);
                        }
                });
                r1c9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r1c9ActionPerformed(e);
                        }
                });
                r2c1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r2c1ActionPerformed(e);
                        }
                });
                r2c2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r2c2ActionPerformed(e);
                        }
                });
                r2c3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r2c3ActionPerformed(e);
                        }
                });
                r2c4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r2c4ActionPerformed(e);
                        }
                });
                r2c5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r2c5ActionPerformed(e);
                        }
                });
                r2c6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r2c6ActionPerformed(e);
                        }
                });
                r2c7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r2c5ActionPerformed(e);
                        }
                });
                r2c8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r2c8ActionPerformed(e);
                        }
                });
                r2c9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r2c9ActionPerformed(e);
                        }
                });
                r3c1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r3c1ActionPerformed(e);
                        }
                });
                r3c2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r3c2ActionPerformed(e);
                        }
                });
                r3c3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r3c3ActionPerformed(e);
                        }
                });
                r3c4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r3c4ActionPerformed(e);
                        }
                });
                r3c5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r3c5ActionPerformed(e);
                        }
                });
                r3c6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r3c6ActionPerformed(e);
                        }
                });
                r3c7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r3c7ActionPerformed(e);
                        }
                });
                r3c8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r3c8ActionPerformed(e);
                        }
                });
                r3c9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r3c9ActionPerformed(e);
                        }
                });
                r4c1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r4c1ActionPerformed(e);
                        }
                });
                r4c2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r4c2ActionPerformed(e);
                        }
                });
                r4c3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r4c3ActionPerformed(e);
                        }
                });
                r4c4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r4c4ActionPerformed(e);
                        }
                });
                r4c5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r4c5ActionPerformed(e);
                        }
                });
                r4c6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r4c6ActionPerformed(e);
                        }
                });
                r4c7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r4c7ActionPerformed(e);
                        }
                });
                r4c8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r4c8ActionPerformed(e);
                        }
                });
                r4c9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r4c9ActionPerformed(e);
                        }
                });
                r5c1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r5c1ActionPerformed(e);
                        }
                });
                r5c2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r5c2ActionPerformed(e);
                        }
                });
                r5c3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r5c3ActionPerformed(e);
                        }
                });
                r5c4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r5c4ActionPerformed(e);
                        }
                });
                r5c5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r5c5ActionPerformed(e);
                        }
                });
                r5c6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r5c6ActionPerformed(e);
                        }
                });
                r5c7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r5c7ActionPerformed(e);
                        }
                });
                r5c8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r5c8ActionPerformed(e);
                        }
                });
                r5c9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r5c9ActionPerformed(e);
                        }
                });
                r6c1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r6c1ActionPerformed(e);
                        }
                });
                r6c2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r6c2ActionPerformed(e);
                        }
                });
                r6c3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r6c3ActionPerformed(e);
                        }
                });
                r6c4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r6c4ActionPerformed(e);
                        }
                });
                r6c5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r6c5ActionPerformed(e);
                        }
                });
                r6c6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r6c6ActionPerformed(e);
                        }
                });
                r6c7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r6c7ActionPerformed(e);
                        }
                });
                r6c8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r6c8ActionPerformed(e);
                        }
                });
                r6c9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r6c9ActionPerformed(e);
                        }
                });
                r7c1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r7c1ActionPerformed(e);
                        }
                });
                r7c2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r7c2ActionPerformed(e);
                        }
                });
                r7c3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r7c3ActionPerformed(e);
                        }
                });
                r7c4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r7c4ActionPerformed(e);
                        }
                });
                r7c5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r7c5ActionPerformed(e);
                        }
                });
                r7c6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r7c6ActionPerformed(e);
                        }
                });
                r7c7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r7c7ActionPerformed(e);
                        }
                });
                r7c8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r7c8ActionPerformed(e);
                        }
                });
                r7c9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r7c9ActionPerformed(e);
                        }
                });
                r8c1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r8c1ActionPerformed(e);
                        }
                });
                r8c2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r8c2ActionPerformed(e);
                        }
                });
                r8c3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r8c3ActionPerformed(e);
                        }
                });
                r8c4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r8c4ActionPerformed(e);
                        }
                });
                r8c5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r8c5ActionPerformed(e);
                        }
                });
                r8c6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r8c6ActionPerformed(e);
                        }
                });
                r8c7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r8c7ActionPerformed(e);
                        }
                });
                r8c8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r8c8ActionPerformed(e);
                        }
                });
                r8c9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r8c9ActionPerformed(e);
                        }
                });
                r9c1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r9c1ActionPerformed(e);
                        }
                });
                r9c2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r9c2ActionPerformed(e);
                        }
                });
                r9c3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r9c3ActionPerformed(e);
                        }
                });
                r9c4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r9c4ActionPerformed(e);
                        }
                });
                r9c5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r9c5ActionPerformed(e);
                        }
                });
                r9c6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r9c6ActionPerformed(e);
                        }
                });
                r9c7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r9c7ActionPerformed(e);
                        }
                });
                r9c8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r9c8ActionPerformed(e);
                        }
                });
                r9c9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                r9c9ActionPerformed(e);
                        }
                });
                select1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                select1ActionPerformed(e);
                        }
                });
                select2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                select2ActionPerformed(e);
                        }
                });
                select3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                select3ActionPerformed(e);
                        }
                });
                select4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                select4ActionPerformed(e);
                        }
                });
                select5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                select5ActionPerformed(e);
                        }
                });
                select6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                select6ActionPerformed(e);
                        }
                });
                select7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                select7ActionPerformed(e);
                        }
                });
                select8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                select8ActionPerformed(e);
                        }
                });
                select9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                select9ActionPerformed(e);
                        }
                });
                button82.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                resetActionPerformed(e);
                        }
                });
                button84.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                exitActionPerformed(e);
                        }
                });
                button83.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                seeSolution();
                        }
                });
                button85.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                checkMoves();
                        }
                });
        }
        private void checkMoves(){
                JButton btns[][] = {
                        {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                        {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                        {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                        {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                        {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                        {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                        {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                        {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                        {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
                };
                for(int i=0; i<9; i++) {
                        for (int j = 0; j < 9; j++) {
                                if(btns[i][j].getText() != solvedBoard[i][j] && !btns[i][j].getText().equals("")){
                                        btns[i][j].setBackground(Color.red);
                                }
                        }
                }
        }
        private void seeSolution(){
                JButton predefBtns[] = {r1c4, r1c7, r1c8, r1c9, r2c1, r2c5, r2c6, r2c7, r2c9, r3c1, r3c3, r3c5, r3c8, r4c5, r4c6, r4c8, r5c2, r5c3, r5c7, r5c8, r6c2, r6c4, r6c5,
                        r7c2, r7c5, r7c7, r7c9, r8c1, r8c4, r8c5, r8c9, r9c1, r9c2, r9c3, r9c6};
                JButton btns[][] = {
                        {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                        {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                        {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                        {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                        {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                        {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                        {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                        {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                        {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
                };
                if(globalFlag){
                        globalFlag = false;
                        button83.setText("Hide Solution");
                        for(int i=0; i<9; i++){
                                for(int j=0; j<9; j++){
                                        boolean flag = true;
                                        for(int k=0; k<predefBtns.length; k++){
                                                if(btns[i][j] == predefBtns[k]) flag = false;
                                        }
                                        if(flag){
                                                btns[i][j].setText(solvedBoard[i][j]);
                                                btns[i][j].setBackground(Color.white);
                                                btns[i][j].setForeground(Color.black);
                                        }
                                }
                        }
                }
                else{
                        globalFlag = true;
                        button83.setText("Solution");
                        ResetGame();
                }

        }
        private void exitActionPerformed(ActionEvent e){
                JFrame frame = new JFrame("Exit");
                if(JOptionPane.showConfirmDialog(frame,"Confirm if you wan tto exit","Sudoku puzzle",JOptionPane.YES_NO_OPTION)==
                JOptionPane.YES_NO_OPTION){
                        System.exit(0);
                }
        }
        private void ResetGame(){
                JButton predefBtns[] = {r1c4, r1c7, r1c8, r1c9, r2c1, r2c5, r2c6, r2c7, r2c9, r3c1, r3c3, r3c5, r3c8, r4c5, r4c6, r4c8, r5c2, r5c3, r5c7, r5c8, r6c2, r6c4, r6c5,
                        r7c2, r7c5, r7c7, r7c9, r8c1, r8c4, r8c5, r8c9, r9c1, r9c2, r9c3, r9c6};
                JButton btns[][] = {
                        {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                        {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                        {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                        {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                        {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                        {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                        {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                        {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                        {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
                };
                for(int i=0; i<9; i++){
                        for(int j=0; j<9; j++){
                                boolean flg = true;
                                for (int k=0; k<predefBtns.length; k++){
                                        if(btns[i][j] == predefBtns[k]){
                                                flg = false;
                                        }
                                }
                                if(flg){
                                        btns[i][j].setText("");
                                        btns[i][j].setForeground(Color.black);
                                        btns[i][j].setBackground(Color.white);
                                }
                        }
                }
        }
        private void resetActionPerformed(ActionEvent e){
                JFrame frame = new JFrame("Reset");
                if(JOptionPane.showConfirmDialog(frame,"Confirm if you want reset the game","Sudoku Puzzle",JOptionPane.YES_NO_OPTION)
                ==JOptionPane.YES_NO_OPTION){
                        ResetGame();
                }

        }
        private void assignTurn(JButton b){
                select1.setBackground(Color.yellow);
                select2.setBackground(Color.yellow);
                select3.setBackground(Color.yellow);
                select4.setBackground(Color.yellow);
                select5.setBackground(Color.yellow);
                select6.setBackground(Color.yellow);
                select7.setBackground(Color.yellow);
                select8.setBackground(Color.yellow);
                select9.setBackground(Color.yellow);
                b.setBackground(Color.blue);
        }
        private void select1ActionPerformed(ActionEvent e){
                turn = "1";
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
                assignTurn(select1);
        }
        private void select2ActionPerformed(ActionEvent e){
                assignTurn(select2);
                turn = "2";
        }
        private void select3ActionPerformed(ActionEvent e){
                assignTurn(select3);
                turn = "3";
        }
        private void select4ActionPerformed(ActionEvent e){
                assignTurn(select4);
                turn = "4";
        }
        private void select5ActionPerformed(ActionEvent e){
                assignTurn(select5);
                turn = "5";
        }
        private void select6ActionPerformed(ActionEvent e){
                assignTurn(select6);
                turn = "6";
        }
        private void select7ActionPerformed(ActionEvent e){
                assignTurn(select7);
                turn = "7";
        }
        private void select8ActionPerformed(ActionEvent e){
                assignTurn(select8);
                turn = "8";
        }
        private void select9ActionPerformed(ActionEvent e){
                assignTurn(select9);
                turn = "9";
        }
        public void r1c1ActionPerformed(ActionEvent e){
                r1c1.setText(turn);
                r1c1.setBackground(Color.white);
        }
        private void r1c2ActionPerformed(ActionEvent e){
                r1c2.setText(turn);
                r1c2.setBackground(Color.white);
        }
        private void r1c3ActionPerformed(ActionEvent e){
                r1c3.setText(turn);
                r1c3.setBackground(Color.white);
        }
        private void r1c4ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r1c5ActionPerformed(ActionEvent e){
                r1c5.setText(turn);
                r1c5.setBackground(Color.white);
        }
        private void r1c6ActionPerformed(ActionEvent e){
                r1c6.setText(turn);
                r1c6.setBackground(Color.white);
        }
        private void r1c7ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r1c8ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r1c9ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r2c1ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r2c2ActionPerformed(ActionEvent e){
                r2c2.setText(turn);
                r2c2.setBackground(Color.white);
        }
        private void r2c3ActionPerformed(ActionEvent e){
                r2c3.setText(turn);
                r2c3.setBackground(Color.white);
        }
        private void r2c4ActionPerformed(ActionEvent e){
                r2c4.setText(turn);
                r2c4.setBackground(Color.white);
        }
        private void r2c5ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r2c6ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r2c7ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r2c8ActionPerformed(ActionEvent e){
                r2c8.setText(turn);
                r2c8.setBackground(Color.white);
        }
        private void r2c9ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r3c1ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r3c2ActionPerformed(ActionEvent e){
                r3c2.setText(turn);
                r3c2.setBackground(Color.white);
        }
        private void r3c3ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r3c4ActionPerformed(ActionEvent e){
                r3c4.setText(turn);
                r3c4.setBackground(Color.white);
        }
        private void r3c5ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r3c6ActionPerformed(ActionEvent e){
                r3c6.setText(turn);
                r3c6.setBackground(Color.white);
        }
        private void r3c7ActionPerformed(ActionEvent e){
                r3c7.setText(turn);
                r3c7.setBackground(Color.white);
        }
        private void r3c8ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r3c9ActionPerformed(ActionEvent e){
                r3c9.setText(turn);
                r3c9.setBackground(Color.white);
        }
        private void r4c1ActionPerformed(ActionEvent e){
                r4c1.setText(turn);
                r4c1.setBackground(Color.white);
        }
        private void r4c2ActionPerformed(ActionEvent e){
                r4c2.setText(turn);
                r4c2.setBackground(Color.white);
        }
        private void r4c3ActionPerformed(ActionEvent e){
                r4c3.setText(turn);
                r4c3.setBackground(Color.white);
        }
        private void r4c4ActionPerformed(ActionEvent e){
                r4c4.setText(turn);
                r4c4.setBackground(Color.white);
        }
        private void r4c5ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r4c6ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r4c7ActionPerformed(ActionEvent e){
                r4c7.setText(turn);
                r4c7.setBackground(Color.white);
        }
        private void r4c8ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r4c9ActionPerformed(ActionEvent e){
                r4c9.setText(turn);
                r4c9.setBackground(Color.white);
        }
        private void r5c1ActionPerformed(ActionEvent e){
                r5c1.setText(turn);
                r5c1.setBackground(Color.white);
        }
        private void r5c2ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r5c3ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r5c4ActionPerformed(ActionEvent e){
                r5c4.setText(turn);
                r5c4.setBackground(Color.white);
        }
        private void r5c5ActionPerformed(ActionEvent e){
                r5c5.setText(turn);
                r5c5.setBackground(Color.white);
        }
        private void r5c6ActionPerformed(ActionEvent e){
                r5c6.setText(turn);
                r5c6.setBackground(Color.white);
        }
        private void r5c7ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r5c8ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r5c9ActionPerformed(ActionEvent e){
                r5c9.setText(turn);
                r5c9.setBackground(Color.white);
        }
        private void r6c1ActionPerformed(ActionEvent e){
                r6c1.setText(turn);
                r6c1.setBackground(Color.white);
        }
        private void r6c2ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r6c3ActionPerformed(ActionEvent e){
                r6c3.setText(turn);
                r6c3.setBackground(Color.white);
        }
        private void r6c4ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r6c5ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r6c6ActionPerformed(ActionEvent e){
                r6c6.setText(turn);
                r6c6.setBackground(Color.white);
        }
        private void r6c7ActionPerformed(ActionEvent e){
                r6c7.setText(turn);
                r6c7.setBackground(Color.white);
        }
        private void r6c8ActionPerformed(ActionEvent e){
                r6c8.setText(turn);
                r6c8.setBackground(Color.white);
        }
        private void r6c9ActionPerformed(ActionEvent e){
                r6c9.setText(turn);
                r6c9.setBackground(Color.white);
        }
        private void r7c1ActionPerformed(ActionEvent e){
                r7c1.setText(turn);
                r7c1.setBackground(Color.white);
        }
        private void r7c2ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r7c3ActionPerformed(ActionEvent e){
                r7c3.setText(turn);
                r7c3.setBackground(Color.white);
        }
        private void r7c4ActionPerformed(ActionEvent e){
                r7c4.setText(turn);
                r7c4.setBackground(Color.white);
        }
        private void r7c5ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r7c6ActionPerformed(ActionEvent e){
                r7c6.setText(turn);
                r7c6.setBackground(Color.white);
        }
        private void r7c7ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r7c8ActionPerformed(ActionEvent e){
                r7c8.setText(turn);
                r7c8.setBackground(Color.white);
        }
        private void r7c9ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r8c1ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r8c2ActionPerformed(ActionEvent e){
                r8c2.setText(turn);
                r8c2.setBackground(Color.white);
        }
        private void r8c3ActionPerformed(ActionEvent e){
                r8c3.setText(turn);
                r8c3.setBackground(Color.white);
        }
        private void r8c4ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r8c5ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r8c6ActionPerformed(ActionEvent e){
                r8c6.setText(turn);
                r8c6.setBackground(Color.white);
        }
        private void r8c7ActionPerformed(ActionEvent e){
                r8c7.setText(turn);
                r8c7.setBackground(Color.white);
        }
        private void r8c8ActionPerformed(ActionEvent e){
                r8c8.setText(turn);
                r8c8.setBackground(Color.white);
        }
        private void r8c9ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r9c1ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r9c2ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r9c3ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r9c4ActionPerformed(ActionEvent e){
                r9c4.setText(turn);
                r9c4.setBackground(Color.white);
        }
        private void r9c5ActionPerformed(ActionEvent e){
                r9c5.setText(turn);
                r9c5.setBackground(Color.white);
        }
        private void r9c6ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        private void r9c7ActionPerformed(ActionEvent e){
                r9c7.setText(turn);
                r9c7.setBackground(Color.white);
        }
        private void r9c8ActionPerformed(ActionEvent e){
                r9c8.setText(turn);
                r9c8.setBackground(Color.white);
        }
        private void r9c9ActionPerformed(ActionEvent e){
                r9c9.setText(turn);
                r9c9.setBackground(Color.white);
        }
        private JPanel panel1;
        private JButton button82;
        private JButton button85;
        private JButton button83;
        private JButton button84;
        private JButton r1c1;
        private JButton r1c3;
        private JButton r1c2;
        private JButton r2c1;
        private JButton r3c2;
        private JButton r3c3;
        private JButton r3c1;
        private JButton r2c2;
        private JButton r2c3;
        private JButton r2c4;
        private JButton r3c6;
        private JButton r2c5;
        private JButton r3c5;
        private JButton r1c4;
        private JButton r2c6;
        private JButton r1c5;
        private JButton r1c6;
        private JButton r3c4;
        private JButton r2c7;
        private JButton r2c8;
        private JButton r3c7;
        private JButton r1c9;
        private JButton r3c9;
        private JButton r1c8;
        private JButton r2c9;
        private JButton r3c8;
        private JButton r1c7;
        private JButton r5c1;
        private JButton r6c3;
        private JButton r5c2;
        private JButton r6c2;
        private JButton r4c1;
        private JButton r5c3;
        private JButton r4c2;
        private JButton r4c3;
        private JButton r6c1;
        private JButton r6c6;
        private JButton r6c4;
        private JButton r6c5;
        private JButton r4c4;
        private JButton r4c6;
        private JButton r5c6;
        private JButton r5c5;
        private JButton r4c5;
        private JButton r5c4;
        private JButton r5c9;
        private JButton r4c7;
        private JButton r5c8;
        private JButton r5c7;
        private JButton r4c8;
        private JButton r6c9;
        private JButton r6c8;
        private JButton r4c9;
        private JButton r6c7;
        private JButton r9c3;
        private JButton r9c2;
        private JButton r7c1;
        private JButton r7c3;
        private JButton r8c3;
        private JButton r8c2;
        private JButton r7c2;
        private JButton r8c1;
        private JButton r9c5;
        private JButton r9c6;
        private JButton r8c4;
        private JButton r8c5;
        private JButton r7c4;
        private JButton r8c6;
        private JButton r7c5;
        private JButton r9c4;
        private JButton r7c6;
        private JButton r9c8;
        private JButton r9c9;
        private JButton r8c7;
        private JButton r8c8;
        private JButton r7c7;
        private JButton r8c9;
        private JButton r7c8;
        private JButton r9c7;
        private JButton r7c9;
        private JButton select1;
        private JButton select2;
        private JButton select3;
        private JButton select5;
        private JButton select6;
        private JButton select4;
        private JButton select9;
        private JButton select8;
        private JButton select7;
        private JButton r9c1;
        public static void main(String[] args) {
            SudokuSolver ss = new SudokuSolver();
            ss.setContentPane(ss.panel1);
            ss.setTitle("Sudoku Solver");
            ss.setSize(500,700);
            ss.setVisible(true);
            ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
}
