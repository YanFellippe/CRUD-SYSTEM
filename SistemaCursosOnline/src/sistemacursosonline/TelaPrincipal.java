
package sistemacursosonline;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadPessoas = new javax.swing.JMenuItem();
        cadPessoasCursos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cadCursos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1099, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        cadPessoas.setText("Cadastrar Pessoa");
        cadPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPessoasActionPerformed(evt);
            }
        });
        jMenu1.add(cadPessoas);

        cadPessoasCursos.setText("Cadastros dos Cursos");
        cadPessoasCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadPessoasCursosMouseClicked(evt);
            }
        });
        cadPessoasCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPessoasCursosActionPerformed(evt);
            }
        });
        jMenu1.add(cadPessoasCursos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cursos");

        cadCursos.setText("Cadastrar Cursos");
        cadCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCursosActionPerformed(evt);
            }
        });
        jMenu2.add(cadCursos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void cadPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPessoasActionPerformed
        CadastroPessoa cp = new CadastroPessoa();
        painel.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_cadPessoasActionPerformed

    private void cadCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCursosActionPerformed
        CadastroCurso cc = new CadastroCurso();
        painel.add(cc);
        cc.setVisible(true);
    }//GEN-LAST:event_cadCursosActionPerformed

    private void cadPessoasCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadPessoasCursosMouseClicked
        
    }//GEN-LAST:event_cadPessoasCursosMouseClicked

    private void cadPessoasCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPessoasCursosActionPerformed
        CadastroPessoaCurso cpc = new CadastroPessoaCurso();
        painel.add(cpc);
        cpc.setVisible(true);
    }//GEN-LAST:event_cadPessoasCursosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadCursos;
    private javax.swing.JMenuItem cadPessoas;
    private javax.swing.JMenuItem cadPessoasCursos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane painel;
    // End of variables declaration//GEN-END:variables
}
