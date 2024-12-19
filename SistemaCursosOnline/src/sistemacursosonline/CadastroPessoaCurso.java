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
import java.util.logging.Level;
import java.util.logging.Logger;
public class CadastroPessoaCurso extends javax.swing.JInternalFrame {

    String situação;
    String id_curso_matricula;
    String idCursoMatricula;
    public CadastroPessoaCurso() {
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
        situacao = new javax.swing.JComboBox<>();
        idPessoa = new javax.swing.JTextField();
        idCurso = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CADASTROS EM CURSOS");

        jLabel1.setText("Situação:");

        jLabel2.setText("Identificação da Pessoa:");

        jLabel3.setText("Identificação do Curso:");

        situacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ativo", "Inativo" }));
        situacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                situacaoItemStateChanged(evt);
            }
        });

        btnAdicionar.setText("MATRICULAR");
        btnAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarMouseClicked(evt);
            }
        });
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICAÇÃO DA MATRÍCULA", "Situação", "Identificação Pessoal", "Identificação do Curso"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel5.setText("Pessoas Cadastradas nos Cursos");

        btnEditar.setText("EDITAR");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnRemover.setText("REMOVER");
        btnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverMouseClicked(evt);
            }
        });

        btnListar.setText("LISTAR");
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
        });

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "cpf/cnpj", "Matricula", "Descricao", "Turma", "Carga Horaria", "Identificação Pessoal", "Identificação do Curso", "Situação"
            }
        ));
        jScrollPane4.setViewportView(table2);

        jLabel4.setText("Relação das Matrículas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(294, 294, 294))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 82, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(89, 89, 89)
                                    .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(idPessoa))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(idCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdicionar)
                                    .addComponent(btnListar))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEditar)
                                    .addComponent(btnRemover))))
                        .addGap(435, 435, 435)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnListar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void situacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_situacaoItemStateChanged
        if(situacao.getSelectedItem().equals("Ativo")){
            situação = "A";
        } else if (situacao.getSelectedItem().equals("Inativo")){
            situação = "I";
        } else {
            situação = " ";
        }
    }//GEN-LAST:event_situacaoItemStateChanged

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked
        try {
            Connection con = BancoClass.conexaoBanco();
            String sql = "SELECT * FROM curso_matriculas ORDER BY id_curso_matricula DESC;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) table1.getModel();
            modeloTabela.setNumRows(0);
            while(rs.next()){
                Object [] dados = {
                    rs.getString("id_curso_matricula"),
                    rs.getString("situacao"),
                    rs.getString("id_pessoa"),
                    rs.getString("id_curso")};
                modeloTabela.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Connection con = BancoClass.conexaoBanco();
            String sql = "SELECT * FROM matriculados;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) table2.getModel();
            modeloTabela.setNumRows(0);
            while(rs.next()){
                Object [] dados = {
                    rs.getString("nome"),
                    rs.getString("cpf_cnpj"),
                    rs.getString("matricula"),
                    rs.getString("descricao"),
                    rs.getString("turma"),
                    rs.getString("carga_horaria"),
                    rs.getString("id_pessoa"),
                    rs.getString("id_curso"),
                    rs.getString("situacao")};
                modeloTabela.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarMouseClicked

    private void btnAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMouseClicked
        try {
            Connection con = BancoClass.conexaoBanco();
            String sql = "INSERT INTO curso_matriculas(situacao, id_pessoa, id_curso) VALUES (?,?,?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, situação);
            stmt.setString(2, idPessoa.getText());
            stmt.setString(3, idCurso.getText());
            
            stmt.execute();
            con.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaCurso.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Pessoa não foi cadastrada no curso!");
        }
        
        try {
            Connection con = BancoClass.conexaoBanco();
            String sql = "SELECT * FROM curso_matriculas ORDER BY id_curso_matricula DESC;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) table1.getModel();
            modeloTabela.setNumRows(0);
            while(rs.next()){
                Object [] dados = {
                    rs.getString("id_curso_matricula"),
                    rs.getString("situacao"),
                    rs.getString("id_pessoa"),
                    rs.getString("id_curso")};
                modeloTabela.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Connection con = BancoClass.conexaoBanco();
            String sql = "SELECT * FROM matriculados;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) table2.getModel();
            modeloTabela.setNumRows(0);
            while(rs.next()){
                Object [] dados = {
                    rs.getString("nome"),
                    rs.getString("cpf_cnpj"),
                    rs.getString("matricula"),
                    rs.getString("descricao"),
                    rs.getString("turma"),
                    rs.getString("carga_horaria"),
                    rs.getString("id_pessoa"),
                    rs.getString("id_curso"),
                    rs.getString("situacao")};
                modeloTabela.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdicionarMouseClicked

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        idCursoMatricula = (table1.getValueAt(table1.getSelectedRow(), 0)).toString();
        String situacoes = (table1.getValueAt(table1.getSelectedRow(), 1).toString());
        idPessoa.setText(table1.getValueAt(table1.getSelectedRow(), 2).toString());
        idCurso.setText(table1.getValueAt(table1.getSelectedRow(), 3).toString());
        if(situacoes.equals("A")){
            situacao.setSelectedItem("Ativo");
        } else if(situacoes.equals("I")){
            situacao.setSelectedItem("Inativo");
        }
    }//GEN-LAST:event_table1MouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        try {
            Connection con = BancoClass.conexaoBanco();
            String sql = "UPDATE curso_matriculas SET situacao = ?, id_pessoa = ?, id_curso = ? WHERE id_curso_matricula = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, situação);
            stmt.setString(2, idPessoa.getText());
            stmt.setString(3, idCurso.getText());
            stmt.setString(4, idCursoMatricula);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(rootPane, "Pessoa editada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nenhuma pessoa foi encontrada para edição.");
            }

            String selectSql = "SELECT * FROM curso_matriculas ORDER BY id_curso_matricula DESC";
            PreparedStatement selectStmt = con.prepareStatement(selectSql);
            ResultSet rs = selectStmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) table1.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                Object[] dados = {
                    rs.getString("id_curso_matricula"),
                    rs.getString("situacao"),
                    rs.getString("id_pessoa"),
                    rs.getString("id_curso")};
                modeloTabela.addRow(dados);
            }

            rs.close();
            selectStmt.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseClicked
        try {
            if (id_curso_matricula == null || id_curso_matricula.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Selecione uma matrícula na tabela para remover.");
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(
                rootPane,
                "Tem certeza que deseja remover esta matrícula?",
                "Confirmação de Remoção",
                JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {
                Connection con = BancoClass.conexaoBanco();
                String sql = "DELETE FROM curso_matriculas WHERE id_curso_matricula = ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, id_curso_matricula);

                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Matrícula removida com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Nenhuma matrícula foi encontrada para remoção.");
                }

                stmt.close();
                con.close();
                btnListarMouseClicked(evt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaCurso.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao remover a matrícula.");
        }
    }//GEN-LAST:event_btnRemoverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JTextField idCurso;
    private javax.swing.JTextField idPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> situacao;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
