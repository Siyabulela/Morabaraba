import java.awt.Color;
import javax.swing.JOptionPane;
public class NewJFrame extends javax.swing.JFrame
{
    String Player1, Player2;
    int count = 1;
    
    public NewJFrame()
    {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RD = new javax.swing.JButton();
        BLU = new javax.swing.JButton();
        Start = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Broadway", 3, 24)); // NOI18N
        jLabel1.setText("MORABARABA");

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        jLabel3.setText("1. SELECT A COLOR");

        RD.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        RD.setForeground(new java.awt.Color(255, 0, 0));
        RD.setText("RED");
        RD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDActionPerformed(evt);
            }
        });

        BLU.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        BLU.setForeground(new java.awt.Color(0, 51, 204));
        BLU.setText("BLUE");
        BLU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLUActionPerformed(evt);
            }
        });

        Start.setText("START");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(RD)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BLU))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(Start)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RD)
                    .addComponent(BLU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Start)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 391, 270);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("PLAYER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(70, 280, 290, 70);

        A1.setText("jButton1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        getContentPane().add(A1);
        A1.setBounds(420, 30, 26, 28);

        A2.setText("jButton1");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        getContentPane().add(A2);
        A2.setBounds(580, 30, 26, 28);

        A7.setText("jButton1");
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });
        getContentPane().add(A7);
        A7.setBounds(420, 350, 26, 28);

        A3.setText("jButton1");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        getContentPane().add(A3);
        A3.setBounds(740, 30, 26, 28);

        A6.setText("jButton1");
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });
        getContentPane().add(A6);
        A6.setBounds(580, 350, 26, 28);

        A5.setText("jButton1");
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });
        getContentPane().add(A5);
        A5.setBounds(740, 350, 26, 28);

        B7.setText("jButton1");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        getContentPane().add(B7);
        B7.setBounds(470, 290, 26, 28);

        B2.setText("jButton1");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2);
        B2.setBounds(580, 80, 26, 28);

        C1.setText("jButton1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        getContentPane().add(C1);
        C1.setBounds(520, 130, 26, 28);

        B1.setText("jButton1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1);
        B1.setBounds(470, 80, 26, 28);

        B8.setText("jButton1");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        getContentPane().add(B8);
        B8.setBounds(470, 190, 26, 28);

        B3.setText("jButton1");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3);
        B3.setBounds(690, 80, 26, 28);

        B4.setText("jButton1");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4);
        B4.setBounds(690, 190, 26, 28);

        C2.setText("jButton1");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        getContentPane().add(C2);
        C2.setBounds(580, 130, 26, 28);

        A4.setText("jButton1");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(A4);
        A4.setBounds(740, 190, 26, 28);

        B6.setText("jButton1");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        getContentPane().add(B6);
        B6.setBounds(580, 290, 26, 28);

        C3.setText("jButton1");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        getContentPane().add(C3);
        C3.setBounds(640, 130, 26, 28);

        C6.setText("jButton1");
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });
        getContentPane().add(C6);
        C6.setBounds(580, 240, 26, 28);

        C4.setText("jButton1");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });
        getContentPane().add(C4);
        C4.setBounds(640, 190, 26, 28);

        C5.setText("jButton1");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        getContentPane().add(C5);
        C5.setBounds(640, 240, 26, 28);

        B5.setText("jButton1");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5);
        B5.setBounds(690, 300, 26, 28);

        C7.setText("jButton1");
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        getContentPane().add(C7);
        C7.setBounds(520, 240, 26, 28);

        A8.setText("jButton1");
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });
        getContentPane().add(A8);
        A8.setBounds(420, 190, 26, 28);

        C8.setText("jButton1");
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });
        getContentPane().add(C8);
        C8.setBounds(520, 190, 26, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\SCHOOL\\TECHNICAL PROGRAMMING II\\Morabaraba\\unnamed.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 0, 380, 400);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(300, 400, 530, 20);

        setSize(new java.awt.Dimension(802, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BLUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLUActionPerformed
        Player1 =  "PLAYER BLUE";
        Player2 = "PLAYER RED";
        jLabel4.setText(Player1);
        RD.setEnabled(false);
    }//GEN-LAST:event_BLUActionPerformed

    private void RDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDActionPerformed
        Player1 = "PLAYER RED";
        Player2 = "PLAYER BLUE";
        jLabel4.setText(Player1);
        BLU.setEnabled(false);
    }//GEN-LAST:event_RDActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        jPanel1.setVisible(false);
    }//GEN-LAST:event_StartActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            A1.setBackground(java.awt.Color.red);
            A1.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            A1.setBackground(java.awt.Color.blue);
            A1.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            A2.setBackground(java.awt.Color.red);
            A2.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            A2.setBackground(java.awt.Color.blue);
            A2.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            A3.setBackground(java.awt.Color.red);
            A3.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            A3.setBackground(java.awt.Color.blue);
            A3.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            A4.setBackground(java.awt.Color.red);
            A4.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            A4.setBackground(java.awt.Color.blue);
            A4.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            A5.setBackground(java.awt.Color.red);
            A5.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            A5.setBackground(java.awt.Color.blue);
            A5.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            A6.setBackground(java.awt.Color.red);
            A6.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            A6.setBackground(java.awt.Color.blue);
            A6.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_A6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            A7.setBackground(java.awt.Color.red);
            A7.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            A7.setBackground(java.awt.Color.blue);
            A7.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_A7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            A8.setBackground(java.awt.Color.red);
            A8.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            A8.setBackground(java.awt.Color.blue);
            A8.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_A8ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            B1.setBackground(java.awt.Color.red);
            B1.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            B1.setBackground(java.awt.Color.blue);
            B1.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            B2.setBackground(java.awt.Color.red);
            B2.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            B2.setBackground(java.awt.Color.blue);
            B2.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            B3.setBackground(java.awt.Color.red);
            B3.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            B3.setBackground(java.awt.Color.blue);
            B3.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            B4.setBackground(java.awt.Color.red);
            B4.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            B4.setBackground(java.awt.Color.blue);
            B4.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            B5.setBackground(java.awt.Color.red);
            B5.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            B5.setBackground(java.awt.Color.blue);
            B5.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            B6.setBackground(java.awt.Color.red);
            B6.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            B6.setBackground(java.awt.Color.blue);
            B6.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            B7.setBackground(java.awt.Color.red);
            B7.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            B7.setBackground(java.awt.Color.blue);
            B7.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            B8.setBackground(java.awt.Color.red);
            B8.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            B8.setBackground(java.awt.Color.blue);
            B8.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_B8ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            C1.setBackground(java.awt.Color.red);
            C1.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            C1.setBackground(java.awt.Color.blue);
            A1.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            C2.setBackground(java.awt.Color.red);
            C2.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            C2.setBackground(java.awt.Color.blue);
            C2.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            C3.setBackground(java.awt.Color.red);
            C3.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            C3.setBackground(java.awt.Color.blue);
            C3.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            C4.setBackground(java.awt.Color.red);
            C4.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            C4.setBackground(java.awt.Color.blue);
            C4.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            C5.setBackground(java.awt.Color.red);
            C5.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            C5.setBackground(java.awt.Color.blue);
            C5.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            C6.setBackground(java.awt.Color.red);
            C6.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            C6.setBackground(java.awt.Color.blue);
            C6.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_C6ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            C7.setBackground(java.awt.Color.red);
            C7.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            C7.setBackground(java.awt.Color.blue);
            C7.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER RED"))
        {
            C8.setBackground(java.awt.Color.red);
            C8.setText(Player1);
            jLabel4.setText("PLAYER BLUE");
        }else
        if(jLabel4.getText().equals("PLAYER BLUE"))
        {
            C8.setBackground(java.awt.Color.blue);
            C8.setText(Player2);
            jLabel4.setText("PLAYER RED");
        }
        RedWinner();
        BlueWinner();
        Draw();
    }//GEN-LAST:event_C8ActionPerformed

    private void RedWinner()
    {
        if(A1.getText().equals(Player1) && A2.getText().equals(Player1) && A3.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(A3.getText().equals(Player1) && A4.getText().equals(Player1) && A5.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(A5.getText().equals(Player1) && A6.getText().equals(Player1) && A7.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(A7.getText().equals(Player1) && A8.getText().equals(Player1) && A1.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(B1.getText().equals(Player1) && B2.getText().equals(Player1) && B3.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(B3.getText().equals(Player1) && B4.getText().equals(Player1) && B5.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(B5.getText().equals(Player1) && B6.getText().equals(Player1) && B7.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(B7.getText().equals(Player1) && B8.getText().equals(Player1) && B1.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(C1.getText().equals(Player1) && C2.getText().equals(Player1) && C3.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(C3.getText().equals(Player1) && C4.getText().equals(Player1) && C5.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(C5.getText().equals(Player1) && C6.getText().equals(Player1) && C7.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(C7.getText().equals(Player1) && C8.getText().equals(Player1) && C1.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(A1.getText().equals(Player1) && B1.getText().equals(Player1) && C1.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(A2.getText().equals(Player1) && B2.getText().equals(Player1) && C2.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(A3.getText().equals(Player1) && B3.getText().equals(Player1) && C3.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(A4.getText().equals(Player1) && B4.getText().equals(Player1) && C4.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(A5.getText().equals(Player1) && B5.getText().equals(Player1) && C5.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(A6.getText().equals(Player1) && B6.getText().equals(Player1) && C6.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(A7.getText().equals(Player1) && B7.getText().equals(Player1) && C7.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
        if(A8.getText().equals(Player1) && B8.getText().equals(Player1) && C8.getText().equals(Player1))
        {
            JOptionPane.showMessageDialog(null, "PLAYER RED WINS");
            System.exit(0);
        }
    }
    
    private void BlueWinner()
    {
        if(A1.getText().equals(Player2) && A2.getText().equals(Player2) && A3.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(A3.getText().equals(Player2) && A4.getText().equals(Player2) && A5.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(A5.getText().equals(Player2) && A6.getText().equals(Player2) && A7.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(A7.getText().equals(Player2) && A8.getText().equals(Player2) && A1.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(B1.getText().equals(Player2) && B2.getText().equals(Player2) && B3.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(B3.getText().equals(Player2) && B4.getText().equals(Player2) && B5.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(B5.getText().equals(Player2) && B6.getText().equals(Player2) && B7.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(B7.getText().equals(Player2) && B8.getText().equals(Player2) && B1.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(C1.getText().equals(Player2) && C2.getText().equals(Player2) && C3.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(C3.getText().equals(Player2) && C4.getText().equals(Player2) && C5.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(C5.getText().equals(Player2) && C6.getText().equals(Player2) && C7.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(C7.getText().equals(Player2) && C8.getText().equals(Player2) && C1.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(A1.getText().equals(Player2) && B1.getText().equals(Player2) && C1.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(A2.getText().equals(Player2) && B2.getText().equals(Player2) && C2.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(A3.getText().equals(Player2) && B3.getText().equals(Player2) && C3.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(A4.getText().equals(Player2) && B4.getText().equals(Player2) && C4.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(A5.getText().equals(Player2) && B5.getText().equals(Player2) && C5.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(A6.getText().equals(Player2) && B6.getText().equals(Player2) && C6.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(A7.getText().equals(Player2) && B7.getText().equals(Player2) && C7.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
        if(A8.getText().equals(Player2) && B8.getText().equals(Player2) && C8.getText().equals(Player2))
        {
            JOptionPane.showMessageDialog(null, "PLAYER BLUE WINS");
            System.exit(0);
        }
    }
    
    private void Draw()
    {
        if(count > 24)
        {
            JOptionPane.showMessageDialog(null, "DRAW");
            System.exit(0);;
        }
    }
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton BLU;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton RD;
    private javax.swing.JButton Start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
