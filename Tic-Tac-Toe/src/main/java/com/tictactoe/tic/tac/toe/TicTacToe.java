/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tictactoe.tic.tac.toe;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Bahadır
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Player X :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Player O :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("0");

        jButton10.setText("Restart");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Reset Scores");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("?");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (playerCounter % 2 == 0) {
            jButton1.setText("X");
        } else {
            jButton1.setText("O");
        }
        ++playerCounter;
        gameChecker("Button1");
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (playerCounter % 2 == 0) {
            jButton2.setText("X");
        } else {
            jButton2.setText("O");
        }
        ++playerCounter;
        gameChecker("Button2");
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (playerCounter % 2 == 0) {
            jButton3.setText("X");
        } else {
            jButton3.setText("O");
        }
         ++playerCounter;
        gameChecker("Button3");
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (playerCounter % 2 == 0) {
            jButton4.setText("X");
        } else {
            jButton4.setText("O");
        }
         ++playerCounter;
        gameChecker("Button4");
        jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (playerCounter % 2 == 0) {
            jButton5.setText("X");
        } else {
            jButton5.setText("O");
        }
        ++playerCounter;
        gameChecker("Button5");
        jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (playerCounter % 2 == 0) {
            jButton7.setText("X");
        } else {
            jButton7.setText("O");
        }
        ++playerCounter;
        gameChecker("Button7");
        jButton7.setEnabled(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (playerCounter % 2 == 0) {
            jButton6.setText("X");
        } else {
            jButton6.setText("O");
        }
        ++playerCounter;
        gameChecker("Button6");
        jButton6.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (playerCounter % 2 == 0) {
            jButton9.setText("X");
        } else {
            jButton9.setText("O");
        }
        ++playerCounter;
        gameChecker("Button9");
        jButton9.setEnabled(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (playerCounter % 2 == 0) {
            jButton8.setText("X");
        } else {
            jButton8.setText("O");
        }
        ++playerCounter;
        gameChecker("Button8");
        jButton8.setEnabled(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        gameRestarter();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        scoreResetter();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        JOptionPane.showMessageDialog(jButton5, "<html>Developed by <b>Bahadir asilsoy</b></html>", "TicTacToe Game", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton12ActionPerformed
    private void gameChecker(String buttonName) {
        switch (buttonName) {
            case "Button1":
                String asdas = jButton1.getText();
                if (jButton2.getText() == asdas && jButton3.getText() == asdas) {
                    System.out.println(asdas + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton4.getText() == asdas && jButton6.getText() == asdas) {
                    System.out.println(asdas + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton5.getText() == asdas && jButton8.getText() == asdas) {
                    System.out.println(asdas + "kazandı");
                    scoreboard();
                    afterWin();
                }
                break;
            case "Button2":
                String asdas2 = jButton2.getText();
                if (jButton1.getText() == asdas2 && jButton3.getText() == asdas2) {
                    System.out.println(asdas2 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton5.getText() == asdas2 && jButton9.getText() == asdas2) {
                    System.out.println(asdas2 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                break;
            case "Button3":
                String asdas3 = jButton3.getText();
                if (jButton1.getText() == asdas3 && jButton2.getText() == asdas3) {
                    System.out.println(asdas3 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton7.getText() == asdas3 && jButton8.getText() == asdas3) {
                    System.out.println(asdas3 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton5.getText() == asdas3 && jButton6.getText() == asdas3) {
                    System.out.println(asdas3 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                break;
            case "Button4":
                String asdas4 = jButton4.getText();
                if (jButton1.getText() == asdas4 && jButton6.getText() == asdas4) {
                    System.out.println(asdas4 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton5.getText() == asdas4 && jButton7.getText() == asdas4) {
                    System.out.println(asdas4 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                break;
            case "Button5":
                String asdas5 = jButton5.getText();
                if (jButton1.getText() == asdas5 && jButton8.getText() == asdas5) {
                    System.out.println(asdas5 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton4.getText() == asdas5 && jButton7.getText() == asdas5) {
                    System.out.println(asdas5 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton3.getText() == asdas5 && jButton6.getText() == asdas5) {
                    System.out.println(asdas5 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton2.getText() == asdas5 && jButton9.getText() == asdas5) {
                    System.out.println(asdas5 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                break;
            case "Button7":
                String asdas7 = jButton7.getText();
                if (jButton4.getText() == asdas7 && jButton5.getText() == asdas7) {
                    System.out.println(asdas7 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton3.getText() == asdas7 && jButton8.getText() == asdas7) {
                    System.out.println(asdas7 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                break;
            case "Button6":
                String asdas6 = jButton6.getText();
                if (jButton1.getText() == asdas6 && jButton4.getText() == asdas6) {
                    System.out.println(asdas6 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton3.getText() == asdas6 && jButton5.getText() == asdas6) {
                    System.out.println(asdas6 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton8.getText() == asdas6 && jButton9.getText() == asdas6) {
                    System.out.println(asdas6 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                break;
            case "Button9":
                String asdas9 = jButton9.getText();
                if (jButton2.getText() == asdas9 && jButton5.getText() == asdas9) {
                    System.out.println(asdas9 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton6.getText() == asdas9 && jButton8.getText() == asdas9) {
                    System.out.println(asdas9 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                break;
            case "Button8":
                String asdas8 = jButton8.getText();
                if (jButton1.getText() == asdas8 && jButton5.getText() == asdas8) {
                    System.out.println(asdas8 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton6.getText() == asdas8 && jButton9.getText() == asdas8) {
                    System.out.println(asdas8 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                if (jButton3.getText() == asdas8 && jButton7.getText() == asdas8) {
                    System.out.println(asdas8 + "kazandı");
                    scoreboard();
                    afterWin();
                }
                break;
            default:
            // code block
        }

    }

    public void gameRestarter() {
        jButton1.setText("");
        jButton1.setEnabled(true);
        jButton2.setText("");
        jButton2.setEnabled(true);
        jButton3.setText("");
        jButton3.setEnabled(true);
        jButton4.setText("");
        jButton4.setEnabled(true);
        jButton5.setText("");
        jButton5.setEnabled(true);
        jButton6.setText("");
        jButton6.setEnabled(true);
        jButton7.setText("");
        jButton7.setEnabled(true);
        jButton8.setText("");
        jButton8.setEnabled(true);
        jButton9.setText("");
        jButton9.setEnabled(true);
    }

    public void scoreResetter() {
        jLabel3.setText("0");
        jLabel4.setText("0");
        jLabel4.setForeground(Color.BLACK);
        jLabel3.setForeground(Color.BLACK);
    }

    public void scoreboard() {
        int paspas = 1 + Integer.valueOf(jLabel3.getText());
        int paspas2 = 1 + Integer.valueOf(jLabel4.getText());
        if (playerCounter % 2 == 0) {
            jLabel3.setText(String.valueOf(paspas));
            JOptionPane.showMessageDialog(jButton5, "O WIN !");
        } else if (playerCounter % 2 != 0) {
            jLabel4.setText(String.valueOf(paspas2));
            JOptionPane.showMessageDialog(jButton5, "X WIN !");
        }
        if (paspas2 > paspas) {
            jLabel4.setForeground(Color.RED);
            jLabel3.setForeground(Color.GREEN);

        } else {
            jLabel4.setForeground(Color.GREEN);
            jLabel3.setForeground(Color.RED);

        }
        playerCounter = 0;
    }

    public void afterWin() {
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        playerCounter = 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }
    private int playerCounter = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
