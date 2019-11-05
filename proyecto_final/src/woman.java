
import javax.swing.JOptionPane;

public class woman extends javax.swing.JFrame {
    int contE=0;
    int contN=0;
    int contM=0;
    int contB=0;
    int contF=0;
    int contH=0;
    public woman() {
        initComponents();
        this.setLocationRelativeTo(null);
        bf1.setVisible(true);
        bf2.setVisible(false);
        bf3.setVisible(false);
        mf1.setVisible(true);
        mf2.setVisible(false);
        mf3.setVisible(false);
        ef1.setVisible(true);
        ef2.setVisible(false);
        ef3.setVisible(false);
        ff1.setVisible(true);
        ff2.setVisible(false);
        ff3.setVisible(false);
        hf1.setVisible(true);
        hf2.setVisible(false);
        hf3.setVisible(false);
        nf1.setVisible(true);
        nf2.setVisible(false);
        nf3.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ef1 = new javax.swing.JLabel();
        ef2 = new javax.swing.JLabel();
        ef3 = new javax.swing.JLabel();
        nf1 = new javax.swing.JLabel();
        nf2 = new javax.swing.JLabel();
        nf3 = new javax.swing.JLabel();
        bf1 = new javax.swing.JLabel();
        bf2 = new javax.swing.JLabel();
        bf3 = new javax.swing.JLabel();
        hf1 = new javax.swing.JLabel();
        hf2 = new javax.swing.JLabel();
        hf3 = new javax.swing.JLabel();
        mf1 = new javax.swing.JLabel();
        mf2 = new javax.swing.JLabel();
        mf3 = new javax.swing.JLabel();
        ff1 = new javax.swing.JLabel();
        ff2 = new javax.swing.JLabel();
        ff3 = new javax.swing.JLabel();
        EFback = new javax.swing.JButton();
        EFnext = new javax.swing.JButton();
        NFback = new javax.swing.JButton();
        NFnext = new javax.swing.JButton();
        BFback = new javax.swing.JButton();
        BFnext = new javax.swing.JButton();
        FFback = new javax.swing.JButton();
        FFnext = new javax.swing.JButton();
        HFback = new javax.swing.JButton();
        HFnext = new javax.swing.JButton();
        MFback = new javax.swing.JButton();
        MFnext = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        BtSearch = new javax.swing.JButton();
        JBmenu = new javax.swing.JButton();
        jfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("EYES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("NOUSE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("EYES BROWN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("HAIR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("WOMAN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("MOUTH");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        ef1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/Ojos_1_sin_fondo.png"))); // NOI18N
        ef1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ef1MouseDragged(evt);
            }
        });
        jPanel1.add(ef1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        ef2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/ojos_mujer_2_sin_fondo.png"))); // NOI18N
        ef2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ef2MouseDragged(evt);
            }
        });
        jPanel1.add(ef2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        ef3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/ojos_mujer_3_sin_fondo.png"))); // NOI18N
        ef3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ef3MouseDragged(evt);
            }
        });
        jPanel1.add(ef3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        nf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/nariz_mujer_1.png"))); // NOI18N
        nf1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                nf1MouseDragged(evt);
            }
        });
        jPanel1.add(nf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        nf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/nariz_mujer_2_sin_fondo.png"))); // NOI18N
        nf2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                nf2MouseDragged(evt);
            }
        });
        jPanel1.add(nf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        nf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/nariz_mujer_3_sin_fondo.png"))); // NOI18N
        nf3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                nf3MouseDragged(evt);
            }
        });
        jPanel1.add(nf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        bf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/cejas_1_sin_fondo.png"))); // NOI18N
        bf1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bf1MouseDragged(evt);
            }
        });
        jPanel1.add(bf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        bf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/cejas_mujer_2_sin_fondo.png"))); // NOI18N
        bf2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bf2MouseDragged(evt);
            }
        });
        jPanel1.add(bf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        bf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/cejas_mujer_3_sin_fondo.png"))); // NOI18N
        bf3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bf3MouseDragged(evt);
            }
        });
        jPanel1.add(bf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        hf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/pelo_mujer_1.png"))); // NOI18N
        hf1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                hf1MouseDragged(evt);
            }
        });
        jPanel1.add(hf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        hf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/pelo_mujer_2.png"))); // NOI18N
        hf2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                hf2MouseDragged(evt);
            }
        });
        jPanel1.add(hf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        hf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/pelo_mujer_3.png"))); // NOI18N
        hf3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                hf3MouseDragged(evt);
            }
        });
        jPanel1.add(hf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));

        mf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/boca_mujer_1_sin_fondo.png"))); // NOI18N
        mf1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mf1MouseDragged(evt);
            }
        });
        jPanel1.add(mf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        mf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/boca_mujer_2_sin_fondo.png"))); // NOI18N
        mf2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mf2MouseDragged(evt);
            }
        });
        jPanel1.add(mf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        mf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/boca_mujer_3_sin_fondo.png"))); // NOI18N
        mf3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mf3MouseDragged(evt);
            }
        });
        jPanel1.add(mf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        ff1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/rostro_mujer_1_sin_rasgos_si.png"))); // NOI18N
        ff1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ff1MouseDragged(evt);
            }
        });
        jPanel1.add(ff1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        ff2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/rostro_mujer_2_sin_rasgos.png"))); // NOI18N
        ff2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ff2MouseDragged(evt);
            }
        });
        jPanel1.add(ff2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        ff3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/rostro_mujer_3_sin_rasgos.png"))); // NOI18N
        ff3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ff3MouseDragged(evt);
            }
        });
        jPanel1.add(ff3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        EFback.setText("BACK");
        EFback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EFbackMouseClicked(evt);
            }
        });
        EFback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EFbackActionPerformed(evt);
            }
        });
        jPanel1.add(EFback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        EFnext.setText("NEXT");
        EFnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EFnextMouseClicked(evt);
            }
        });
        jPanel1.add(EFnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        NFback.setText("BACK");
        NFback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NFbackMouseClicked(evt);
            }
        });
        NFback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NFbackActionPerformed(evt);
            }
        });
        jPanel1.add(NFback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        NFnext.setText("NEXT");
        NFnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NFnextMouseClicked(evt);
            }
        });
        NFnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NFnextActionPerformed(evt);
            }
        });
        jPanel1.add(NFnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        BFback.setText("BACK");
        BFback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BFbackMouseClicked(evt);
            }
        });
        BFback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFbackActionPerformed(evt);
            }
        });
        jPanel1.add(BFback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, -1));

        BFnext.setText("NEXT");
        BFnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BFnextMouseClicked(evt);
            }
        });
        BFnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFnextActionPerformed(evt);
            }
        });
        jPanel1.add(BFnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, -1, -1));

        FFback.setText("BACK");
        FFback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FFbackMouseClicked(evt);
            }
        });
        FFback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FFbackActionPerformed(evt);
            }
        });
        jPanel1.add(FFback, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        FFnext.setText("NEXT");
        FFnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FFnextMouseClicked(evt);
            }
        });
        FFnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FFnextActionPerformed(evt);
            }
        });
        jPanel1.add(FFnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        HFback.setText("BACK");
        HFback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HFbackMouseClicked(evt);
            }
        });
        HFback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HFbackActionPerformed(evt);
            }
        });
        jPanel1.add(HFback, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, -1, -1));

        HFnext.setText("NEXT");
        HFnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HFnextMouseClicked(evt);
            }
        });
        HFnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HFnextActionPerformed(evt);
            }
        });
        jPanel1.add(HFnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, -1, -1));

        MFback.setText("BACK");
        MFback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MFbackMouseClicked(evt);
            }
        });
        jPanel1.add(MFback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        MFnext.setText("NEXT");
        MFnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MFnextMouseClicked(evt);
            }
        });
        jPanel1.add(MFnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        exit.setBackground(new java.awt.Color(153, 0, 0));
        exit.setForeground(new java.awt.Color(240, 240, 240));
        exit.setText("EXIT");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, -1, -1));

        BtSearch.setText("Search");
        BtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtSearchMouseClicked(evt);
            }
        });
        jPanel1.add(BtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, -1, -1));

        JBmenu.setBackground(new java.awt.Color(153, 0, 0));
        JBmenu.setForeground(new java.awt.Color(240, 240, 240));
        JBmenu.setText("MENU");
        JBmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBmenuMouseClicked(evt);
            }
        });
        JBmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmenuActionPerformed(evt);
            }
        });
        jPanel1.add(JBmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 630, -1, -1));

        jfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dactilar.png"))); // NOI18N
        jPanel1.add(jfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EFbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EFbackActionPerformed
    }//GEN-LAST:event_EFbackActionPerformed

    private void NFbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NFbackActionPerformed
    }//GEN-LAST:event_NFbackActionPerformed

    private void NFnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NFnextActionPerformed
    }//GEN-LAST:event_NFnextActionPerformed

    private void BFbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFbackActionPerformed
    }//GEN-LAST:event_BFbackActionPerformed

    private void BFnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFnextActionPerformed
    }//GEN-LAST:event_BFnextActionPerformed

    private void FFbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FFbackActionPerformed
    }//GEN-LAST:event_FFbackActionPerformed

    private void FFnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FFnextActionPerformed
    }//GEN-LAST:event_FFnextActionPerformed

    private void HFbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HFbackActionPerformed
    }//GEN-LAST:event_HFbackActionPerformed

    private void HFnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HFnextActionPerformed
    }//GEN-LAST:event_HFnextActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
    System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void JBmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBmenuMouseClicked
        genero obj7 =new genero();
        obj7.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_JBmenuMouseClicked

    private void JBmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmenuActionPerformed
    }//GEN-LAST:event_JBmenuActionPerformed

    private void EFbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EFbackMouseClicked
        if (contE==0) {
            ef1.setVisible(true);
            ef2.setVisible(false);
            ef3.setVisible(false);
        }
        else if (contE==1) {
            ef1.setVisible(true);
            ef2.setVisible(false);
            ef3.setVisible(false);
            contE=contE-1;
        }
        else if (contE==2) {
            ef1.setVisible(false);
            ef2.setVisible(true);
            ef3.setVisible(false);
            contE=contE-1;
        }
    }//GEN-LAST:event_EFbackMouseClicked

    private void EFnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EFnextMouseClicked

        if (contE==0) {
            ef1.setVisible(false);
            ef2.setVisible(true);
            ef3.setVisible(false);
            contE=contE+1;
        }
        else if (contE==1) {
            ef1.setVisible(false);
            ef2.setVisible(false);
            ef3.setVisible(true);
            contE=contE+1;
        }
        else if (contE==2) {
            ef1.setVisible(false);
            ef2.setVisible(false);
            ef3.setVisible(true);        
        }
    }//GEN-LAST:event_EFnextMouseClicked

    private void NFbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NFbackMouseClicked
        
        if (contN==0) {
            nf1.setVisible(true);
            nf2.setVisible(false);
            nf3.setVisible(false);
        }
        else if (contN==1) {
            nf1.setVisible(true);
            nf2.setVisible(false);
            nf3.setVisible(false);
            contN=contN-1;
        }
        else if (contN==2) {
            nf1.setVisible(false);
            nf2.setVisible(true);
            nf3.setVisible(false);
            contN=contN-1;
        }
    }//GEN-LAST:event_NFbackMouseClicked

    private void NFnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NFnextMouseClicked
        // TODO add your handling code here:
        if (contN==0) {
            nf1.setVisible(false);
            nf2.setVisible(true);
            nf3.setVisible(false);
            contN=contN+1;
        }
        else if (contN==1) {
            nf1.setVisible(false);
            nf2.setVisible(false);
            nf3.setVisible(true);
            contN=contN+1;
        }
        else if (contN==2) {
            nf1.setVisible(false);
            nf2.setVisible(false);
            nf3.setVisible(true);        
        }
    }//GEN-LAST:event_NFnextMouseClicked

    private void MFbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MFbackMouseClicked
        // TODO add your handling code here:
        if (contM==0) {
            mf1.setVisible(true);
            mf2.setVisible(false);
            mf3.setVisible(false);
        }
        else if (contM==1) {
            mf1.setVisible(true);
            mf2.setVisible(false);
            mf3.setVisible(false);
            contM=contM-1;
        }
        else if (contM==2) {
            mf1.setVisible(false);
            mf2.setVisible(true);
            mf3.setVisible(false);
            contM=contM-1;
        }
    }//GEN-LAST:event_MFbackMouseClicked

    private void MFnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MFnextMouseClicked
        // TODO add your handling code here:
        if (contM==0) {
            mf1.setVisible(false);
            mf2.setVisible(true);
            mf3.setVisible(false);
            contM=contM+1;
        }
        else if (contM==1) {
            mf1.setVisible(false);
            mf2.setVisible(false);
            mf3.setVisible(true);
            contM=contM+1;
        }
        else if (contM==2) {
            mf1.setVisible(false);
            mf2.setVisible(false);
            mf3.setVisible(true);        
        }
    }//GEN-LAST:event_MFnextMouseClicked

    private void BFbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BFbackMouseClicked
        // TODO add your handling code here:
         if (contB==0) {
            bf1.setVisible(true);
            bf2.setVisible(false);
            bf3.setVisible(false);
        }
        else if (contB==1) {
            bf1.setVisible(true);
            bf2.setVisible(false);
            bf3.setVisible(false);
            contB=contB-1;
        }
        else if (contB==2) {
            bf1.setVisible(false);
            bf2.setVisible(true);
            bf3.setVisible(false);
            contB=contB-1;
        }
    }//GEN-LAST:event_BFbackMouseClicked

    private void BFnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BFnextMouseClicked

        if (contB==0) {
            bf1.setVisible(false);
            bf2.setVisible(true);
            bf3.setVisible(false);
            contB=contB+1;
        }
        else if (contB==1) {
            bf1.setVisible(false);
            bf2.setVisible(false);
            bf3.setVisible(true);
            contB=contB+1;
        }
        else if (contB==2) {
            bf1.setVisible(false);
            bf2.setVisible(false);
            bf3.setVisible(true);        
        }
    }//GEN-LAST:event_BFnextMouseClicked

    private void FFbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFbackMouseClicked
        
         if (contF==0) {
            ff1.setVisible(true);
            ff2.setVisible(false);
            ff3.setVisible(false);
        }
        else if (contF==1) {
            ff1.setVisible(true);
            ff2.setVisible(false);
            ff3.setVisible(false);
            contF=contF-1;
        }
        else if (contF==2) {
            ff1.setVisible(false);
            ff2.setVisible(true);
            ff3.setVisible(false);
            contF=contF-1;
        }
    }//GEN-LAST:event_FFbackMouseClicked

    private void FFnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFnextMouseClicked
        
       if (contF==0) {
            ff1.setVisible(false);
            ff2.setVisible(true);
            ff3.setVisible(false);
            contF=contF+1;
        }
        else if (contF==1) {
            ff1.setVisible(false);
            ff2.setVisible(false);
            ff3.setVisible(true);
            contF=contF+1;
        }
        else if (contF==2) {
            ff1.setVisible(false);
            ff2.setVisible(false);
            ff3.setVisible(true);        
        } 
    }//GEN-LAST:event_FFnextMouseClicked

    private void HFbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HFbackMouseClicked
        // TODO add your handling code here:
        if (contH==0) {
            hf1.setVisible(true);
            hf2.setVisible(false);
            hf3.setVisible(false);
        }
        else if (contH==1) {
            hf1.setVisible(true);
            hf2.setVisible(false);
            hf3.setVisible(false);
            contH=contH-1;
        }
        else if (contH==2) {
            hf1.setVisible(false);
            hf2.setVisible(true);
            hf3.setVisible(false);
            contH=contH-1;
        }
    }//GEN-LAST:event_HFbackMouseClicked

    private void HFnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HFnextMouseClicked
        // TODO add your handling code here:
        if (contH==0) {
            hf1.setVisible(false);
            hf2.setVisible(true);
            hf3.setVisible(false);
            contH=contH+1;
        }
        else if (contH==1) {
            hf1.setVisible(false);
            hf2.setVisible(false);
            hf3.setVisible(true);
            contH=contH+1;
        }
        else if (contH==2) {
            hf1.setVisible(false);
            hf2.setVisible(false);
            hf3.setVisible(true);        
        } 
    }//GEN-LAST:event_HFnextMouseClicked

    private void ef1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ef1MouseDragged
        Mouse robot = new Mouse();
        ef1.setLocation(robot.thisX()-ef1.getWidth()-(ef1.getX()/2), robot.thisY()-ef1.getHeight());     }//GEN-LAST:event_ef1MouseDragged

    private void ef3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ef3MouseDragged
        Mouse robot = new Mouse();
        ef3.setLocation(robot.thisX()-ef3.getWidth()-(ef3.getX()/2), robot.thisY()-ef3.getHeight());      }//GEN-LAST:event_ef3MouseDragged

    private void ef2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ef2MouseDragged
        Mouse robot = new Mouse();
        ef2.setLocation(robot.thisX()-ef2.getWidth()-(ef2.getX()/2), robot.thisY()-ef2.getHeight());      }//GEN-LAST:event_ef2MouseDragged

    private void nf1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nf1MouseDragged
        Mouse robot = new Mouse();
        nf1.setLocation(robot.thisX()-nf1.getWidth()-(nf1.getX()/2), robot.thisY()-nf1.getHeight());      }//GEN-LAST:event_nf1MouseDragged

    private void nf2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nf2MouseDragged
        Mouse robot = new Mouse();
        nf2.setLocation(robot.thisX()-nf2.getWidth()-(nf2.getX()/2), robot.thisY()-nf2.getHeight());    }//GEN-LAST:event_nf2MouseDragged

    private void nf3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nf3MouseDragged
        Mouse robot = new Mouse();
        nf3.setLocation(robot.thisX()-nf3.getWidth()-(nf3.getX()/2), robot.thisY()-nf3.getHeight());    }//GEN-LAST:event_nf3MouseDragged

    private void bf1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bf1MouseDragged
        Mouse robot = new Mouse();
        bf1.setLocation(robot.thisX()-bf1.getWidth()-(bf1.getX()/2), robot.thisY()-bf1.getHeight());    }//GEN-LAST:event_bf1MouseDragged

    private void bf2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bf2MouseDragged
        Mouse robot = new Mouse();
        bf2.setLocation(robot.thisX()-bf2.getWidth()-(bf2.getX()/2), robot.thisY()-bf2.getHeight());    }//GEN-LAST:event_bf2MouseDragged

    private void bf3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bf3MouseDragged
        Mouse robot = new Mouse();
        bf3.setLocation(robot.thisX()-bf3.getWidth()-(bf3.getX()/2), robot.thisY()-bf3.getHeight());    }//GEN-LAST:event_bf3MouseDragged

    private void hf1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hf1MouseDragged
        Mouse robot = new Mouse();
        hf1.setLocation(robot.thisX()-hf1.getWidth()-(hf1.getX()/2), robot.thisY()-hf1.getHeight());    }//GEN-LAST:event_hf1MouseDragged

    private void hf2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hf2MouseDragged
        Mouse robot = new Mouse();
        hf2.setLocation(robot.thisX()-hf2.getWidth()-(hf2.getX()/2), robot.thisY()-hf2.getHeight());    }//GEN-LAST:event_hf2MouseDragged

    private void hf3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hf3MouseDragged
        Mouse robot = new Mouse();
        hf3.setLocation(robot.thisX()-hf3.getWidth()-(hf3.getX()/2), robot.thisY()-hf3.getHeight());    }//GEN-LAST:event_hf3MouseDragged

    private void mf1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mf1MouseDragged
        Mouse robot = new Mouse();
        mf1.setLocation(robot.thisX()-mf1.getWidth()-(mf1.getX()/2), robot.thisY()-mf1.getHeight());    }//GEN-LAST:event_mf1MouseDragged

    private void mf2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mf2MouseDragged
        Mouse robot = new Mouse();
        mf2.setLocation(robot.thisX()-mf2.getWidth()-(mf2.getX()/2), robot.thisY()-mf2.getHeight());    }//GEN-LAST:event_mf2MouseDragged

    private void mf3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mf3MouseDragged
        Mouse robot = new Mouse();
        mf3.setLocation(robot.thisX()-mf3.getWidth()-(mf3.getX()/2), robot.thisY()-mf3.getHeight());    }//GEN-LAST:event_mf3MouseDragged

    private void ff1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ff1MouseDragged
        Mouse robot = new Mouse();
        ff1.setLocation(robot.thisX()-ff1.getWidth()-(ff1.getX()/2), robot.thisY()-ff1.getHeight());    }//GEN-LAST:event_ff1MouseDragged

    private void ff2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ff2MouseDragged
        Mouse robot = new Mouse();
        ff2.setLocation(robot.thisX()-ff2.getWidth()-(ff2.getX()/2), robot.thisY()-ff2.getHeight());    }//GEN-LAST:event_ff2MouseDragged

    private void ff3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ff3MouseDragged
        Mouse robot = new Mouse();
        ff3.setLocation(robot.thisX()-ff3.getWidth()-(ff3.getX()/2), robot.thisY()-ff3.getHeight());    }//GEN-LAST:event_ff3MouseDragged

    private void BtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtSearchMouseClicked
        String z=name();
        SearchFemeale file = new SearchFemeale();
        file.arch(z);
        JOptionPane.showMessageDialog(null, "Thanks, your result is in the destination folder 'Destino' ");
        login logeo = new login();
        this.dispose();
        logeo.setVisible(true);
    }//GEN-LAST:event_BtSearchMouseClicked
 
    public String name(){
        String rut="";
        if (hf1.isVisible()==true) rut=rut+"hf1";
        if (hf2.isVisible()==true) rut=rut+"hf2";
        if (hf3.isVisible()==true) rut=rut+"hf3";
        if (bf1.isVisible()==true) rut=rut+"bf1";
        if (bf2.isVisible()==true) rut=rut+"bf2";
        if (bf3.isVisible()==true) rut=rut+"bf3";
        if (ef1.isVisible()==true) rut=rut+"ef1";
        if (ef2.isVisible()==true) rut=rut+"ef2";
        if (ef3.isVisible()==true) rut=rut+"ef3";
        if (nf1.isVisible()==true) rut=rut+"nf1";
        if (nf2.isVisible()==true) rut=rut+"nf2";
        if (nf3.isVisible()==true) rut=rut+"nf3";
        if (mf1.isVisible()==true) rut=rut+"mf1";
        if (mf2.isVisible()==true) rut=rut+"mf2";
        if (mf3.isVisible()==true) rut=rut+"mf3";
        if (ff1.isVisible()==true) rut=rut+"ff1";
        if (ff2.isVisible()==true) rut=rut+"ff2";
        if (ff3.isVisible()==true) rut=rut+"ff3";
        return rut;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new man().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFback;
    private javax.swing.JButton BFnext;
    private javax.swing.JButton BtSearch;
    private javax.swing.JButton EFback;
    private javax.swing.JButton EFnext;
    private javax.swing.JButton FFback;
    private javax.swing.JButton FFnext;
    private javax.swing.JButton HFback;
    private javax.swing.JButton HFnext;
    private javax.swing.JButton JBmenu;
    private javax.swing.JButton MFback;
    private javax.swing.JButton MFnext;
    private javax.swing.JButton NFback;
    private javax.swing.JButton NFnext;
    private javax.swing.JLabel bf1;
    private javax.swing.JLabel bf2;
    private javax.swing.JLabel bf3;
    private javax.swing.JLabel ef1;
    private javax.swing.JLabel ef2;
    private javax.swing.JLabel ef3;
    private javax.swing.JButton exit;
    private javax.swing.JLabel ff1;
    private javax.swing.JLabel ff2;
    private javax.swing.JLabel ff3;
    private javax.swing.JLabel hf1;
    private javax.swing.JLabel hf2;
    private javax.swing.JLabel hf3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jfondo;
    private javax.swing.JLabel mf1;
    private javax.swing.JLabel mf2;
    private javax.swing.JLabel mf3;
    private javax.swing.JLabel nf1;
    private javax.swing.JLabel nf2;
    private javax.swing.JLabel nf3;
    // End of variables declaration//GEN-END:variables
}
