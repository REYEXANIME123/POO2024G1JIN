/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author TM Technologies EIRL
 */
public class Java_TicTacToe extends javax.swing.JFrame {
    
    private String startGame ="X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    


    public Java_TicTacToe() {
        initComponents();
    }
    
    private void gameScore()
    {
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
    }
    
        private void choose_a_Player()
    {
         if(startGame.equalsIgnoreCase("X"))
         {
             startGame = "O";
         }
         else
              {
             startGame = "X";
         }
    }
        
    private void winningGame()
    {
        String b1 = jbtnTic1.getText();
        String b2 = jbtnTic2.getText();
        String b3 = jbtnTic3.getText();
        String b4 = jbtnTic4.getText();
        String b5 = jbtnTic5.getText();
        String b6 = jbtnTic6.getText();
        String b7 = jbtnTic7.getText();
        String b8 = jbtnTic8.getText();
        String b9 = jbtnTic9.getText();
        
        if(b1 ==("X") && b2 ==("X") && b3 ==("X") )
        {
            JOptionPane.showMessageDialog(this,"PlayerX Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic2.setBackground(Color.ORANGE);
            jbtnTic3.setBackground(Color.ORANGE);
            xCount++;
            gameScore();
            
        }
        
        if(b4 ==("X") && b5 ==("X") && b6 ==("X") )
        {
            JOptionPane.showMessageDialog(this,"PlayerX Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic4.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
            xCount++;
            gameScore();
            
        }
        
        if(b7 ==("X") && b8 ==("X") && b9 ==("X") )
        {
            JOptionPane.showMessageDialog(this,"PlayerX Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            
        }
        
        if(b1 ==("O") && b2 ==("O") && b3 ==("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic1.setBackground(Color.BLUE);
            jbtnTic2.setBackground(Color.BLUE);
            jbtnTic3.setBackground(Color.BLUE);
            oCount++;
            gameScore();
            
        }
        
        if(b4 ==("O") && b5 ==("O") && b6 ==("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic1.setBackground(Color.DARK_GRAY);
            jbtnTic2.setBackground(Color.DARK_GRAY);
            jbtnTic3.setBackground(Color.DARK_GRAY);
            oCount++;
            gameScore();
            
        }
        
        if(b7 ==("O") && b8 ==("O") && b9 ==("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic7.setBackground(Color.YELLOW);
            jbtnTic8.setBackground(Color.YELLOW);
            jbtnTic9.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
            
        }
        
        if(b1 ==("X") && b4 ==("X") && b7 ==("X") )
        {
            JOptionPane.showMessageDialog(this,"PlayerX Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic1.setBackground(Color.MAGENTA);
            jbtnTic4.setBackground(Color.MAGENTA);
            jbtnTic7.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
            
        }
        
        if(b2 ==("X") && b5 ==("X") && b8 ==("X") )
        {
            JOptionPane.showMessageDialog(this,"PlayerX Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic2.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic8.setBackground(Color.PINK);
            xCount++;
            gameScore();
            
        }
        
         if(b3 ==("X") && b6 ==("X") && b9 ==("X") )
        {
            JOptionPane.showMessageDialog(this,"PlayerX Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic3.setBackground(Color.MAGENTA);
            jbtnTic6.setBackground(Color.MAGENTA);
            jbtnTic9.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
            
        }
         
          if(b1 ==("X") && b5 ==("X") && b9 ==("X") )
        {
            JOptionPane.showMessageDialog(this,"PlayerX Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic1.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic9.setBackground(Color.PINK);
            xCount++;
            gameScore();
            
        }
          
          if(b3 ==("X") && b5 ==("X") && b7 ==("X") )
        {
            JOptionPane.showMessageDialog(this,"PlayerX Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic3.setBackground(Color.GRAY);
            jbtnTic5.setBackground(Color.GRAY);
            jbtnTic7.setBackground(Color.GRAY);
            xCount++;
            gameScore();
            
        }
          
          if(b1 ==("O") && b4 ==("O") && b7 ==("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic1.setBackground(Color.MAGENTA);
            jbtnTic4.setBackground(Color.MAGENTA);
            jbtnTic7.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
            
        }
        
        if(b2 ==("O") && b5 ==("O") && b8 ==("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic2.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic8.setBackground(Color.PINK);
            xCount++;
            gameScore();
            
        }
        
         if(b3 ==("O") && b6 ==("O") && b9 ==("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic3.setBackground(Color.MAGENTA);
            jbtnTic6.setBackground(Color.MAGENTA);
            jbtnTic9.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
            
        }
         
          if(b1 ==("O") && b5 ==("O") && b9 ==("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic1.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic9.setBackground(Color.PINK);
            xCount++;
            gameScore();
            
        }
          
          if(b3 ==("O") && b5 ==("O") && b7 ==("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jbtnTic3.setBackground(Color.GRAY);
            jbtnTic5.setBackground(Color.GRAY);
            jbtnTic7.setBackground(Color.GRAY);
            xCount++;
            gameScore();
            
        }
          
          
          
    }    
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblPlayerO = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        lblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jbtnNewGame = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(95, 158, 160));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -60, 400, 50));

        jbtnTic5.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 130, 120));

        jbtnTic1.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 120));

        jbtnTic2.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, 120));

        jbtnTic3.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 130, 120));

        jbtnTic6.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 130, 120));

        jbtnTic4.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 120));

        jbtnTic7.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 130, 120));

        jbtnTic8.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 130, 120));

        jbtnTic9.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 130, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 480, 460));

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPlayerO.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        lblPlayerO.setText("Player O:");
        jPanel7.add(lblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 300, 90));

        jlblPlayerX.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);
        jPanel7.add(jlblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 270, 80));

        jlblPlayerO.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setOpaque(true);
        jPanel7.add(jlblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 270, 80));

        lblPlayerX.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        lblPlayerX.setText("Player X:");
        jPanel7.add(lblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 300, 100));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 600, 190));

        jPanel8.setBackground(new java.awt.Color(95, 158, 160));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnNewGame.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnNewGame.setText("New Game");
        jbtnNewGame.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewGameActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 90));

        jbtnReset.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnReset.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnReset.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 290, 100));

        jbtnExit.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnExit.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnExit.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 260, 100));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 600, 220));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 640, 460));

        jPanel10.setBackground(new java.awt.Color(95, 158, 160));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Java Advance Tic Tac Toe Game");
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 1070, 70));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1110, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",
            JOptionPane.YES_NO_OPTION   )==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
        
        
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewGameActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jlblPlayerX.setText("0");
        jlblPlayerO.setText("0");
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnNewGameActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
        jbtnTic1.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;   
        }
        else
            {
           checker = true;   
        }
        choose_a_Player();
        winningGame();
        
            
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
        jbtnTic2.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;   
        }
        else
            {
           checker = true;   
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
        jbtnTic3.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;   
        }
        else
            {
           checker = true;   
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
        jbtnTic4.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;   
        }
        else
            {
           checker = true;   
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        jbtnTic5.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;   
        }
        else
            {
           checker = true;   
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        jbtnTic6.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;   
        }
        else
            {
           checker = true;   
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
        jbtnTic7.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;   
        }
        else
            {
           checker = true;   
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        jbtnTic8.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;   
        }
        else
            {
           checker = true;   
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
        jbtnTic9.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;   
        }
        else
            {
           checker = true;   
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed

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
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNewGame;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    private javax.swing.JLabel lblPlayerO;
    private javax.swing.JLabel lblPlayerX;
    // End of variables declaration//GEN-END:variables
}
