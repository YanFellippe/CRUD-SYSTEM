/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sistemacursosonline;

import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroCurso extends javax.swing.JInternalFrame {
    String id_curso;
    String situação;
    public CadastroCurso() {
        initComponents();
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CadastroPessoaCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        turma = new javax.swing.JTextField();
        qtdAluno = new javax.swing.JTextField();
        cargaHoraria = new javax.swing.JTextField();
        cadCurso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        dataFim = new com.toedter.calendar.JDateChooser();
        btnEditar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        situacao = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Cursos");

        jLabel1.setText("Descrição:");

        jLabel2.setText("Turma:");

        jLabel3.setText("Quantidade de Alunos:");

        jLabel4.setText("Carga Horária:");

        jLabel6.setText("Data Fim");

        cadCurso.setText("CADASTRAR CURSO");
        cadCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadCursoMouseClicked(evt);
            }
        });
        cadCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCursoActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "TURMA", "QTD ALUNOS", "CARGA HORÁRIA", "DATA INÍCIO", "DATA FIM", "SITUAÇÃO"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel7.setText("Situação:");

        btnEditar.setText("EDITAR CURSO");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnListar.setText("LISTAR CURSOS");
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
        });

        btnRemover.setText("EXCLUIR CURSO");
        btnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverMouseClicked(evt);
            }
        });

        situacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ativo", "Inativo" }));
        situacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                situacaoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemover))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(dataFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(qtdAluno))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cargaHoraria))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turma, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(qtdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadCurso)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListar)
                    .addComponent(btnRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadCursoMouseClicked
                                        
            try {
                SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
                String data = dataFormatada.format(dataFim.getDate());
                int qtdAlunos = Integer.parseInt(qtdAluno.getText());
                Connection con = BancoClass.conexaoBanco();
                String sql = "INSERT INTO curso(descricao, turma, qtd_alunos, carga_horaria, data_fim, situacao) VALUES(?,?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, descricao.getText());
                stmt.setString(2, turma.getText());
                stmt.setInt(3, qtdAlunos);
                stmt.setString(4, cargaHoraria.getText());
                stmt.setTimestamp(5, new java.sql.Timestamp(dataFim.getDate().getTime()));
                stmt.setString(6, situação);
                stmt.execute();
                
                con.close();
                stmt.close();
                JOptionPane.showMessageDialog(rootPane, "Curso cadastrado com sucesso!");
                descricao.setText(null);
                turma.setText(null);
                qtdAluno.setText(null);
                cargaHoraria.setText(null);
                situacao.setSelectedItem(" ");
                dataFim.setDate(null);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroCurso.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Curso não cadastrado!");
            }
        try {  
            Connection con = BancoClass.conexaoBanco();
            String sql = "SELECT * FROM curso ORDER BY id_curso DESC;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
            modeloTabela.setNumRows(0);
            while(rs.next()){
                Object [] dados = {
                    rs.getString("id_curso"),
                    rs.getString("descricao"),
                    rs.getString("turma"),
                    rs.getString("qtd_alunos"),
                    rs.getString("carga_horaria"),
                    rs.getString("data_inicio"),
                    rs.getString("data_fim"),
                    rs.getString("situacao")};
                modeloTabela.addRow(dados);
            }
            stmt.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCurso.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Curso não registrado!");

        }
    }//GEN-LAST:event_cadCursoMouseClicked

    private void cadCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadCursoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked
        try {  
            Connection con = BancoClass.conexaoBanco();
            String sql = "SELECT * FROM curso ORDER BY id_curso DESC;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
            modeloTabela.setNumRows(0);
            while(rs.next()){
                Object [] dados = {
                    rs.getString("id_curso"),
                    rs.getString("descricao"),
                    rs.getString("turma"),
                    rs.getString("qtd_alunos"),
                    rs.getString("carga_horaria"),
                    rs.getString("data_inicio"),
                    rs.getString("data_fim"),
                    rs.getString("situacao")};
                modeloTabela.addRow(dados);
            }
            stmt.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCurso.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Curso não registrado!");

        }
    }//GEN-LAST:event_btnListarMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    String situacaos;
    id_curso = (table.getValueAt(table.getSelectedRow(), 0)).toString();
    descricao.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
    turma.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
    qtdAluno.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
    cargaHoraria.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
    situacaos = (table.getValueAt(table.getSelectedRow(), 7).toString());
        if(situacaos.equals("A")){
            situacao.setSelectedItem("Ativo");
        }else if(situacaos.equals("I")){
            situacao.setSelectedItem("Inativo");
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        try {
        Connection con = BancoClass.conexaoBanco();
        String sql = "UPDATE curso SET descricao = ?, turma = ?, qtd_alunos = ?, carga_horaria = ?, situacao = ? WHERE id_curso = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, descricao.getText());
        stmt.setString(2, turma.getText());
        stmt.setString(3, qtdAluno.getText());
        stmt.setString(4, cargaHoraria.getText());
        stmt.setString(5, situação);
        stmt.setString(6, id_curso);

        int rowsAffected = stmt.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(rootPane, "Curso editado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum curso foi encontrado para edição.");
        }

        String selectSql = "SELECT * FROM curso ORDER BY id_curso DESC;";
        PreparedStatement selectStmt = con.prepareStatement(selectSql);
        ResultSet rs = selectStmt.executeQuery();
        DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
        modeloTabela.setNumRows(0);

        while (rs.next()) {
            Object[] dados = {
                rs.getString("id_curso"),
                rs.getString("descricao"),
                rs.getString("turma"),
                rs.getString("qtd_alunos"),
                rs.getString("carga_horaria"),
                rs.getString("data_inicio"),
                rs.getString("data_fim"),
                rs.getString("situacao")
            };
            modeloTabela.addRow(dados);
        }
        stmt.close();
        rs.close();
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(CadastroCurso.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(rootPane, "Erro ao editar o curso!");
    }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void situacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_situacaoItemStateChanged
        if(situacao.getSelectedItem().equals("Ativo")){
            situação = "A";
        } else if (situacao.getSelectedItem().equals("Inativo")){
            situação = "I";
        } else {
            situação = " ";
        }
    }//GEN-LAST:event_situacaoItemStateChanged

    private void btnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseClicked
    int selectedRow = table.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(rootPane, "Selecione um curso para remover.");
        return;
    }
    int confirm = JOptionPane.showConfirmDialog(rootPane, 
        "Tem certeza de que deseja remover este curso?", 
        "Confirmação", 
        JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.NO_OPTION) {
        return;
    }
    try {
        String idCurso = table.getValueAt(selectedRow, 0).toString();
        Connection con = BancoClass.conexaoBanco();
        String sql = "DELETE FROM curso WHERE id_curso = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, idCurso);

        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(rootPane, "Curso removido com sucesso!");
            DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
            modeloTabela.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao remover o curso.");
        }
        String selectSql = "SELECT * FROM curso ORDER BY id_curso DESC;";
        PreparedStatement selectStmt = con.prepareStatement(selectSql);
        ResultSet rs = selectStmt.executeQuery();
        DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
        modeloTabela.setNumRows(0);

        while (rs.next()) {
            Object[] dados = {
                rs.getString("id_curso"),
                rs.getString("descricao"),
                rs.getString("turma"),
                rs.getString("qtd_alunos"),
                rs.getString("carga_horaria"),
                rs.getString("data_inicio"),
                rs.getString("data_fim"),
                rs.getString("situacao")
            };
            modeloTabela.addRow(dados);
        }
        stmt.close();
        rs.close();
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(CadastroCurso.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(rootPane, "Erro ao remover o curso: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnRemoverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton cadCurso;
    private javax.swing.JTextField cargaHoraria;
    private com.toedter.calendar.JDateChooser dataFim;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qtdAluno;
    private javax.swing.JComboBox<String> situacao;
    private javax.swing.JTable table;
    private javax.swing.JTextField turma;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
